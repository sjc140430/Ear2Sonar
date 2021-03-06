package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.web.util.*;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __freightpagecommoninclude extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/FreightPageCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ReadSessionCSRFToken.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        return false;
    }
    private weblogic.servlet.jsp.ExpressionInterceptor _jsp_expressionInterceptor = weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.getNonOperExpressionInterceptor();

    private static boolean _WL_ENCODED_BYTES_OK = true;
    private static final java.lang.String _WL_ORIGINAL_ENCODING = "UTF-8".intern();

    private static byte[] _getBytes(java.lang.String block){
        try {
            return block.getBytes(_WL_ORIGINAL_ENCODING);
        } catch (java.io.UnsupportedEncodingException u){
            _WL_ENCODED_BYTES_OK = false;
        }
        return null;
    }

    private static java.lang.String  _wl_block0 ="\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 =" \r\n\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\r\n<!-- Fix for defect 442915 -->\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n\r\n<script language=\"JavaScript\">\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\";\r\n\tvar _isReturnShipment = false;\r\n\tvar _isReturnsSPEnabled = false;\r\n\tvar _isSPEnabled = false;\r\n\tvar _isImportShipment = false;\r\n\tvar _isLACSouthMiamiEnabled = false;\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\";\r\n\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\tvar i18n_residential = \"";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\";\r\n\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\t\r\n\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 =";\r\n\tvar _isFreight2020PickupEnabled = ";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\r\n\t\r\n\t// Jul18CL - ITG 181427 Freight 2020 Phase 2\r\n\tvar _isFreight2020Phase2Enabled = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =";\r\n\t\r\n\t//Jan19CL-PPM38954 FXF2020 Phase 3\r\n\tvar _isFreight2020Phase3Enabled = ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\t\r\n\t// Jan18CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestrictedForLTL = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\t\r\n\t//Oct 2018 CMT\r\n\tvar _isFreight2020SMSEnabled = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\t\r\n\t//Jan19CL-Freight2020 BrokerInclusive alert message\r\n\tvar _isFreight2020Phase3_BI_Alert_Enabled=";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{}); \r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="</div>";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

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
        response.setHeader("Content-Type", "text/html; charset=UTF-8");
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter)out;
        _bw.setInitCharacterEncoding(_WL_ORIGINAL_ENCODING, _WL_ENCODED_BYTES_OK);
        javax.servlet.jsp.JspWriter _originalOut = out;
        javax.servlet.http.HttpSession session = request.getSession( true );
        try {;
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block1Bytes, _wl_block1);

	String contextPath = request.getContextPath();
	java.util.Locale locale = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
	String utype = request.getParameter(WebConstants.USER_TYPE);
	
	// Fix for defect 442915
	String ltlBrowserType = request.getHeader ("User-Agent");
	boolean isChrome = false;
	if (ltlBrowserType != null){
	    if (ltlBrowserType.indexOf("Chrome") >= 0){
	    	isChrome = true;
	    }
	}
	
	String ltlPhoneNumberStyle = "";
	String ltlpickupColumnStyle = "";
	String ltlAccountElementSize = "100";
	if(isChrome){
		ltlAccountElementSize = "95";
		ltlPhoneNumberStyle = "width:236px;";
		ltlpickupColumnStyle = "width:356px;";
	}

	// Jan 2015 CL - ITG-155772 and ID-1257810
	MessageResources resource = (MessageResources)application.getAttribute(Globals.MESSAGES_KEY);
    String shipperId1Label = WebUtils.getRenameReferencesObject(request,resource).getShipperId1Label();
    String shipperId2Label = WebUtils.getRenameReferencesObject(request,resource).getShipperId2Label();
    String ltlPONumberLabel = WebUtils.getRenameReferencesObject(request,resource).getLtlPONumberLabel();
    
    // Jan18CL - ITG 163016 Freight 2020
    boolean isFreight2020Enabled = DecoupleState.INSTANCE.isFreight2020Enabled();
    boolean isFreight2020PickupEnabled = DecoupleState.INSTANCE.isFreight2020PickupEnabled();
    String freight2020MaxTotalHandlingUnits = DecoupleState.INSTANCE.getMaxTotalHandlingUnits();
    
 	// Jul18CL - ITG 181427 Freight 2020 Phase 2
    boolean isFreight2020Phase2Enabled = DecoupleState.INSTANCE.isFreight2020Phase2Enabled();
 	
  	//Jan19CL-PPM 38954 Freight2020 Phase 3 
  	boolean isFreight2020Phase3Enabled = DecoupleState.INSTANCE.isFreight2020Phase3Enabled();
 	
	//Oct 2018 CMT
	boolean isFreight2020SMSEnabled = DecoupleState.INSTANCE.isFreight2020SMSEnabled();
    
 	// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book
 	// Reverting ITG 171804 - hardcoding flags to false
	 boolean isAddressBookRestrictedForLTL = false;
	 //isAddressBookRestrictedForLTL = WebUtils.getUserProfileAdapter(request).getUserProfileVO().
    		//getLtlFreightUserConfigurationVO().getPrivilegeVO().isRestrictedCentralAddressBookAllowed();
 	
     //Jan19CL-BrokerInclusiveAlert
     boolean isFreight2020Phase3_BI_Alert_Enabled=DecoupleState.INSTANCE.isFreightBrokerSelectAlertEnabled();
     

            _bw.write(_wl_block1Bytes, _wl_block1);

            if (_jsp__tag0(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block0Bytes, _wl_block0);

            if (_jsp__tag1(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block3Bytes, _wl_block3);
 if(isChrome && !locale.getLanguage().equals("fr")) { 
            _bw.write(_wl_block0Bytes, _wl_block0);

            if (_jsp__tag2(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block0Bytes, _wl_block0);
 } 
            _bw.write(_wl_block1Bytes, _wl_block1);
 if(isChrome) { 
            _bw.write(_wl_block0Bytes, _wl_block0);

            if (_jsp__tag3(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block0Bytes, _wl_block0);
 } 
            _bw.write(_wl_block4Bytes, _wl_block4);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block5Bytes, _wl_block5);

            if (_jsp__tag4(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block6Bytes, _wl_block6);

            if (_jsp__tag5(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block7Bytes, _wl_block7);

            if (_jsp__tag6(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block8Bytes, _wl_block8);

            if (_jsp__tag7(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block9Bytes, _wl_block9);

            if (_jsp__tag8(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block10Bytes, _wl_block10);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block11Bytes, _wl_block11);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020PickupEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block12Bytes, _wl_block12);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block13Bytes, _wl_block13);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase2Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block14Bytes, _wl_block14);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block15Bytes, _wl_block15);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestrictedForLTL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block16Bytes, _wl_block16);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020SMSEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block17Bytes, _wl_block17);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3_BI_Alert_Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block18Bytes, _wl_block18);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
            _bw.write(_wl_block19Bytes, _wl_block19);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block20Bytes, _wl_block20);
            _bw.write(_wl_block21Bytes, _wl_block21);
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
         org.apache.struts2.views.jsp.SetTag __tag0 = null ;
        int __result__tag0 = 0 ;

        if (__tag0 == null ){
            __tag0 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
        }
        __tag0.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag0, parent);
        __tag0.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlPhoneNumberSize", java.lang.String.class,"name"));
        __tag0.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("14", java.lang.String.class,"value"));
        _activeTag=__tag0;
        __result__tag0 = __tag0.doStartTag();

        if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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
         org.apache.struts2.views.jsp.SetTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        __tag1.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlNotificationElementSize", java.lang.String.class,"name"));
        __tag1.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("23", java.lang.String.class,"value"));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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
         org.apache.struts2.views.jsp.SetTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlPhoneNumberSize", java.lang.String.class,"name"));
        __tag2.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("16", java.lang.String.class,"value"));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jsp__tag3(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag3, parent);
        __tag3.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlNotificationElementSize", java.lang.String.class,"name"));
        __tag3.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("21", java.lang.String.class,"value"));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag3);
            return true;
        }
        _activeTag=__tag3.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
        __tag3.release();
        return false;
    }

    private boolean _jsp__tag4(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag4, parent);
        __tag4.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.select\')", java.lang.String.class,"name"));
        _activeTag=__tag4;
        __result__tag4 = __tag4.doStartTag();

        if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag4);
            return true;
        }
        _activeTag=__tag4.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
        __tag4.release();
        return false;
    }

    private boolean _jsp__tag5(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag5, parent);
        __tag5.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.address.results\')", java.lang.String.class,"name"));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag5.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag5);
            return true;
        }
        _activeTag=__tag5.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag5);
        __tag5.release();
        return false;
    }

    private boolean _jsp__tag6(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag6 = null ;
        int __result__tag6 = 0 ;

        if (__tag6 == null ){
            __tag6 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
        }
        __tag6.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag6, parent);
        __tag6.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Commercial\')", java.lang.String.class,"name"));
        _activeTag=__tag6;
        __result__tag6 = __tag6.doStartTag();

        if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag6);
            return true;
        }
        _activeTag=__tag6.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
        __tag6.release();
        return false;
    }

    private boolean _jsp__tag7(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag7, parent);
        __tag7.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Residential\')", java.lang.String.class,"name"));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag7.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag7);
            return true;
        }
        _activeTag=__tag7.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag7);
        __tag7.release();
        return false;
    }

    private boolean _jsp__tag8(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag8, parent);
        __tag8.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.UseAddressAsEntered\')", java.lang.String.class,"name"));
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag8.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag8);
            return true;
        }
        _activeTag=__tag8.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag8);
        __tag8.release();
        return false;
    }
}
