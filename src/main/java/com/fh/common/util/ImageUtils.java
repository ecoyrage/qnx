package com.fh.common.util;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Transparency;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;

import sun.misc.BASE64Encoder;

public class ImageUtils {
	public static BufferedImage rotateImage(BufferedImage bufferedimage, int degree) {
		int w = bufferedimage.getWidth();
		int h = bufferedimage.getHeight();

		int xRot = w / 2;
		int yRot = w / 2;
		if (degree > 0) {
			xRot = h / 2;
			yRot = h / 2;
		}
		int nw = w;
		int nh = h;
		if (Math.abs(degree) % 180 > 0) {
			nw = h;
			nh = w;
		} else {
			xRot = w / 2;
			yRot = h / 2;
		}

		int type = bufferedimage.getColorModel().getTransparency();
		BufferedImage img;
		Graphics2D graphics2d = (img = new BufferedImage(nw, nh, type)).createGraphics();

		AffineTransform origXform = graphics2d.getTransform();
		AffineTransform newXform = (AffineTransform) origXform.clone();

		newXform.rotate(Math.toRadians(degree), xRot, yRot);

		graphics2d.setTransform(newXform);

		graphics2d.drawImage(bufferedimage, 0, 0, null);

		graphics2d.setTransform(origXform);
		graphics2d.dispose();

		return img;
	}

	public static byte[] resizeImage(byte[] image, int w, int h, String imageFormat) throws Exception {
		return resizeImageDefault(image, w, h, imageFormat);
	}

	private static BufferedImage toBufferedImage(Image image) {
		if ((image instanceof BufferedImage)) {
			return (BufferedImage) image;
		}

		image = new ImageIcon(image).getImage();

		BufferedImage bimage = null;
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		try {
			int transparency = 3;

			GraphicsDevice gs = ge.getDefaultScreenDevice();
			GraphicsConfiguration gc = gs.getDefaultConfiguration();
			bimage = gc.createCompatibleImage(image.getWidth(null), image.getHeight(null), transparency);
		} catch (HeadlessException localHeadlessException) {
		}
		if (bimage == null) {
			int type = 1;
			bimage = new BufferedImage(image.getWidth(null), image.getHeight(null), type);
		}

		Graphics g = bimage.createGraphics();

		g.drawImage(image, 0, 0, null);
		g.dispose();

		return bimage;
	}

	public static byte[] resizeImageDefault(byte[] image, int w, int h, String imageFormat) throws Exception {
		ByteArrayInputStream in = new ByteArrayInputStream(image);

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		BufferedImage inbi = null;

		BufferedImage outbi = null;
		try {
			inbi = ImageIO.read(in);

			if ((inbi.getWidth() == w) && (inbi.getHeight() == h)) {
				outbi = inbi;
			} else {
				if ((w == 0) || (h == 0)) {
					if ((w == 0) && (h == 0)) {
						throw new RuntimeException("图片压缩不能输入宽高都为0!");
					}

					if (w == 0)
						w = (int) (inbi.getWidth() * h / inbi.getHeight());
					else {
						h = (int) (inbi.getHeight() * w / inbi.getWidth());
					}

				}

				BufferedImage redrawImage = new BufferedImage(w, h, inbi.getType());

				redrawImage.getGraphics().drawImage(inbi.getScaledInstance(w, h, 4), 0, 0, null);

				redrawImage.getGraphics().dispose();

				outbi = redrawImage;
			}

			ImageIO.write(outbi, imageFormat, out);

			byte[] arrayOfByte = out.toByteArray();
			return arrayOfByte;
		} finally {
			if (inbi != null) {
				inbi.flush();
			}

			if (out != null) {
				out.close();
			}
			if (in != null)
				in.close();
		}
	}

	public static BufferedImage flipImage(BufferedImage bufferedimage) {
		int w = bufferedimage.getWidth();
		int h = bufferedimage.getHeight();
		BufferedImage img;
		Graphics2D graphics2d;
		(graphics2d = (img = new BufferedImage(w, h, bufferedimage.getColorModel().getTransparency())).createGraphics()).drawImage(
				bufferedimage, 0, 0, w, h, w, 0, 0, h, null);

		graphics2d.dispose();
		return img;
	}

