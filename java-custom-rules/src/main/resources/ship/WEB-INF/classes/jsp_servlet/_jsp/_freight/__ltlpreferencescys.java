package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltlpreferencescys extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlPreferencesCYS.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="<script type=\"text/javascript\" charset=\"utf-8\">\r\nvar bolFormatTypeValue=\'\';\r\n<s:if test=\"%{preferencesVO.billOfLadingFormatType != null}\"> \r\n\tbolFormatTypeValue=\"";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\";\r\n</s:if>\r\n</script>\r\n<framework:module id=\"module.completeYourShipment\" type=\"required\" title=\"";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\" defaultMode=\"expanded\"  collapsable=\"false\" helpText=\"";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\">\r\n\t<framework:moduleExpanded>\t\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t<div class=\"preferencesCheckboxesIndent\">\r\n\t\t\t\t<s:checkbox  name=\"preferencesVO.alwaysShowConfirmation\" id=\"preferencesVO.alwaysShowConfirmation\" value=\"preferencesVO.alwaysShowConfirmation\" />\r\n\t\t\t\t<label for=\"preferencesVO.alwaysShowConfirmation\"><s:text name=\"getText(\'preferences.alwaysShowShipmentConfirmation\')\" /></label>\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t\t<!-- Jan18CL - ITG 163016 Freight 2020 -->\r\n\t\t\t<!-- TODO Update WFSM Mapping changes -->\r\n\t\t\t<div id=\"preferences.prepareBOL\" class=\"preferencesCheckboxesIndent\">\r\n\t\t\t\t<s:checkbox id=\"preferences.prepareBOL.element\" name=\"\" />\r\n\t\t\t\t<label for=\"preferences.prepareBOL.element\" class=\"ui-hidden-accessible\"><span aria-hidden=\"true\"><s:text name=\"getText(\'preferences.prepareBOLLabel.freight2020\')\"/></span></label>\r\n\t\t\t\t<span id=\"preferencesPrepareBOLLabel\"> <s:text name=\"getText(\'preferences.prepareBOLLabel.freight2020\')\"/> </span>\r\n\t\t\t\t\r\n\t\t\t\t<div id=\"preferences.prepareBOL.section\" class=\"preferencesCheckboxesIndent\" style=\"padding-left:10px;\">\r\n\t\t\t\t\t<input name=\"preferencesVO.billOfLadingFormatType\" id=\"preferences.straightBOL.element\" type=\"radio\"> \r\n\t\t\t\t\t<span id=\"preferencesStraightBOLLabel\"> <s:text name=\"getText(\'preferences.straightBOLLabel.freight2020\')\" /> </span> <br/>\r\n\t\t\t\t\t<input name=\"preferencesVO.billOfLadingFormatType\" id=\"preferences.vicsBOL.element\" type=\"radio\">\r\n\t\t\t\t\t<span id=\"preferencesVicsBOLLabel\"> <s:text name=\"getText(\'preferences.vicsBOLLabel.freight2020\')\" /> </span>\r\n\r\n\t\t\t\t\t<s:hidden id=\"preferences.billOfLadingFormatType\" name=\"preferencesVO.billOfLadingFormatType\" />\t\r\n\t\t\t\t</div>\t\r\n\t\t\t</div>\r\n\t\t\r\n\t</framework:moduleExpanded>\r\n\t</framework:module>\r\n\t";
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
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${preferencesVO.billOfLadingFormatType}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block1Bytes, _wl_block1);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${completeYourShipmentTitle}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block2Bytes, _wl_block2);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpText}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
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
