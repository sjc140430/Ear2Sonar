package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltladvisories extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlAdvisories.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="\t\t\t\t";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\t\t\t\t<div class=\"fsmContentFull\">\r\n\t\t\t\t\t<hr></hr>\r\n\t\t\t\t</div>\r\n\t\t\t\t<div class=\"fsmContentLeftHalf\">\r\n\t\t\t\t\t<b><s:text name=\"getText(\'text.advisories.title\')\" /></b>\r\n\t\t\t\t</div>\r\n\t\t\t\t<div id=\"advisories.instructions.GTMError\" class=\"fsmFullWidthError hideInitially\"><bean:message key=\'advisories.GTMError\'/></div>\r\n\t\t\t\t<div id=\"advisories.alert.country.prohibits\" class=\"fsmContentFull hideInitially\"></div>  \r\n\t\t\t\t<div id=\"advisories.alert.product.prohibits\" class=\"fsmContentFull hideInitially\"></div>  \r\n\t\t\t\t<div id=\"advisories.instructions.noadvisories\" class=\"fsmContentFull hideInitially\"><bean:message key=\'advisories.alert.noAdvisoriesFound.text\'/></div> \r\n\t\t\t\t<div id=\"advisories.shipping.advisories.count\" class=\"fsmContentFull hideInitially\"><a href=\"javascript:;\" id=\"advisories.shipping.advisories.link\" >&nbsp</a></div>  \r\n\t\t\t\t<div id=\"advisories.no.unacceptable.trading.partners\" class=\"fsmContentFull hideInitially\"><bean:message key=\'advisories.alert.noUnacceptableTradePartnerFound.text\'/></div> \r\n\t\t\t\t<div id=\"advisories.tradingPartners.count\" class=\"fsmContentFull hideInitially\"></div>  \r\n\t\t\t\t<div id=\"advisories.alert.updating\" class=\"fsmContentFull hideInitially\">\r\n\t\t\t\t\t<div id=\"advisories.updating.text\" class=\"boldFontBig\"><bean:message key=\'advisories.alert.updateing.text\'/></div>\r\n\t\t\t\t\t<div id=\"advisories.updating.image.container\"><img src=\"/shipping/images/shared/updating_image.gif\" alt=\"\" id=\"advisories.updating.image\"/></div>\r\n\t\t\t\t</div>  \r\n\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n";
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
            _bw.write(_wl_block1Bytes, _wl_block1);
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
