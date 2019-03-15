package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.vo.WeightUnitOfMeasure;

public final class __ltlcommoditydetail extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlCommodityDetail.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="\r\n\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\r\n<s:set name=\"harmonizedMessage\" value=\"getText(\'text.harmonizedCdHelp\')\"/>\r\n<s:set name=\"harmonizedTitle\" value=\"getText(\'text.harmonizedCode\')\"/>\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n<s:set name=\"countryOfManufactureTitle\" value=\"getText(\'text.countryOfManufacture\')\"/>\r\n\r\n<div id=\"freight.commodity.commodityDetails\" >\r\n\t<div class=\"fsmProductContentFull\">\r\n\t\t\t\t<br/>\r\n\t\t\t\t<b><s:text name=\'text.commodity\'/>\r\n\t\t\t\t <label id=\"freight.commodity.index\"></label> </b>\r\n\t</div>\t\r\n\t\r\n\t<div id=\"commodity.validation.error\" class=\"fsmCommodityDetailsFieldError\" style=\"display:none\"></div>\r\n\t\r\n\t<div id=\"commodity.validation.harmonizedCode.error\" class=\"fsmCommodityDetailsFieldError\" style=\"display:none\">\r\n\t\t<label id=\"freight.commodity.harmonizedCode.error\"></label> \r\n\t</div>\r\n\t\r\n\t<div id=\"commodity.description.alert\" class=\" hideInitially\">\r\n            \t<div class=\"alrtLeft\">\r\n\t\t\t\t\t<bean:message key=\"text.alertWithColon\"/>&nbsp;\r\n\t\t\t\t</div>\r\n            \t<div id=\"commodity.description.alert\" class=\"alertText\">\r\n        \t\t\t<label id=\"vagueCommodity.alertmessage\"></label>\r\n            \t</div>\r\n\t</div>\r\n\t\t\t\r\n\t<div id=\"commodity.description.label\" class=\"fsmContentLeft80 requiredIcon\">\r\n\t\t\t\t<label for=\"commodity.description.content\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\'text.commodityDescription\' /></label>\r\n\t</div>\r\n\r\n\t<div id=\"commodity.description.field\" class=\"fsmContentRight4\">\r\n\t\t<s:textarea id=\"commodity.description.content\" name=\"\" cols=\"15\" rows=\"1\" style=\"resize:none\"/>\t\r\n\t\t\t\r\n\t</div>\r\n\t\r\n\t\r\n\t<div id=\"leftColum\" class=\"fsmCommodityDetailsLeft\" >\r\n\t<div id=\"commodity.unit.options\">\r\n\t\t<div id=\"commodity.unitOfMeasure.label\" class=\"fsmCommodityDetailsProductContentLeft requiredIcon\">\r\n\t\t\t\t\t<label for=\"commodity.unitOfMeasure.content\"><s:text name=\'text.unitOfMeasure\'/>\t</label>\t\t\t\r\n\t\t</div>\t\t\r\n\t\t<div id=\"commodity.unitOfMeasure.field\" class=\"fsmCommodityDetailsInnerRight\" style=\"width: 110px;\">\r\n\t\t\t<s:select style=\"width:100px;\" id=\"commodity.unitOfMeasure.content\" name=\"\"  headerKey=\"0\" headerValue=\"Select\" list=\"{}\" />\r\n\t\t</div>\t\r\n\t</div>\r\n\t\t<div id=\"commodity.quantity.options\">\r\n\t\t\t<div id=\"commodity.quantity.label\" class=\"fsmProductContentLeft requiredIcon\">\r\n\t\t\t\t\t\t<label for=\"commodity.quantity.content\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\'text.quantity\' /></label>\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t<div id=\"commodity.quantity.field\" class=\"fsmCommodityDetailsInnerRight\" style=\"width: 110px;\">\r\n\t\t\t\t<s:textfield id=\"commodity.quantity.content\" name=\"\" size=\"5\" maxlength=\"5\"/>\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t</div>\r\n\t\r\n\t<div id=\"middleColumn\"class=\"fsmCommodityDetailsMiddleColumn\">\t\t\r\n\t\t<div id=\"commodity.weight.label\" class=\"fsmProductContentLeft1 requiredIcon\">\r\n\t\t\t\t<label for=\"commodity.weight.content\">\t<span class=\"ui-hidden-accessible\">*</span><s:text name=\'text.commodityWeight\' />\t</label>\r\n\t\t\t\t<label for=\"commodity.weight.options.content\" class=\"ui-hidden-accessible\"  aria-hidden=\"true\"><s:text name=\'text.commodityWeight\' /></label>\t\t\t\r\n\t\t</div>\r\n\t\t<div id=\"commodity.weight.field\" class=\"fsmCommodityDetailsInnerMiddleRight\">\r\n\t\t\t<s:textfield id=\"commodity.weight.content\" name=\"\" size=\"12\" maxlength=\"10\" />\r\n\t\t</div>\r\n\t\t<div id=\"commodity.weight.options\" class=\"fsmCommodityDetailsInnerMiddleRight1\">\r\n\t\t\t<s:select style=\"width:80px;\" id=\"commodity.weight.options.content\" name=\"\" list=\"ltlCustomsDisplay.commodityUOMTypes\" listKey=\"value\" listValue=\"label\"/>\r\n\t\t</div>\r\n\t\t<div id=\"freight.commodity.weight\"  class=\"fsmCommodityDetailsUnitOfWeight\">\r\n\t\t\r\n\t\t</div>\r\n\t\t<div id=\"commodity.customsValue\">\r\n\t\t\t<div id=\"commodity.customsValue.label\" class=\"fsmProductContentLeft1 requiredIcon\">\r\n\t\t\t\t<label for=\"commodity.customsValue.content\"><span class=\"ui-hidden-accessible\">*</span><s:text name=\'text.customsValue\' /></label>\r\n\t\t\t\t<label for=\"commodity.customsValue.options.content\" class=\"ui-hidden-accessible\"  aria-hidden=\"true\"><s:text name=\'text.customsValue\' /></label>\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t<div id=\"commodity.customsValue.field\" class=\"fsmCommodityDetailsInnerMiddleRight\">\r\n\t\t\t\t<s:textfield id=\"commodity.customsValue.content\" name=\"\" size=\"12\" maxlength=\"15\" />\r\n\t\t\t</div>\r\n\t\t\t<div id=\"commodity.customsValue.options\" class=\"fsmCommodityDetailsInnerMiddleRight\">\r\n\t\t\t\t<s:select style=\"width:80px;\" id=\"commodity.customsValue.options.content\" name=\"\"  list=\"ltlCustomsDisplay.commodityUOMTypes\" listKey=\"value\" listValue=\"label\"/>\r\n\t\t\t\t<label id=\"commodity.customsValue.unit\"></label>\t\t\t\t\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t\r\n\t</div>\r\n\t\r\n\t<div id=\"rightColumn\" class=\"fsmCommodityDetailsRightColumn\">\r\n\t\t<div id=\"commodity.manufacturingcountry.label\" class=\"fsmProductContentLeft requiredIcon\">\r\n\t\t\t";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n\t\t\t";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\t\r\n\t\t\t<s:text name=\'text.countryOfManufacture\' /><img src=\"/framework/image/module_help.gif\" alt=\"\" id=\"freight.commodity.countryOfManufactureHelp\" class=\"cursorPointer\"/>\t\t\t\t\r\n\t\t</div>\r\n\t\t";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n\t\t";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\r\n\t\t\t<html>\r\n\t\t\t\t<label for=\"commodity.manufacturingcountry.options.content\"><s:text name=\'text.countryOfManufactureHelp\' /></label>\r\n\t\t\t</html>\r\n\t\t";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\r\n\t\t<div id=\"commodity.manufacturingcountry.options\" class=\"fsmCommodityDetailsInnerRight\">\r\n\t\t\t<s:select style=\"width:100px;\" id=\"commodity.manufacturingcountry.options.content\" name=\"\"  headerKey=\"0\" headerValue=\"Select\" list=\"{}\" />\r\n\t\t</div>\r\n\t\t\r\n\t\t<div id=\"commodity.harmonizedCode\">\r\n\t\t\t<div id=\"commodity.harmonizedCode.label\" class=\"fsmProductContentLeft\">\r\n\t\t\t\t<s:text name=\'text.harmonizedCode\' /><img src=\"/framework/image/module_help.gif\" alt=\"\" id=\"freight.commodity.harmonizedCodeHelp\" class=\"cursorPointer\"/>\t\t\t\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\r\n\t\t\t\t\t<html>\r\n\t\t\t\t\t\t<label for=\"commodity.harmonizedCode.content\"><s:text name=\'text.harmonizedCdHelp\' /></label>\r\n\t\t\t\t\t</html>\r\n\t\t\t\t";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\r\n\t\t\t<div id=\"commodity.harmonizedCode.text\" class=\"fsmCommodityDetailsInnerRight\">\r\n\t\t\t\t<s:textfield id=\"commodity.harmonizedCode.content\" name=\"\" size=\"12\" maxlength=\"15\" />\r\n\t\t\t\t<a href=\"javascript:;\" id=\"commodity.getHarmonizedCode\" style=\"cursor:pointer;\">\r\n\t\t\t\t\t<s:text name=\'text.getCode\' />\r\n\t\t\t\t</a>\r\n\t\t\t</div>\t\t\r\n\t\t</div>\r\n\r\n\t\t\r\n\t\t<div id=\"commodity.harmonizedCode.description\" class=\"fsmCommodityDetailsInnerRight boldFont\">\t\r\n\t\t <label id=\"commodity.harmonizedCode.description\"></label>\t\r\n\t\t</div>\t\r\n\t\t\t\r\n\t\t<div id=\"commodity.harmonizedCode.uomField1\" style=\"display:none\">\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomFieldName1\" class=\"fsmProductContentLeft requiredIcon\"></div>\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomField1.field\" class=\"fsmCommodityDetailsInnerRight\">\t\r\n\t\t\t\t<s:textfield id=\"commodity.harmonizedCode.uomField1.content\" name=\"\" size=\"6\" maxlength=\"6\" />\t\r\n\t\t\t\t<label id=\"commodity.harmonizedCode.edtUomUnit1\"></label>\t\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t</div>\r\n\t\t\r\n\t\t<div id=\"commodity.harmonizedCode.uomField2\" style=\"display:none\">\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomFieldName2\" class=\"fsmProductContentLeft requiredIcon\"></div>\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomField2.field\" class=\"fsmCommodityDetailsInnerRight\">\t\r\n\t\t\t\t<s:textfield id=\"commodity.harmonizedCode.uomField2.content\" name=\"\" size=\"6\" maxlength=\"6\" />\t\r\n\t\t\t\t<label id=\"commodity.harmonizedCode.edtUomUnit2\"></label>\t\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t</div>\r\n\t\t\r\n\t\t<div id=\"commodity.harmonizedCode.uomField3\" style=\"display:none\">\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomFieldName3\" class=\"fsmProductContentLeft requiredIcon\"></div>\r\n\t\t\t<div id=\"commodity.harmonizedCode.uomField3.field\" class=\"fsmCommodityDetailsInnerRight\">\t\r\n\t\t\t\t<s:textfield id=\"commodity.harmonizedCode.uomField3.content\" name=\"\" size=\"6\" maxlength=\"6\" />\t\r\n\t\t\t\t<label id=\"commodity.harmonizedCode.edtUomUnit3\"></label>\t\t\t\t\t\r\n\t\t\t</div>\r\n\t\t\t\r\n\t\t</div>\r\n\t\t\r\n\t\t<div id=\"commodity.harmonizedCode.regionFields\" style=\"display:none\">\r\n\t\t\t<div id=\"commodity.harmonizedCode.regionProvince\" class=\"fsmProductContentLeft \"></div>\r\n\t\t\t\t<label id=\"commodity.harmonizedCode.regionProvinceOptions\"></label>\t\t\t\t\t\r\n\t\t</div>\r\n\r\n</div>\r\n\t\r\n\t<!-- Additional  Commodity Information-->\r\n\t\r\n\t<div id=\"customs.commodity.additionalInformation.label\" class=\"fsmProductContentFull\" >\r\n\t\t\t\t<a href=\"javascript:;\" class=\"fsmProductContentPlusImage\"\r\n\t\t\t\t\tid=\"commodity.addlCommodityInfo.image\"><s:text name=\'text.addlCommodityInfo\' /> </a>\r\n\t</div>\r\n\t\r\n\t<div id=\"commodity.additionalInformation.fields\" style=\"display:none\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\t\t\r\n\t\t\t\t\r\n\t\t\t\t<div class=\"fsmProductContentFull\">\r\n\t\t\t\t\t<label for=\"commodity.additionalInformation.exportLicenseNumber\"><s:text name=\'text.exportLicenseNo\'/></label>\r\n\t\t\t\t\t<s:textfield id=\"commodity.additionalInformation.exportLicenseNumber\" name=\"\" size=\"12\" maxlength=\"12\" />\r\n\t\t\t\t</div>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\t<div id=\"exportLicense\">\r\n\t\t\t\t\t<div class=\"fsmProductContentLeft2\">\r\n\t\t\t\t\t\t<label for=\"commodity.additionalInformation.exportLicenseExpirationDate\"><s:text name=\'text.expirationDate\'/><span class=\"ui-hidden-accessible\"><bean:message key=\"ada.thirdpartytext\"/></span></label>\t\r\n\t\t\t\t\t</div>\t\t\t\t\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t\t\r\n\t\t\t\t</div>\r\n\t</div>\r\n\t\r\n\t  <div class=\"fsmProductContentFull\">\r\n\t\t\t<div id=\"commodity.saveUpdate\">\r\n\t\t\t\t<s:checkbox id=\"commodity.saveUpdate.option\" label=\"\" name=\"\"/><label for=\"commodity.saveUpdate.option\"> <s:text name=\'text.saveUpdateCommodityProfile\'/>\t\t</label>\t\r\n\t\t\t</div>\r\n\t\t\t\t\t\t\t\t\r\n\t  </div>\r\n\t  \r\n\t  \t<div class=\"freightColumnLeft\">\r\n\t \t\t <div id=\"commodity.saveUpdate.commodityProductName\" class=\"fsmFreightInnerContent24\" style=\"display:none\">\r\n\t\t\t\t<label for=\"commodity.commodityProductName.content\"><s:text name=\'text.productName\'/></label>&nbsp;\r\n\t\t\t\t<s:textfield id=\"commodity.commodityProductName.content\" name=\"\" size=\"50\" maxlength=\"50\" />\r\n\t \t\t</div>\t\r\n\t \t</div>\t \t\r\n\t \t\r\n</div>\r\n\r\n\t\r\n\t\t\r\n\r\n<input type=\"hidden\" name=\"imporths\" id=\"freight.imporths\" value =\"\">\r\n<input type=\"hidden\" name=\"importdesc\" id=\"freight.importdesc\" value =\"\">\r\n<input type=\"hidden\" name=\"\" id=\"freight.commodity.harmonizedCodeMatchResult\" value =\"\">\r\n<input  type=\"hidden\" name=\"shipmentControl.commodityList\" id=\"freight.commodity.commodityList\" value =\"\">\r\n\r\n\t\r\n";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

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
            _bw.write(_wl_block6Bytes, _wl_block6);

            if (_jsp__tag0(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block6Bytes, _wl_block6);
            _bw.write(_wl_block8Bytes, _wl_block8);

            if (_jsp__tag1(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block10Bytes, _wl_block10);
            _bw.write(_wl_block11Bytes, _wl_block11);

            if (_jsp__tag2(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block12Bytes, _wl_block12);
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

    private boolean _jsp__tag0(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.FloatingWindowTag __tag0 = null ;
        int __result__tag0 = 0 ;

        if (__tag0 == null ){
            __tag0 = new  com.fedex.framework.taglib.FloatingWindowTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
        }
        __tag0.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag0, parent);
        __tag0.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freight.commodity.floatingCountryOfManufactureMessage", java.lang.String.class,"id"));
        __tag0.setTitle(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${countryOfManufactureTitle}",java.lang.String.class,pageContext,_jspx_fnmap));
        __tag0.setCloseText(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("close", java.lang.String.class,"closeText"));
        _activeTag=__tag0;
        __result__tag0 = __tag0.doStartTag();

        if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.FloatingWindowTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block7Bytes, _wl_block7);
            } while (__tag0.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag0);
            return true;
        }
        _activeTag=__tag0.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
        __tag0.release();
        return false;
    }

    private boolean _jsp__tag1(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.FloatingWindowTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  com.fedex.framework.taglib.FloatingWindowTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        __tag1.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freight.commodity.floatingHarmonizedMessage", java.lang.String.class,"id"));
        __tag1.setTitle(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${harmonizedTitle}",java.lang.String.class,pageContext,_jspx_fnmap));
        __tag1.setCloseText(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("close", java.lang.String.class,"closeText"));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.FloatingWindowTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block9Bytes, _wl_block9);
            } while (__tag1.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag1);
            return true;
        }
        _activeTag=__tag1.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
        __tag1.release();
        return false;
    }

    private boolean _jsp__tag2(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.CalendarTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  com.fedex.framework.taglib.CalendarTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("commodity.additionalInformation.exportLicenseExpirationDate", java.lang.String.class,"id"));
        __tag2.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("", java.lang.String.class,"name"));
        __tag2.setIncludeYearButtons(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.CalendarTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag2);
            return true;
        }
        _activeTag=__tag2.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
        __tag2.release();
        return false;
    }
}
