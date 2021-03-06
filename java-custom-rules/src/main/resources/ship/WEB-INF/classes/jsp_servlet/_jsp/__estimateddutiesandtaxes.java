package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __estimateddutiesandtaxes extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/EstimatedDutiesAndTaxes.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="<form id=\"rates.estimateDutiesAndTaxesActionForm\" name=\"estimateDutiesAndTaxesActionForm\" method=\"POST\" action=\"<bean:write property=\"ratingDisplay.estimatedDutiesAndTaxesURL\" name=\"shipActionForm\" />\">\r\n\r\n<input type=\"hidden\" id=\"\" name=\"action\" value=\"results\"/>\r\n<input type=\"hidden\" name=\"clienttype\" value=\"fsm\"/>\r\n<input type=\"hidden\" name=\"submit_type\" value=\"\"/>\r\n<input type=\"hidden\" name=\"option\" value=\"edt\"/>\r\n<input type=\"hidden\" name=\"estimatedDutiesAndTaxesURL\" value=\"<bean:write property=\"ratingDisplay.estimatedDutiesAndTaxesURL\" name=\"shipActionForm\" />\"/>\r\n<input type=\"hidden\" id=\"cdt.originCtry\" name=\"originCountryInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.destinationCtry\" name=\"destinationCountryInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.tranCurr\" name=\"transCurrencyInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.shipMonth\" name=\"shipMonthInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.shipDay\" name=\"shipDayInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.shipYear\" name=\"shipYearInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.initRequest\" name=\"initialrequest\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.langCode\" name=\"lang_code\" value=\"en\"/>\r\n<input type=\"hidden\" id=\"cdt.provinceCA\" name=\"provinceCAInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.provinceBR\" name=\"provinceBRInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.shippingCharge\" name=\"shippingChargesInput\" value=\"\"/>\r\n<input type=\"hidden\" id=\"cdt.insuranceCharge\" name=\"insuranceChargesInput\" value=\"\"/>\r\n\r\n\r\n\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n</form>\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

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
