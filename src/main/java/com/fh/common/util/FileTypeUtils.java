package com.fh.common.util;

import com.fh.common.constants.FileType;

/**
 * @author Cailin
 *
 */
public class FileTypeUtils {

	/**
     * @return 'True' if the file contains audio
     */
    public static boolean isAudio(String mimeType) {
        return (mimeType != null && mimeType.startsWith("audio/"));
    }
 
    /**
     * @return 'True' if the file contains video
     */
    public static boolean isVideo(String mimeType) {
        return (mimeType != null && mimeType.startsWith("video/"));
    }
 
    /**
     * @return 'True' if the file contains an image
     */
    public static boolean isImage(String mimeType) {
        return mimeType != null && mimeType.startsWith("image/");
    }
    
    
    /**
     * 0-图片,1-音频，2-视频，3-word，4-excel
     */
    public static FileType getFileType(String mimeType){
    	if(mimeType != null) {
    		if(isImage(mimeType))
    			return FileType.image;
    		if(isAudio(mimeType))
    			return FileType.audio;
    		if(isVideo(mimeType))
    			return FileType.video;
    	}
    	return null;
    }
    
}