	public static BufferedImage flopImage(BufferedImage bufferedimage) {
		int w = bufferedimage.getWidth();
		int h = bufferedimage.getHeight();
		BufferedImage img;
		Graphics2D graphics2d;
		(graphics2d = (img = new BufferedImage(w, h, bufferedimage.getColorModel().getTransparency())).createGraphics()).drawImage(
				bufferedimage, new AffineTransform(1.0F, 0.0F, 0.0F, -1.0F, 0.0F, h - 1), null);
		graphics2d.dispose();
		return img;
	}

	public static String Img2Base64(String imgFilePath) throws IOException {
		byte[] data = (byte[]) null;

		InputStream in = null;
		try {
			in = new FileInputStream(imgFilePath);
			data = new byte[in.available()];
			in.read(data);
			in.close();
		} finally {
			if (in != null) {
				in.close();
			}

		}

		return new BASE64Encoder().encode(data);
	}

	public static byte[] cut(byte[] image, String format, int x, int y, int width, int height) throws Exception {
		ByteArrayInputStream bais = null;
		ImageInputStream iis = null;
		try {
			bais = new ByteArrayInputStream(image);

			Iterator it = ImageIO.getImageReadersByFormatName(format);
			ImageReader reader = (ImageReader) it.next();

			iis = ImageIO.createImageInputStream(bais);

			reader.setInput(iis, true);

			ImageReadParam param = reader.getDefaultReadParam();

			Rectangle rect = new Rectangle(x, y, width, height);

			param.setSourceRegion(rect);

			BufferedImage bi = reader.read(0, param);

			ByteArrayOutputStream out = new ByteArrayOutputStream();
			ImageIO.write(bi, format, out);

			byte[] arrayOfByte = out.toByteArray();
			return arrayOfByte;
		} finally {
			if (bais != null) {
				bais.close();
			}
			if (iis != null)
				iis.close();
		}
	}
	
	public static void Compress(BufferedImage image, File outfile, int size) throws Exception {
        if (image.getWidth() > size) {
            int height = (int) (image.getHeight() / (image.getWidth() * 1d) * size);
            BufferedImage tag = new BufferedImage((int) size, (int) height, BufferedImage.TYPE_INT_RGB);
            if(isTransparent(image)){
            	Graphics2D g2d = tag.createGraphics();
        		tag = g2d.getDeviceConfiguration().createCompatibleImage(size, height,Transparency.TRANSLUCENT);
        		g2d.dispose();
        		g2d = tag.createGraphics();
        		Image from = image.getScaledInstance(size, height, Image.SCALE_AREA_AVERAGING);
        		g2d.drawImage(from, 0, 0, null);
        		g2d.dispose();
        		FileOutputStream fout = new FileOutputStream(getFileName(outfile, size, height));
        		ImageIO.write(tag, "png", fout);
        		fout.close();
            }else{
            	tag.getGraphics().drawImage(image.getScaledInstance(size, height, Image.SCALE_SMOOTH), 0, 0, null);
            	FileOutputStream fout = new FileOutputStream(getFileName(outfile, size, height));
        		ImageIO.write(tag, "jpg", fout);
        		fout.close();
            }
        } else {
            write(image, outfile);
        }
        System.gc();
    }
	
	/**
	 * 是否是透明图
	 * @param image
	 * @return
	 */
	public static boolean isTransparent(BufferedImage image){
        for (int i = 0; i < image.getHeight(); i++) {
            for (int j = 0; j < image.getWidth(); j++) {// 行扫描
            	int dip = image.getRGB(j, i);
                if (dip >>24 == 0){
                    return true;
                }
            }
        }
        return false;
	}

	public static void Compress(BufferedImage image, File outfile, int width, int height) throws Exception {
		BufferedImage tag = null;
		tag = new BufferedImage((int) width, (int) height, BufferedImage.TYPE_INT_RGB);

        if(isTransparent(image)){
        	Graphics2D g2d = tag.createGraphics();
    		tag = g2d.getDeviceConfiguration().createCompatibleImage(width, height,Transparency.TRANSLUCENT);
    		g2d.dispose();
    		g2d = tag.createGraphics();
    		Image from = image.getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
    		g2d.drawImage(from, 0, 0, null);
    		g2d.dispose();
    		FileOutputStream fout = new FileOutputStream(getFileName(outfile, width, height));
    		ImageIO.write(tag, "png", fout);
    		fout.close();
        }else{
        	tag.getGraphics().drawImage(image.getScaledInstance(width, height, Image.SCALE_SMOOTH), 0, 0, null);
        	FileOutputStream fout = new FileOutputStream(getFileName(outfile, width, height));
    		ImageIO.write(tag, "jpg", fout);
    		fout.close();
        }
	}
	
