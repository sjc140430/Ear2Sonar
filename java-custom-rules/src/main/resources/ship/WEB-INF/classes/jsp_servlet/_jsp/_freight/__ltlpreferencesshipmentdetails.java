package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltlpreferencesshipmentdetails extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

    private static void _releaseTags(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag t) {
        while (t != null) {
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, t);
            if(t instanceof javax.servlet.jsp.tagext.Tag) {
                javax.servlet.jsp.tagext.Tag tmp = (javax.servlet.jsp.tagext.Tag)t;
                t = ((javax.servlet.jsp.tagext.Tag) t).getParent();
                try {
                    tmp.release();
                } catch(java.lang.Exception ignore) {}
            }
            else {
                t = ((javax.servlet.jsp.tagext.SimpleTag)t).getParent();
            }
        }
    }

    public boolean _isStale(){
        boolean _stale = _staticIsStale((weblogic.servlet.jsp.StaleChecker) getServletConfig().getServletContext());
        return _stale;
    }

    public static boolean _staticIsStale(weblogic.servlet.jsp.StaleChecker sci) {
        if (sci.isResourceStale("/jsp/freight/LtlPreferencesShipmentDetails.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/html/LtlUnitOfMeasure.html", 1550053048000L ,"12.1.3.0.0","GMT0")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "ISO-8859-1".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="<framework:module id=\"module.shipmentDetails\" type=\"required\" title=\"Shipment Details\" defaultMode=\"expanded\" collapsable=\"false\" helpText=\"";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\">\r\n<framework:moduleExpanded>\r\n\t<div id=\"shipmentDetails.expand\">\r\n\t\t <div class=\"preferencesContentLeft\">\r\n\t\t\t<label for=\"freightPreferencesPageForm_preferencesVO_packageType\"><s:text name=\"getText(\'preferences.packageType\')\" /></label>\r\n\t\t </div>\r\n\t\t <div class=\"preferencesContentRight\" >\r\n\t\t \t<s:select  name=\"preferencesVO.packageType\" \r\n\t\t\tlist=\"freightPreferencesDisplay.nonHazmatPackageList\" listkey=\"value\" listValue=\"label\"\r\n\t\t\tvalue=\"preferencesVO.packageType\" />\r\n\t\t  </div>\r\n\t\t <div class=\"preferencesContentLeft\">\r\n\t\t \t\t<label for=\"ltlunitmeasure\"><s:text name=\"getText(\'preferences.unitOfMeasure\')\" /></label>\r\n\t\t </div>\r\n\t\t  <div class=\"preferencesContentRight\" >\r\n\t\t  ";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n<title>Insert title here</title>\r\n</head>\r\n<body>\r\n<select id=\"ltlunitmeasure\" name=\"preferencesVO.systemOfMeasurementType\">\r\n\t \t <option  value=\"IMPERIAL\" >lb/in/ft&#179;</option>\r\n\t <option  value=\"METRIC\" >kg/cm/m&#179;</option>\r\n</select>\r\n</body>\r\n</html>";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\t\t  \r\n\t\t </div>\r\n\t\t <div class=\"preferencesContentLeft\">\r\n\t\t \t\t<label for=\"ltlFreightClass\"><s:text name=\"getText(\'preferences.FreightClass\')\" /></label>\r\n\t\t </div>\r\n\t\t <div class=\"preferencesContentRight\">\r\n\t\t\t\t <s:select id=\"ltlFreightClass\" name=\"preferencesVO.freightClass\" \r\n\t\t\t\t list=\"freightPreferencesDisplay.freightClassList\" listkey=\"value\" listValue=\"label\" value=\"preferencesVO.freightClass\"/>\r\n\t\t </div>\r\n\t</div>\r\n </framework:moduleExpanded>\r\n</framework:module>\r\n\t\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();

    protected void _jspInit() {
        _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getExpressionInterceptor(getServletConfig());
    }

    public void _jspService(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) 
    throws javax.servlet.ServletException, java.io.IOException {

        javax.servlet.ServletConfig config = getServletConfig();
        javax.servlet.ServletContext application = config.getServletContext();
        javax.servlet.jsp.tagext.JspTag _activeTag = null;
        java.lang.Object page = this;
        javax.servlet.jsp.PageContext pageContext = javax.servlet.jsp.JspFactory.getDefaultFactory().getPageContext(this, request, response, null, true , 8192 , true );
        response.setHeader("Content-Type", "text/html");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            _bw.write(_wl_block0Bytes, _wl_block0);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpText}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block3Bytes, _wl_block3);
        } catch (java.lang.Throwable __ee){
            if(!(__ee instanceof javax.servlet.jsp.SkipPageException)) {
                while ((out != null) && (out != _originalOut)) out = pageContext.popBody(); 
                _releaseTags(pageContext, _activeTag);
                pageContext.handlePageException(__ee);
            }
        } finally {
            javax.servlet.jsp.JspFactory.getDefaultFactory().releasePageContext(pageContext);
        }
    }
}
