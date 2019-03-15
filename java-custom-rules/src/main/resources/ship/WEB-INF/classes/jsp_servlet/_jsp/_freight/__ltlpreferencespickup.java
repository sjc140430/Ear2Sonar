package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltlpreferencespickup extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlPreferencesPickup.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="<framework:module id=\"module.pickUp\" type=\"required\" title=\"";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\" defaultMode=\"expanded\"  collapsable=\"false\" helpText=\"";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\">\r\n\t<framework:moduleExpanded>\r\n\t<s:if test=\"%{!freightPreferencesDisplay.pickupPreferenceAllowed}\" >\r\n\t<div id=\"shipmentDetails.collapse\" class=\"fsmContentFull\" display=\"none\">\r\n\t\t<label for=\"preferencesVO.alwaysSchdedulePickup\"><s:text name=\"getText(\'preferences.defaultShipInfo.summary\')\"/></label>\r\n\t</div>\r\n\t</s:if>\r\n\t<s:else>\t\t\t\t\t\r\n\t<div class=\"preferencesCheckboxesIndent\" >\r\n\t\t<s:checkbox  name=\"preferencesVO.alwaysSchdedulePickup\" id=\"preferencesVO.alwaysSchdedulePickup\" value=\"preferencesVO.alwaysSchdedulePickup\"/>\r\n\t\t<label for=\"preferencesVO.alwaysSchdedulePickup\"><s:text name=\"getText(\'preferences.alwaysShedulePickup\')\" /></label>\r\n\t</div>\r\n\t\r\n\t<div class=\"preferencesContentLeftPickup\">\r\n\t<label for=\"freightPreferences.pickupReadyTime\"><s:text name=\"getText(\'text.readytime\')\" /></label>\t\r\n\t</div>\r\n\t<div class=\"preferencesContentRight\">\r\n\t\t<s:select \t\t\t\t\t\t \r\n\t\t id=\"freightPreferences.pickupReadyTime\"  name=\"preferencesVO.readyTime\" \r\n\t\t list=\"{}\"  cssClass=\"fsmDropDownSmaller\" cssStyle=\"width:80px\"\t value=\"preferencesVO.readyTime\"/>\r\n\t</div>\r\n\t<div class=\"preferencesContentLeftPickup\">\r\n\t\t<label for=\"freightPreferences.pickupCloseTime\"><s:text name=\"getText(\'text.closetime\')\" /></label>\r\n\t</div>\r\n\t<div class=\"preferencesContentRight\">\r\n\t\t<s:select \r\n\t\t id=\"freightPreferences.pickupCloseTime\" name=\"preferencesVO.closeTime\" headerKey=\"\" headerValue=\"%{getText(\'text.select\')}\" \r\n\t\t list=\"{}\"  value=\"preferencesVO.closeTime\" cssStyle=\"width:80px\" cssClass=\"fsmDropDownSmaller\"/>\r\n\t</div>\r\n\t<div class=\"preferencesLabelContent\" >\r\n\t\t\t\t\t\t<s:text name=\"getText(\'preferences.pickup.label\')\" />\r\n\t</div>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t</s:else>\r\n\t</framework:moduleExpanded>\r\n</framework:module>\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

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
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${pickupTitle}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block1Bytes, _wl_block1);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpText}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block2Bytes, _wl_block2);
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
