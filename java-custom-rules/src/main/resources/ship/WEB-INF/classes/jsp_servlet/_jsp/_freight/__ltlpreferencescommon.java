package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltlpreferencescommon extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlPreferencesCommon.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="<s:set name=\"accountModuleTitle\" value=\"getText(\'accountModule.title\')\" />\r\n<s:set name=\"helpText\" value=\"getText(\'text.help\')\"/>\r\n<s:set name=\"accountHelp\" value=\"getText(\'ltl.module.help.account\')\" />\r\n<s:set name=\"fromModuleTitle\" value=\"getText(\'text.from1\')\" />\r\n<s:set name=\"toModuleTitle\" value=\"getText(\'text.to1\')\" />\r\n<s:set name=\"serviceTypeAndGuranteeTitle\" value=\"getText(\'text.service.with.guarantees\')\" />\r\n<s:set name=\"shipmentDetailsTitle\" value=\"getText(\'text.shipmentDetails\')\" />\r\n<s:set name=\"pickupTitle\" value=\"getText(\'text.pickup\')\" />\r\n<s:set name=\"sendNotificationAndDocumentsTitle\" value=\"getText(\'text.sendNotificationAndDocuments\')\" />\r\n<s:set name=\"internationalPreferencesTitle\" value=\"getText(\'text.internationalPreferences\')\" />\r\n<s:set name=\"printerOptionsTitle\" value=\"getText(\'text.printerOptions\')\" />\r\n<s:set name=\"completeYourShipmentTitle\" value=\"getText(\'text.completeYourShipment\')\" />\r\n<s:set name=\"selectText\" value=\"getText(\'text.select\')\" />\r\n<s:set name=\"selectedPaymentType\" value=\"preferencesVO.billingDetail.billingType\" />\r\n<s:set name=\"pageHelp\" value=\"getText(\'page.help.freight\')\" />\r\n<s:set name=\"accountHelp\" value=\"getText(\'ltl.module.help.account\')\" />\r\n<s:set name=\"fromHelp\" value=\"getText(\'ltl.module.help.from\')\" />\r\n<s:set name=\"toHelp\" value=\"getText(\'ltl.module.help.to\')\" /> \r\n<s:set name=\"serviceTypeHelp\" value=\"getText(\'ltl.module.help.servicetypeguarentee\')\" /> \r\n<s:set name=\"shipmentDetailsHelp\" value=\"getText(\'ltl.module.help.bolshipmentdetails\')\" /> \r\n<s:set name=\"pickupHelp\" value=\"getText(\'ltl.module.help.schedulepickup\')\" />\r\n<s:set name=\"notificationHelp\" value=\"getText(\'ltl.module.help.sendnotificationsanddocuments\')\" /> \r\n<s:set name=\"internationalHelp\" value=\"getText(\'module.help.intlPrefrences\')\" /> \r\n<s:set name=\"printerHelp\" value=\"getText(\'module.help.printerPreferences\')\" /> \r\n<s:set name=\"completeShipHelp\" value=\"getText(\'ltl.module.help.completeyourshipment\')\" />\r\n\r\n\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

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
