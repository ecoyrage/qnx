<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fns" uri="/WEB-INF/tlds/fns.tld" %>
<c:set var="ctxPath" value="${pageContext.request.contextPath}"/>
<c:set var="adminPath" value="${ctxPath}${fns:getAdminPath()}"/>
<c:set var="isDevMode" value="${fns:isDevMode()}"/>
<c:set var="domain" value="${fns:getConfig('domain')}"/>
<c:set var="frontPath" value="${ctxPath}${fns:getFrontPath()}"/>
<c:set var="frontImgPath" value="${ctxPath}/static/content/h5/images"/>
<c:set var="frontImgPathNew" value="${ctxPath}/static/content/h5/imagesNew"/>
<c:set var="imgUrl" value="http://www.qunaerxue.cn/qdb"/>
<%
String basePath = request.getScheme() + "://" + request.getServerName() 
	+ (request.getServerPort()==80 ? "" : ":" + request.getServerPort()) + request.getContextPath();
//eg: localhost:9090/cm
%>
<c:set var="basePath" value="<%=basePath %>"/>

<script type="text/javascript">
window.sys = {};
window.sys.ctxPath = "${ctxPath}";
window.sys.adminPath = "${adminPath}";
window.sys.basePath = "${basePath}";
window.sys.isDevMode = Boolean('${isDevMode}'=='true');
</script>