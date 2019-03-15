package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltlinternationalpreferences extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlInternationalPreferences.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="<framework:module id=\"module.internationalPreferences\" type=\"required\" title=\"";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\" defaultMode=\"expanded\" collapsable=\"false\"  helpText=\"";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\">\r\n<framework:moduleExpanded>\r\n\t\t\t\r\n\t\t\t<div class=\"preferencesCheckBoxLeft\">\r\n\t\t\t\t\t<s:checkbox id=\"preferencesVO.alwaysPrintCommercialInvoiceOnUploadedLetterHead\" name=\"preferencesVO.alwaysPrintCommercialInvoiceOnUploadedLetterHead\" value=\"preferencesVO.alwaysPrintCommercialInvoiceOnUploadedLetterHead\" /> \r\n\t\t\t</div>\r\n\t\t\t<div class=\"preferencesCheckBoxTextRight\">\t\r\n\t\t\t\t\t<label for=\"preferencesVO.alwaysPrintCommercialInvoiceOnUploadedLetterHead\"><s:text name=\"getText(\'freightPreferences.alwaysPrintLetterhead\')\"  /> </label>\r\n\t\t\t\t\t<a href=\"javascript:;\" id=\"uploadLetterHead\" aria-label=\"<bean:message key=\'ada.preferencescompanyletter\'/> \"> <s:text name=\"getText(\'text.Upload\')\" /></a>\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t\t<div class=\"preferencesCheckBoxLeft\">\r\n\t\t\t\t\t<s:checkbox name=\"preferencesVO.alwaysIncludeUploadedSignature\" id=\"preferencesVO.alwaysIncludeUploadedSignature\" value=\"preferencesVO.alwaysIncludeUploadedSignature\" /> \r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t<div class=\"preferencesCheckBoxTextRight\">\t\r\n\t\t\t\t\t<label for=\"preferencesVO.alwaysIncludeUploadedSignature\"><s:text name=\"getText(\'preferences.alwaysIncludeSignature\')\" /> </label>\r\n\t\t\t\t\t<a href=\"javascript:;\" id=\"uploadSignature\"  aria-label=\"<bean:message key=\"ada.preferencesuploaddocment\" />\"><s:text name=\"getText(\'text.Upload\')\" /></a>\r\n\t\t\t</div>\t\t\t\r\n\t\t\t\r\n\t\t\t<div class=\"preferencesCheckboxesIndent\">\r\n\t\t\t<span aria-label=\"<bean:message key=\'ada.preferencessectionlabel\' />\" >\r\n\t\t\t\t\t<s:checkbox  name=\"preferencesVO.alwaysShowInternationalCustomsDocumentationExpanded\" id=\"preferencesVO.alwaysShowInternationalCustomsDocumentationExpanded\" value=\"preferencesVO.alwaysShowInternationalCustomsDocumentationExpanded\" />\r\n\t\t\t</span>\r\n\t\t\t\t\t<label for=\"preferencesVO.alwaysShowInternationalCustomsDocumentationExpanded\"><s:text name=\"getText(\'preferences.alwaysShowExpanded\')\" /></label>\r\n\t\t\t</div>\t\r\n\t\t\t\r\n\t\t\t\r\n\t\t</framework:moduleExpanded>\r\n</framework:module>\t\r\n\t\t";
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
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${internationalPreferencesTitle}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
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