	public static void Compress(File image, File outfile, int width, int height) throws Exception {
        BufferedImage buf=ImageIO.read(image);
        Compress(buf,outfile,width,height);
    }
    
    public static void Compress(File image, File outfile, int width) throws Exception {
        BufferedImage buf=ImageIO.read(image);
        Compress(buf,outfile,width);
    }
	
	public static void write(BufferedImage image, File outfile) throws Exception {
        FileOutputStream fout = new FileOutputStream(outfile);
        ImageIO.write(image, "jpg", fout);
        fout.close();
    }
	
	private static File getFileName(File file,int height,int width){
    	String fname=file.getPath();
    	//fname.replaceAll("\\[width\\]", width+"").replaceAll("\\[height\\]", height+"");
    	return new File(fname);
    }
	
	/**
	 * 验证码:code ,BufferedImage:image
	 * @param retType 1:BufferedImage 2:byte[]
	 * @return HashMap
	 */
	public static HashMap<String,Object> captcha(Integer retType) {
		int width = 70, height = 20, i, x, y, xl, yl;
		Font font = new Font("Arial Bold", 1, 16);
		BufferedImage image = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		String code = "";
		try {
			Random random = new Random();
			g.setColor(getRandColor(200, 250));
			g.fillRect(1, 1, width - 1, height - 1);
			g.setColor(new Color(102, 102, 102));
			g.drawRect(0, 0, width - 1, height - 1);
			g.setFont(font);
			g.setColor(getRandColor(160, 200));
			for (i = 0; i < 155; i++) {
				x = random.nextInt(width - 1);
				y = random.nextInt(height - 1);
				xl = random.nextInt(6) + 1;
				yl = random.nextInt(12) + 1;
				g.drawLine(x, y, x + xl, y + yl);
			}
			for (i = 0; i < 70; i++) {
				x = random.nextInt(width - 1);
				y = random.nextInt(height - 1);
				xl = random.nextInt(12) + 1;
				yl = random.nextInt(6) + 1;
				g.drawLine(x, y, x - xl, y - yl);
			}
			StringBuilder rand = new StringBuilder(5);
			String str;
			for (i = 0; i < 5; i++) {
				str = getRandomChar();
				rand.append(str);
				g.setColor(new Color(20 + random.nextInt(110), 20 + random
						.nextInt(110), 20 + random.nextInt(110)));
				g.drawString(str, 12 * i + 5, 16);
			}
			code = rand.toString();
		} finally {
			g.dispose();
		}
		HashMap<String,Object> map = new HashMap<String, Object>();
		map.put("code", code);
		if(retType == 2){
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				ImageIO.write(image, "jpg", baos);
				map.put("image", baos.toByteArray());
				baos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{
			map.put("image", image);
		}
		return map;
	}

	private static Color getRandColor(int fc, int bc) {
		Random random = new Random();
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	private static String getRandomChar() {
		int rand = (int) Math.round(Math.random() * 2);
		long itmp;
		char ctmp;

		switch (rand) {
		case 1:
			itmp = Math.round(Math.random() * 25 + 65);
			ctmp = (char) itmp;
			if (ctmp == 'I' || ctmp == 'L')
				ctmp = '1';
			else if (ctmp == 'O')
				ctmp = '0';
			return String.valueOf(ctmp);
		case 2:
			itmp = Math.round(Math.random() * 25 + 97);
			ctmp = (char) itmp;
			if (ctmp == 'i' || ctmp == 'l')
				ctmp = '1';
			else if (ctmp == 'o')
				ctmp = '0';
			return String.valueOf(ctmp);
		default:
			itmp = Math.round(Math.random() * 9);
			return String.valueOf(itmp);
		}
	}
	
	public static void main(String[] args) throws Exception {
		ImageUtils.Compress(new File("c:/1.jpg"), new File("c:/11.jpg"), 100, 100);
	}
}