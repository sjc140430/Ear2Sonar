package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __ltleeiseddcs extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlEeiSedDcs.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 ="\r\n\t\t\t\t<div id=\"customs.eeiOrSED.section\" class=\"fsmContentLeftFull\">\r\n\t\t\t\t\t<div id=\"customs.eeiOrSED.checkbox.section\" class=\"hideInitially\">\r\n\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t<tr><td>\r\n\t\t\t\t\t\t\t<s:checkbox id=\"customs.requireEEIorSED.checkbox\" name=\"shipmentControl.requiresEEIorSED\" value=\"\" fieldValue=\"true\"/>\r\n\t\t\t\t\t\t</td><td>\r\n\t\t\t\t\t\t\t<label for=\"customs.requireEEIorSED.checkbox\"><s:text name=\"getText(\'text.customs.requiresEEIorSED\')\" /></label>\r\n\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div id=\"customs.eeiOrSED.radio.header\" class=\"hideInitially\">\r\n\t\t\t\t\t\t<label for=\"customs.exemption.noEEIorSED\"><s:text name=\"getText(\'text.selectEEIoptions\')\" /></label>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t<div id=\"ftrValidationError\" class=\"fsmCustomsFTRError error\" style=\"display:none\"></div>\r\n\t\t\t\t\t<div id=\"customs.eeiOrSED.radio.section\" class=\"hideInitially\">\r\n\t\t\t\t\t\t<table>\r\n\t\t\t\t\t\t<tr><td valign=\'top\'>\r\n\t\t\t\t\t\t\t<input type=\"radio\" id=\"customs.exemption.noEEIorSED\" name=\"shipmentControl.eeiOrSEDrequired\" value=\"false\"/>\r\n\t\t\t\t\t\t</td><td>\r\n\t\t\t\t\t\t\t<div class=\"fsmContentLeft165\">\r\n\t\t\t\t\t\t\t\t<label for=\"customs.exemption.noEEIorSED\"><s:text name=\"getText(\'text.noSEDEEIrequired\')\" /></label>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t<div id=\"customs.ftrList\" class=\"hideInitially\">\r\n\t\t\t\t\t\t\t\t<div class=\"fsmContentLeft30\">\r\n\t\t\t\t\t\t\t\t\t<label for=\"customs.ftr\"><s:text name=\"getText(\'text.ftr\')\"/></label>\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t<div  class=\"fsmContentRight\">\r\n\t\t\t\t\t\t\t\t\t<s:select id=\"customs.ftr\" name=\"shipmentVO.sedInfoVO.ftrExemptionType\" list=\"{}\" cssClass=\"contentsmall\" />\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t\t<tr><td valign=\'top\'>\r\n\t\t\t\t\t\t\t<input type=\"radio\" id=\"customs.exemption.requireEEIorSED\" name=\"shipmentControl.eeiOrSEDrequired\" value=\"true\"/>\r\n\t\t\t\t\t\t</td><td>\r\n\t\t\t\t\t\t\t<label for=\"customs.exemption.requireEEIorSED\"><s:text name=\"getText(\'text.customs.requiresEEIorSED\')\"/></label>\r\n\t\t\t\t\t\t</td></tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n\t\t\t\t\t<div id=\"customs.eeiSedFilingOption\" class=\"fsmPadLeft20 hideInitially\">\r\n\t\t\t\t\t\t<br />\r\n\t\t\t\t\t\t<div class=\"fsmContentLeft165 requiredIcon\">\r\n\t\t\t\t\t\t\t<label for=\"customs.eeiSed.filingTypeCode\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\"getText(\'text.EEISEDfilingOption\')\" /></label>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"fsmContentRight\">\r\n\t\t\t\t\t\t\t<s:select id=\"customs.eeiSed.filingTypeCode\" name=\"shipmentVO.sedInfoVO.filingType\" list=\"ltlCustomsDisplay.eeiSedFilingTypes\" listKey=\"value\" listValue=\"label\" />\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\t\t\t\t\r\n\t\t\t\t\t<div id=\"customs.sed.aesHomePage\" class=\"fsmPadLeft hide\">\r\n\t\t\t\t\t\t<label id=\"customs.sed.step1\"  class=\"fsmContentLeft stepTitle\"></label> \r\n\t\t\t\t\t\t<div id=\"customs.sed.aesHomePageLink\" class=\" fsmLeft400AndPadding30\">\r\n\t\t\t\t\t\t\t<a href=\"javascript:;\" id=\"customs.sed.aesHomePage\"><s:text name=\"getText(\'text.AESHomePage\')\" /></a> \r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n\t\t\t\t\t<div id=\"customs.sed.AESCitationType\">\t\r\n\t\t\t\t\t\t<label id=\"customs.sed.step2\"  class=\"fsmContentLeft stepTitle\"></label>\t\r\n\t\t\t\t\t\t<div id=\"customs.sed.AESCitationType.error\" class=\"fsmProductContentFullIndent error\" style=\"display:none\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div class=\"fsmLeft100AndPadding30\">\t\r\n\t\t\t\t\t\t\t<div class=\"requiredIcon\">\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<label for=\"customs.eeiSed.aesCitationTypeCode\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\"getText(\'text.AESCitationType\')\" />&nbsp;&nbsp;</label>\r\n\t\t\t\t\t\t\t\t<s:select id=\"customs.eeiSed.aesCitationTypeCode\" name=\"shipmentVO.sedInfoVO.aesCitationType\" list=\"ltlCustomsDisplay.aesCitationTypes\" listKey=\"value\" listValue=\"label\" />\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t</div>\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\t\t\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\t\t\r\n\t\t\t\t\t<div id=\"customs.sed.AESCitation\" >\r\n\t\t\t\t\t\t<label id=\"customs.sed.step3\"  class=\"fsmContentLeft stepTitle\"></label>\r\n\t\t\t\t\t\t<div  class=\"fsmLeft100AndPadding30\">\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.AESCitation.label\" class=\"requiredIcon\">\r\n\t\t\t\t\t\t\t\t<label for=\"freight.customs.sed.aesCitation\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\"getText(\'text.AESCitation\')\" />&nbsp;&nbsp;<s:text name=\"getText(\'text.AES\')\" />&nbsp;&nbsp;</label>\r\n\t\t\t\t\t\t\t\t<s:textfield id=\"freight.customs.sed.aesCitation\" name=\"shipmentVO.sedInfoVO.aesCitation\" size=\"37\" maxlength=\"32\" cssClass=\"contentsmall\" />\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</div>\r\n\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n\t\t\t\t\t<div id=\"customs.sed.dcs\">\r\n\t\t\t\t\t\t<br/>\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t<div id=\"customs.sed.dcs.DCSFields\">\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DCSTypeLabel\" class=\"fsmContentLeft\">\r\n\t\t\t\t\t\t\t\t<label for=\"customs.sed.dcs.dcsType\"><s:text name=\"text.dcs.DcsType\" /></label>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DCSTypeField\" class=\"fsmContentRight\">\r\n\t\t\t\t\t\t\t\t<s:select id=\"customs.sed.dcs.dcsType\" name=\"shipmentVO.sedInfoVO.destinationControlStatementVO.type\" list=\"{}\" cssClass=\"contentsmall\" />\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSFields\">\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSFields.DOSRecipientLabel\">\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSRecipient.label\" class=\"fsmContentLeft requiredIcon\">\r\n\t\t\t\t\t\t\t\t\t<label for=\"customs.sed.dcs.dosRecipient\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\"getText(\'text.dcs.DosRecipient\')\" /></label>\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSRecipientField\" class=\"fsmContentRight\">\r\n\t\t\t\t\t\t\t\t\t<s:textfield id=\"customs.sed.dcs.dosRecipient\" name=\"shipmentVO.sedInfoVO.destinationControlStatementVO.contactName\" maxlength=\"35\" size=\"37\" />\r\n\t\t\t\t\t\t\t\t</div>\t\r\n\t\t\t\t\t\t\t</div>\t\t\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.error.DOSCountryField\" class=\"fsmCommodityContentLeftFull error\" style=\"display:none\"></div>\t\r\n\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSFields.DOSCountry.label\">\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSCountryLabel\" class=\"fsmContentLeft requiredIcon\">\r\n\t\t\t\t\t\t\t\t\t<label for=\"customs.sed.dcs.dosCountryCode\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\"getText(\'text.dcs.DosCountry\')\" /></label>\r\n\t\t\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t<div id=\"customs.sed.dcs.DOSCountryField\" class=\"fsmContentRight\">\r\n\t\t\t\t\t\t\t\t\t<s:select id=\"customs.sed.dcs.dosCountryCode\" name=\"shipmentVO.sedInfoVO.destinationControlStatementVO.countries\" list=\"{}\" cssClass=\"contentsmall\" size= \"10\" multiple=\"true\" />\r\n\t\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</div>\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\r\n\t\t\t\t\t\r\n\t\t\t\t</div>\r\n\t\t\t\t";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

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
            _bw.write(_wl_block3Bytes, _wl_block3);
            _bw.write(_wl_block4Bytes, _wl_block4);
            _bw.write(_wl_block5Bytes, _wl_block5);
            _bw.write(_wl_block6Bytes, _wl_block6);
            _bw.write(_wl_block7Bytes, _wl_block7);
            _bw.write(_wl_block8Bytes, _wl_block8);
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
