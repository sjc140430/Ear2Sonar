package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.ship.common.constants.AppConstants;
import com.fedex.fsm.ship.common.constants.CountryConstants;
import com.fedex.fsm.ship.common.vo.user.UserProfileVO;
import com.fedex.fsm.ship.web.util.URLBuilder;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.WebShipEnvironment;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.outbound.ShipActionForm;
import com.fedex.fsm.ship.web.component.country.CountryUtils;
import com.fedex.fsm.ship.common.vo.user.prefs.pkg.PackagePreferencesVO;
import com.fedex.fsm.ship.web.util.UserProfileAdapter;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.common.vo.user.FSMPrivilege;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __navigationheader extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/NavigationHeader.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block0 ="\r\n";
    private final static byte[]  _wl_block0Bytes = _getBytes( _wl_block0 );

    private static java.lang.String  _wl_block1 ="\r\n\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\t";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\tvar helpTechSupportUrl = \'";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\';\r\n\tvar helpPageUrl = \'";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\';\r\n\tvar helpInterativeGuideUrl = \'";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\';\r\n\tvar historyUrl = \"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n\tvar pendingOperation = \"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\tvar _isPendingShipmentsReminderEnabled = ";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 =";\r\n\tvar _isNavigateAwayFromShipmentNotifyFlag = ";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 =";\r\n\tvar pendingRecords = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar isEMEA_nav = ";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 =";\r\n\tvar hasGroundManifestReminder = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\t\r\n\tvar freightEnabled = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =" ;\r\n\tvar myEcommerceTabShown = ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\tvar packageHelp = true;\r\n\tvar _isReturnOnlyPrivilegeEnabled = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\tvar _isImportShipmentAllowed = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\tvar _isReturnShipmentNavigationAllowed = ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\t\r\n\t\t\r\n</script>\r\n<div>\r\n";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="\r\n\t<input type=\"hidden\" name=\"removeRelatedVO\" value=\"true\" id=\"removeRelatedVO\" />\r\n";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 ="\r\n</div>\r\n";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\r\n<div id=\"cobrand-logo\">\r\n\t<IMG src=\"/images/ascend/shared/apps/";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 =".gif\" alt=\"Co Logo\"\r\n\t\tonerror=\"javascript:fillImage(this,\'/shipping/images/shared/dot_clear.gif\')\"\r\n\t\tborder=0 height=50 width=100 />\r\n</div>\r\n";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 ="\r\n<div id=\"appHeader\">\r\n\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"50%\">\r\n\t\t\t<h1 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="</h1>\r\n\t\t\t<input id=\"readOnlyOrphan\" style=\"display: none;\">\r\n\t\t\t\t<label for=\"readOnlyOrphan\" id=\"appTitle\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\r\n\t\t\t\t\t<sup>\r\n\t\t\t\t\t\t&reg;\r\n\t\t\t\t\t</sup>\r\n\t\t\t\t</label>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\" align=\"right\">\r\n\t\t\t<a href=\"javascript:;\" id=\"myProfileLink\">";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="</a>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\r\n\t\t\t";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="\r\n\t\t\t\t<a href=\"javascript:;\" id=\"logoutLink\">";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="\r\n\t\t\t\t</a>\r\n\t\t\t";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 =" \r\n\t\t\t</td>\r\n\t\t\t<td width=\"10%\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="\r\n\t\t\t\t";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="\r\n\t<span style=\"position:relative;display:none\">&nbsp;</span>\r\n\t<div aria-label=\"";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 ="\" tabindex=\"0\"></div>\r\n\t";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="\r\n\t<div id=\"appnav\" class=\"shipAppNav\">\r\n\t\t";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 ="\r\n\t\t\t";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\r\n\t";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 =" \r\n\t\t\t\t\t";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="\t   \r\n\t\t";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 ="\r\n\t       ";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\r\n\t     ";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\r\n\t\r\n\t\t\t";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 ="\r\n\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\r\n\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 ="\r\n\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\r\n\r\n\t\r\n\t\t\t";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\r\n\t\t\t\t\t\r\n\t";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\r\n\r\n\t\t\t";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 ="\r\n\t\t";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\r\n\t</div>\r\n</div>\r\n";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

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
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);

	MessageResources resources = (MessageResources) application.getAttribute(Globals.MESSAGES_KEY);
	MessageResources references = (MessageResources) application.getAttribute("ref");	
	UserProfileAdapter userProfileAdapter = WebUtils.getUserProfileAdapter(request); 
	boolean isReturnOnlyPrivilegeEnabled = userProfileAdapter.isReturnOnlyPrivilegeEnabled();
	java.util.Locale local = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
	String helpTitle = resources.getMessage(local, "text.help");
	// Help menu item names
	String helpItem1 = resources.getMessage(local, "text.quickhelp.help.with.this.page");
	String helpItem2 = resources.getMessage(local, "text.quickhelp.help.online.tech.support");
	String helpItem3 = resources.getMessage(local, "text.quickhelp.ineractive.help.guide");
	// Tab menu and menu item names
	String prepareShipmentTab = resources.getMessage(local, "app.tab.prepareShipment");
	String ltlFreightTab = resources.getMessage(local, "app.tab.ltlFreightTab");
	String shipHistoryTab = resources.getMessage(local, "app.tab.shipHistory");
	String myListsTab = resources.getMessage(local, "app.tab.myLists");
	String reportsTab = resources.getMessage(local, "app.tab.reports");
	String myEcommerceTab = resources.getMessage(local, "app.tab.myEcommerce");
	String myProfileTab = resources.getMessage(local, "app.tab.myProfile");
	String adminTab = resources.getMessage(local, "app.tab.administration");
	String createShipmentMenu = resources.getMessage(local, "text.createShipment");
	String createReturnShipmentMenu = resources.getMessage(local, "text.createReturnShipment");	
	String createImportShipmentMenu = resources.getMessage(local, "text.createImportShipment");
	String viewPendingShipmentMenu = resources.getMessage(local, "text.viewPendingShipment");
	String addressBookMenu = resources.getMessage(local, "text.addressBook");
	String shipmentProfilesMenu = resources.getMessage(local, "text.shipmentProfiles");
	String dimensionsMenu = resources.getMessage(local, "text.dims");
	String bolLineItemProfilesMenu = resources.getMessage(local, "text.menu.bolLineItemProfiles");
	String helpTechSupportUrl = references.getMessage(local, "online.tech.support");
	String helpPageUrl = URLBuilder.getHelpURL(local, "quick_help");
	String historyUrl = URLBuilder.getShipHistoryEntryUrl(request);
	String interativeGuideUrl = references.getMessage(local, "interactive.help.guide");
	UserProfileVO userProfileVO = (UserProfileVO) session.getAttribute(WebConstants.SESSION_USER_PROFILE);
	boolean cobrandLogo = userProfileVO.getUserAccount().isCobrandLogo();
	String companyCd = userProfileVO.getCompanyCode();	
	boolean isUnitedStates = CountryConstants.UNITEDSTATES_COUNTRY_CODE.equals(local.getCountry());
	boolean isCanada = CountryConstants.CANADA_COUNTRY_CODE.equals(local.getCountry());
	boolean isMexico = CountryConstants.MEXICO_COUNTRY_CODE.equals(local.getCountry());
	boolean isPuertoRico = CountryConstants.PUERTORICO_COUNTRY_CODE.equals(local.getCountry());
	boolean isIndia = CountryConstants.INDIA_COUNTRY_CODE.equals(local.getCountry());
	boolean isEMEA  = CountryUtils.isEmea(local.getCountry());	
	boolean isEnglishLanguage = WebConstants.ENGLISH_LANGUAGE_CODE.equalsIgnoreCase(local.getLanguage());
	boolean freightEnabledCountries = false;
	//Code added for defect Fix-211665
	boolean isCzechRepublicCountry = CountryConstants.CZECH_REPUBLIC_COUNTRY_CODE.equals(local.getCountry());
	boolean isImportShipmentAllowed = DecoupleState.INSTANCE.isImportShipmentAllowed();
	boolean isReturnShipmentNavigationAllowed = userProfileAdapter.isReturnShipmentNavigationAllowed();
	Integer itemsMenuWidth = 125;
	int helpWidth = 72;
	if(isCzechRepublicCountry){
		itemsMenuWidth = 161;
		helpWidth = 76;
	}
	if(isUnitedStates || isCanada || isMexico){
		freightEnabledCountries = true;
	}
	if (isCanada) {
		interativeGuideUrl = references.getMessage(local, "interactive.help.guide.canada");
	}
	else if (isEMEA) {
		interativeGuideUrl = references.getMessage(local, "interactive.help.guide.emea");
	}
	String helpInterativeGuideUrl = URLBuilder.getHelpURL(local, interativeGuideUrl);

	// Start - Primary menu Hightlight:
	boolean isShipmentSelected = false;
	boolean isHistoryMenuSelected = false;
	boolean isListsMenuSelected = false;
	boolean isFreightMenuSelected = false;	
	String menuSelected = (String) request.getAttribute("PRIMARY_MENU");
	if (menuSelected != null && menuSelected.equals(WebConstants.HISTORY_MENU))
		isHistoryMenuSelected = true;
	else if (menuSelected != null && menuSelected.equals(WebConstants.LISTS_MENU))
		isListsMenuSelected = true;
	else if(menuSelected != null && menuSelected.equals(WebConstants.FREIGHT_MENU))	
	   isFreightMenuSelected =true;
	else
		// Default - PrepareShipment Menu
		isShipmentSelected = true;		
	// End - Primary menu Hightlight

	PackagePreferencesVO preferencesVO = userProfileAdapter.getPackagePreferences();
	boolean isPendingShipmentsReminderEnabled = preferencesVO.isPendingShipmentsReminderEnabled();
	boolean isNavigateAwayFromShipmentNotifyFlag = preferencesVO.isNavigateAwayFromShipmentNotifyFlag();
	String pendingOperation = (String) request.getAttribute(WebConstants.PENDING_OPERATION_VAR);
	// set to empty string so javascript check works; otherwise, it'll be "null".
	if (pendingOperation == null)
	{
		pendingOperation = "";
	}
	
	
	boolean isFclUser = userProfileAdapter.isFclUser();
	String pendingRecords = (String) request.getAttribute(WebConstants.PENDING_RECORDS_AVAILABLE);	
	boolean hasGroundManifestReminder = userProfileAdapter.getPackagePreferences().isGroundManifestReminder();
	// #ITG 163023 - File:inetAppConfig.properties, Key:EnableMyEcommerce
	// As part of cleanup isMyEcommerceEnabled() is no longer exists in DecoupleState.java
	boolean myEcommerceTabShown = (isUnitedStates && isEnglishLanguage);
	
	//Jul 2016 CL - EACI 2.5 Part 3
	boolean isGlobalCustomerAdministrationEnabled = DecoupleState.INSTANCE.isGlobalCustomerAdministrationEnabled();
	
	boolean freightEnabled=false;
	if(freightEnabledCountries){
	   freightEnabled =true;
	}
	int tabWidth = 84;
	int adminTabWidth = 0;
	//This is for when Freight is not enabled, adminTabWidth should be 100
	adminTabWidth = tabWidth;
	int shipTabWidth = tabWidth + 45;
	
	//Fix for defect#323024
	int myListsTabWidth = tabWidth;
	
	if(CountryConstants.RUSSIA_COUNTRY_CODE.equals(local.getCountry())){
		myListsTabWidth = tabWidth + 10;
	}

	//Fix for defect 445647
	if(CountryConstants.RUSSIA_COUNTRY_CODE.equalsIgnoreCase(local.getLanguage())) {
		itemsMenuWidth = 215;
	}
	
	//Fix for defect 449972
	if(CountryConstants.POLAND_COUNTRY_CODE.equalsIgnoreCase(local.getLanguage())) {
		itemsMenuWidth = 144;
	}

	if(freightEnabled) {
		tabWidth = 84;
		//when Frieght is Enabled ,adminTabWidth should be 84 
		//so that when we check for isPassKeyAdmin, the adminTabwidth would overall come to 86 ( 84+2)
		adminTabWidth = tabWidth;	
		shipTabWidth = tabWidth + 20;
	}

	int histTabWidth = tabWidth + 26;
	if (userProfileAdapter.isPasskeyAdmin() || isGlobalCustomerAdministrationEnabled) {
	    adminTabWidth = adminTabWidth + 2;
	}
	

            _bw.write(_wl_block2Bytes, _wl_block2);
	if (isCanada) { // quick fix for defect 55403 - since canada doesn't have 'tech support' item, 'interactive guide' is taking its position
	      helpTechSupportUrl = helpInterativeGuideUrl;
	    }
	
            _bw.write(_wl_block3Bytes, _wl_block3);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(helpTechSupportUrl), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block4Bytes, _wl_block4);
             com.fedex.framework.taglib.encode.JavascriptTag __tag0 = null ;
            int __result__tag0 = 0 ;

            if (__tag0 == null ){
                __tag0 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
            }
            __tag0.setPageContext(pageContext);
            __tag0.setParent(null);
            __tag0.setValue(helpPageUrl
);
            _activeTag=__tag0;
            __result__tag0 = __tag0.doStartTag();

            if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag0);
                return;
            }
            _activeTag=__tag0.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
            __tag0.release();
            _bw.write(_wl_block5Bytes, _wl_block5);
             com.fedex.framework.taglib.encode.JavascriptTag __tag1 = null ;
            int __result__tag1 = 0 ;

            if (__tag1 == null ){
                __tag1 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
            }
            __tag1.setPageContext(pageContext);
            __tag1.setParent(null);
            __tag1.setValue(helpInterativeGuideUrl
);
            _activeTag=__tag1;
            __result__tag1 = __tag1.doStartTag();

            if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag1.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag1);
                return;
            }
            _activeTag=__tag1.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag1);
            __tag1.release();
            _bw.write(_wl_block6Bytes, _wl_block6);
             com.fedex.framework.taglib.encode.JavascriptTag __tag2 = null ;
            int __result__tag2 = 0 ;

            if (__tag2 == null ){
                __tag2 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
            }
            __tag2.setPageContext(pageContext);
            __tag2.setParent(null);
            __tag2.setValue(historyUrl
);
            _activeTag=__tag2;
            __result__tag2 = __tag2.doStartTag();

            if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag2.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag2);
                return;
            }
            _activeTag=__tag2.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag2);
            __tag2.release();
            _bw.write(_wl_block7Bytes, _wl_block7);
             com.fedex.framework.taglib.encode.JavascriptTag __tag3 = null ;
            int __result__tag3 = 0 ;

            if (__tag3 == null ){
                __tag3 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
            }
            __tag3.setPageContext(pageContext);
            __tag3.setParent(null);
            __tag3.setValue( pendingOperation 
);
            _activeTag=__tag3;
            __result__tag3 = __tag3.doStartTag();

            if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag3.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag3);
                return;
            }
            _activeTag=__tag3.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag3);
            __tag3.release();
            _bw.write(_wl_block8Bytes, _wl_block8);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPendingShipmentsReminderEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block9Bytes, _wl_block9);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNavigateAwayFromShipmentNotifyFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block10Bytes, _wl_block10);
             com.fedex.framework.taglib.encode.JavascriptTag __tag4 = null ;
            int __result__tag4 = 0 ;

            if (__tag4 == null ){
                __tag4 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
            }
            __tag4.setPageContext(pageContext);
            __tag4.setParent(null);
            __tag4.setValue(pendingRecords
);
            _activeTag=__tag4;
            __result__tag4 = __tag4.doStartTag();

            if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag4.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag4);
                return;
            }
            _activeTag=__tag4.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag4);
            __tag4.release();
            _bw.write(_wl_block11Bytes, _wl_block11);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isEMEA), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block12Bytes, _wl_block12);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(hasGroundManifestReminder), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block13Bytes, _wl_block13);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freightEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block14Bytes, _wl_block14);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( myEcommerceTabShown ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block15Bytes, _wl_block15);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnOnlyPrivilegeEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block16Bytes, _wl_block16);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isImportShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block17Bytes, _wl_block17);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipmentNavigationAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block18Bytes, _wl_block18);

            if (_jsp__tag5(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block20Bytes, _wl_block20);

	if (cobrandLogo) {

            _bw.write(_wl_block21Bytes, _wl_block21);
             com.fedex.framework.taglib.encode.UrlTag __tag6 = null ;
            int __result__tag6 = 0 ;

            if (__tag6 == null ){
                __tag6 = new  com.fedex.framework.taglib.encode.UrlTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
            }
            __tag6.setPageContext(pageContext);
            __tag6.setParent(null);
            __tag6.setValue(companyCd
);
            _activeTag=__tag6;
            __result__tag6 = __tag6.doStartTag();

            if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.UrlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag6.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag6);
                return;
            }
            _activeTag=__tag6.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag6);
            __tag6.release();
            _bw.write(_wl_block22Bytes, _wl_block22);

	}

            _bw.write(_wl_block23Bytes, _wl_block23);

            if (_jsp__tag7(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block24Bytes, _wl_block24);

            if (_jsp__tag8(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block25Bytes, _wl_block25);

            if (_jsp__tag9(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block26Bytes, _wl_block26);
 if (isFclUser) { 
            _bw.write(_wl_block27Bytes, _wl_block27);

            if (_jsp__tag10(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block28Bytes, _wl_block28);
 } 
            _bw.write(_wl_block29Bytes, _wl_block29);
             com.fedex.framework.taglib.HelpMenuTag __tag11 = null ;
            int __result__tag11 = 0 ;

            if (__tag11 == null ){
                __tag11 = new  com.fedex.framework.taglib.HelpMenuTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
            }
            __tag11.setPageContext(pageContext);
            __tag11.setParent(null);
            __tag11.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("help.menu.ship", java.lang.String.class,"id"));
            __tag11.setTitle(helpTitle
);
            __tag11.setHelpWidth(helpWidth
);
            __tag11.setItemsMenuWidth(itemsMenuWidth
);
            _activeTag=__tag11;
            __result__tag11 = __tag11.doStartTag();

            if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
                do {
                    _bw.write(_wl_block30Bytes, _wl_block30);
                     com.fedex.framework.taglib.HelpMenuItemTag __tag12 = null ;
                    int __result__tag12 = 0 ;

                    if (__tag12 == null ){
                        __tag12 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
                    }
                    __tag12.setPageContext(pageContext);
                    __tag12.setParent(__tag11);
                    __tag12.sethelpMenuItem(helpItem1
);
                    _activeTag=__tag12;
                    __result__tag12 = __tag12.doStartTag();

                    if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block30Bytes, _wl_block30);
                        } while (__tag12.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag12);
                        return;
                    }
                    _activeTag=__tag12.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
                    __tag12.release();
                    _bw.write(_wl_block30Bytes, _wl_block30);

						if (isUnitedStates) {
					
                    _bw.write(_wl_block30Bytes, _wl_block30);
                     com.fedex.framework.taglib.HelpMenuItemTag __tag13 = null ;
                    int __result__tag13 = 0 ;

                    if (__tag13 == null ){
                        __tag13 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
                    }
                    __tag13.setPageContext(pageContext);
                    __tag13.setParent(__tag11);
                    __tag13.sethelpMenuItem(helpItem2
);
                    _activeTag=__tag13;
                    __result__tag13 = __tag13.doStartTag();

                    if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block30Bytes, _wl_block30);
                        } while (__tag13.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag13.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag13);
                        return;
                    }
                    _activeTag=__tag13.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag13);
                    __tag13.release();
                    _bw.write(_wl_block30Bytes, _wl_block30);

						}
					
                    _bw.write(_wl_block30Bytes, _wl_block30);

						if (isUnitedStates || isCanada || isEMEA) {
					
                    _bw.write(_wl_block30Bytes, _wl_block30);
                     com.fedex.framework.taglib.HelpMenuItemTag __tag14 = null ;
                    int __result__tag14 = 0 ;

                    if (__tag14 == null ){
                        __tag14 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
                    }
                    __tag14.setPageContext(pageContext);
                    __tag14.setParent(__tag11);
                    __tag14.sethelpMenuItem(helpItem3
);
                    _activeTag=__tag14;
                    __result__tag14 = __tag14.doStartTag();

                    if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block30Bytes, _wl_block30);
                        } while (__tag14.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag14);
                        return;
                    }
                    _activeTag=__tag14.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
                    __tag14.release();
                    _bw.write(_wl_block30Bytes, _wl_block30);

						}
					
                    _bw.write(_wl_block31Bytes, _wl_block31);
                } while (__tag11.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            }
            if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag11);
                return;
            }
            _activeTag=__tag11.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
            __tag11.release();
            _bw.write(_wl_block32Bytes, _wl_block32);
            _bw.write(_wl_block33Bytes, _wl_block33);

            if (_jsp__tag15(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block34Bytes, _wl_block34);
            _bw.write(_wl_block35Bytes, _wl_block35);
             com.fedex.framework.taglib.MenuTag __tag16 = null ;
            int __result__tag16 = 0 ;

            if (__tag16 == null ){
                __tag16 = new  com.fedex.framework.taglib.MenuTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
            }
            __tag16.setPageContext(pageContext);
            __tag16.setParent(null);
            __tag16.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menubar.nav", java.lang.String.class,"id"));
            _activeTag=__tag16;
            __result__tag16 = __tag16.doStartTag();

            if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
                do {
                    _bw.write(_wl_block36Bytes, _wl_block36);
                     com.fedex.framework.taglib.MenuTabTag __tag17 = null ;
                    int __result__tag17 = 0 ;

                    if (__tag17 == null ){
                        __tag17 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag17);
                    }
                    __tag17.setPageContext(pageContext);
                    __tag17.setParent(__tag16);
                    __tag17.setTitle(prepareShipmentTab
);
                    __tag17.setSelectedMenuTab(isShipmentSelected
);
                    __tag17.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                    __tag17.setTabWidth(shipTabWidth
);
                    __tag17.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag17;
                    __result__tag17 = __tag17.doStartTag();

                    if (__result__tag17!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag17== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block37Bytes, _wl_block37);

	   			if (!isReturnOnlyPrivilegeEnabled) { 
                            _bw.write(_wl_block38Bytes, _wl_block38);
                             com.fedex.framework.taglib.MenuItemTag __tag18 = null ;
                            int __result__tag18 = 0 ;

                            if (__tag18 == null ){
                                __tag18 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
                            }
                            __tag18.setPageContext(pageContext);
                            __tag18.setParent(__tag17);
                            __tag18.setMenuItem(createShipmentMenu
);
                            _activeTag=__tag18;
                            __result__tag18 = __tag18.doStartTag();

                            if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block30Bytes, _wl_block30);
                                } while (__tag18.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag18.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag18);
                                return;
                            }
                            _activeTag=__tag18.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag18);
                            __tag18.release();
                            _bw.write(_wl_block37Bytes, _wl_block37);
  		}
	            if(userProfileAdapter.isReturnShipmentNavigationAllowed()){ 
                            _bw.write(_wl_block30Bytes, _wl_block30);
                             com.fedex.framework.taglib.MenuItemTag __tag19 = null ;
                            int __result__tag19 = 0 ;

                            if (__tag19 == null ){
                                __tag19 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
                            }
                            __tag19.setPageContext(pageContext);
                            __tag19.setParent(__tag17);
                            __tag19.setMenuItem(createReturnShipmentMenu
);
                            _activeTag=__tag19;
                            __result__tag19 = __tag19.doStartTag();

                            if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block30Bytes, _wl_block30);
                                } while (__tag19.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag19.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag19);
                                return;
                            }
                            _activeTag=__tag19.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag19);
                            __tag19.release();
                            _bw.write(_wl_block37Bytes, _wl_block37);
			}
	   			if (!isReturnOnlyPrivilegeEnabled && isImportShipmentAllowed) { 
                            _bw.write(_wl_block38Bytes, _wl_block38);
                             com.fedex.framework.taglib.MenuItemTag __tag20 = null ;
                            int __result__tag20 = 0 ;

                            if (__tag20 == null ){
                                __tag20 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
                            }
                            __tag20.setPageContext(pageContext);
                            __tag20.setParent(__tag17);
                            __tag20.setMenuItem(createImportShipmentMenu
);
                            _activeTag=__tag20;
                            __result__tag20 = __tag20.doStartTag();

                            if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block30Bytes, _wl_block30);
                                } while (__tag20.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag20.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag20);
                                return;
                            }
                            _activeTag=__tag20.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag20);
                            __tag20.release();
                            _bw.write(_wl_block37Bytes, _wl_block37);
  		} 
                            _bw.write(_wl_block31Bytes, _wl_block31);
                             com.fedex.framework.taglib.MenuItemTag __tag21 = null ;
                            int __result__tag21 = 0 ;

                            if (__tag21 == null ){
                                __tag21 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
                            }
                            __tag21.setPageContext(pageContext);
                            __tag21.setParent(__tag17);
                            __tag21.setMenuItem(viewPendingShipmentMenu
);
                            _activeTag=__tag21;
                            __result__tag21 = __tag21.doStartTag();

                            if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block31Bytes, _wl_block31);
                                } while (__tag21.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag21);
                                return;
                            }
                            _activeTag=__tag21.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
                            __tag21.release();
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag17.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag17.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag17);
                        return;
                    }
                    _activeTag=__tag17.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag17);
                    __tag17.release();
                    _bw.write(_wl_block37Bytes, _wl_block37);
   
	   if (isFclUser) {    
	   
	
                    _bw.write(_wl_block39Bytes, _wl_block39);
if(freightEnabled) {
                    _bw.write(_wl_block40Bytes, _wl_block40);
                     com.fedex.framework.taglib.MenuTabTag __tag22 = null ;
                    int __result__tag22 = 0 ;

                    if (__tag22 == null ){
                        __tag22 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
                    }
                    __tag22.setPageContext(pageContext);
                    __tag22.setParent(__tag16);
                    __tag22.setTitle(ltlFreightTab
);
                    __tag22.setSelectedMenuTab(isFreightMenuSelected
);
                    __tag22.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag22.setTabWidth(tabWidth
);
                    __tag22.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag22;
                    __result__tag22 = __tag22.doStartTag();

                    if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag22.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag22);
                        return;
                    }
                    _activeTag=__tag22.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
                    __tag22.release();
                    _bw.write(_wl_block41Bytes, _wl_block41);
} 
                    _bw.write(_wl_block42Bytes, _wl_block42);
                     com.fedex.framework.taglib.MenuTabTag __tag23 = null ;
                    int __result__tag23 = 0 ;

                    if (__tag23 == null ){
                        __tag23 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
                    }
                    __tag23.setPageContext(pageContext);
                    __tag23.setParent(__tag16);
                    __tag23.setTitle(shipHistoryTab
);
                    __tag23.setSelectedMenuTab(isHistoryMenuSelected
);
                    __tag23.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag23.setTabWidth(histTabWidth
);
                    __tag23.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag23;
                    __result__tag23 = __tag23.doStartTag();

                    if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag23.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag23.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag23);
                        return;
                    }
                    _activeTag=__tag23.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag23);
                    __tag23.release();
                    _bw.write(_wl_block42Bytes, _wl_block42);
                     com.fedex.framework.taglib.MenuTabTag __tag24 = null ;
                    int __result__tag24 = 0 ;

                    if (__tag24 == null ){
                        __tag24 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
                    }
                    __tag24.setPageContext(pageContext);
                    __tag24.setParent(__tag16);
                    __tag24.setTitle(myListsTab
);
                    __tag24.setSelectedMenuTab(isListsMenuSelected
);
                    __tag24.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                    __tag24.setTabWidth(myListsTabWidth
);
                    __tag24.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag24;
                    __result__tag24 = __tag24.doStartTag();

                    if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block31Bytes, _wl_block31);
                             com.fedex.framework.taglib.MenuItemTag __tag25 = null ;
                            int __result__tag25 = 0 ;

                            if (__tag25 == null ){
                                __tag25 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
                            }
                            __tag25.setPageContext(pageContext);
                            __tag25.setParent(__tag24);
                            __tag25.setMenuItem(addressBookMenu
);
                            _activeTag=__tag25;
                            __result__tag25 = __tag25.doStartTag();

                            if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block31Bytes, _wl_block31);
                                } while (__tag25.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag25.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag25);
                                return;
                            }
                            _activeTag=__tag25.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag25);
                            __tag25.release();
                            _bw.write(_wl_block43Bytes, _wl_block43);
                             com.fedex.framework.taglib.MenuItemTag __tag26 = null ;
                            int __result__tag26 = 0 ;

                            if (__tag26 == null ){
                                __tag26 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
                            }
                            __tag26.setPageContext(pageContext);
                            __tag26.setParent(__tag24);
                            __tag26.setMenuItem(shipmentProfilesMenu
);
                            _activeTag=__tag26;
                            __result__tag26 = __tag26.doStartTag();

                            if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block31Bytes, _wl_block31);
                                } while (__tag26.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag26.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag26);
                                return;
                            }
                            _activeTag=__tag26.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag26);
                            __tag26.release();
                            _bw.write(_wl_block44Bytes, _wl_block44);
                             com.fedex.framework.taglib.MenuItemTag __tag27 = null ;
                            int __result__tag27 = 0 ;

                            if (__tag27 == null ){
                                __tag27 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
                            }
                            __tag27.setPageContext(pageContext);
                            __tag27.setParent(__tag24);
                            __tag27.setMenuItem(dimensionsMenu
);
                            _activeTag=__tag27;
                            __result__tag27 = __tag27.doStartTag();

                            if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block31Bytes, _wl_block31);
                                } while (__tag27.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag27.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag27);
                                return;
                            }
                            _activeTag=__tag27.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag27);
                            __tag27.release();
                            _bw.write(_wl_block45Bytes, _wl_block45);
if(freightEnabled) {
                            _bw.write(_wl_block31Bytes, _wl_block31);
                             com.fedex.framework.taglib.MenuItemTag __tag28 = null ;
                            int __result__tag28 = 0 ;

                            if (__tag28 == null ){
                                __tag28 = new  com.fedex.framework.taglib.MenuItemTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
                            }
                            __tag28.setPageContext(pageContext);
                            __tag28.setParent(__tag24);
                            __tag28.setMenuItem(bolLineItemProfilesMenu
);
                            _activeTag=__tag28;
                            __result__tag28 = __tag28.doStartTag();

                            if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block31Bytes, _wl_block31);
                                } while (__tag28.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag28);
                                return;
                            }
                            _activeTag=__tag28.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
                            __tag28.release();
                            _bw.write(_wl_block31Bytes, _wl_block31);
 }  
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag24.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag24.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag24);
                        return;
                    }
                    _activeTag=__tag24.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag24);
                    __tag24.release();
                    _bw.write(_wl_block46Bytes, _wl_block46);
                     com.fedex.framework.taglib.MenuTabTag __tag29 = null ;
                    int __result__tag29 = 0 ;

                    if (__tag29 == null ){
                        __tag29 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
                    }
                    __tag29.setPageContext(pageContext);
                    __tag29.setParent(__tag16);
                    __tag29.setTitle(reportsTab
);
                    __tag29.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag29.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag29.setTabWidth(tabWidth
);
                    __tag29.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag29;
                    __result__tag29 = __tag29.doStartTag();

                    if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag29.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag29.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag29);
                        return;
                    }
                    _activeTag=__tag29.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag29);
                    __tag29.release();
                    _bw.write(_wl_block47Bytes, _wl_block47);
 if (myEcommerceTabShown) { 
                    _bw.write(_wl_block40Bytes, _wl_block40);
                     com.fedex.framework.taglib.MenuTabTag __tag30 = null ;
                    int __result__tag30 = 0 ;

                    if (__tag30 == null ){
                        __tag30 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
                    }
                    __tag30.setPageContext(pageContext);
                    __tag30.setParent(__tag16);
                    __tag30.setTitle(myEcommerceTab
);
                    __tag30.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag30.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag30.setTabWidth(shipTabWidth
);
                    __tag30.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                    _activeTag=__tag30;
                    __result__tag30 = __tag30.doStartTag();

                    if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag30.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag30.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag30);
                        return;
                    }
                    _activeTag=__tag30.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag30);
                    __tag30.release();
                    _bw.write(_wl_block37Bytes, _wl_block37);
 } 
                    _bw.write(_wl_block48Bytes, _wl_block48);

				if (userProfileAdapter.isPasskeyAdmin() || isGlobalCustomerAdministrationEnabled) {
			
                    _bw.write(_wl_block36Bytes, _wl_block36);
                     com.fedex.framework.taglib.MenuTabTag __tag31 = null ;
                    int __result__tag31 = 0 ;

                    if (__tag31 == null ){
                        __tag31 = new  com.fedex.framework.taglib.MenuTabTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
                    }
                    __tag31.setPageContext(pageContext);
                    __tag31.setParent(__tag16);
                    __tag31.setTitle(adminTab
);
                    __tag31.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag31.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                    __tag31.setTabWidth(adminTabWidth
);
                    __tag31.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("150")).intValue());
                    _activeTag=__tag31;
                    __result__tag31 = __tag31.doStartTag();

                    if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block36Bytes, _wl_block36);
                        } while (__tag31.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag31.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag31);
                        return;
                    }
                    _activeTag=__tag31.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag31);
                    __tag31.release();
                    _bw.write(_wl_block37Bytes, _wl_block37);

			}
		}
	
                    _bw.write(_wl_block49Bytes, _wl_block49);
                } while (__tag16.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            }
            if (__tag16.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag16);
                return;
            }
            _activeTag=__tag16.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag16);
            __tag16.release();
            _bw.write(_wl_block50Bytes, _wl_block50);
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

    private boolean _jsp__tag5(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.FormTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  org.apache.struts.taglib.html.FormTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag5, parent);
        __tag5.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("navigationHeaderAction", java.lang.String.class,"action"));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block19Bytes, _wl_block19);
            } while (__tag5.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jsp__tag7(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag7, parent);
        __tag7.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag7;
        __result__tag7 = __tag7.doStartTag();

        if (__result__tag7!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag7== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag8 = null ;
        int __result__tag8 = 0 ;

        if (__tag8 == null ){
            __tag8 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag8);
        }
        __tag8.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag8, parent);
        __tag8.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag8;
        __result__tag8 = __tag8.doStartTag();

        if (__result__tag8!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag8== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jsp__tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag9, parent);
        __tag9.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.myProfile", java.lang.String.class,"key"));
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag9.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag9);
            return true;
        }
        _activeTag=__tag9.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag9);
        __tag9.release();
        return false;
    }

    private boolean _jsp__tag10(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag10, parent);
        __tag10.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.logout", java.lang.String.class,"key"));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag10.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag10);
            return true;
        }
        _activeTag=__tag10.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
        __tag10.release();
        return false;
    }

    private boolean _jsp__tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag15, parent);
        __tag15.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.onreloadofpagelabel", java.lang.String.class,"key"));
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag15.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag15);
            return true;
        }
        _activeTag=__tag15.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag15);
        __tag15.release();
        return false;
    }
}
