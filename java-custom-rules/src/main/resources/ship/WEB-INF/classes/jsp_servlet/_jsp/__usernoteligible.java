package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.vo.OperatingMode;
import com.fedex.fsm.ship.web.util.*;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.decouple.DecoupleState;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import com.fedex.fsm.http.LocaleBuilder;
import org.apache.struts.Globals;
import java.util.*;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.common.constants.AppConstants;
import com.fedex.fsm.ship.common.constants.CountryConstants;
import org.apache.struts.Globals;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.displayRules.SenderDisplayRules;
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
import com.fedex.fsm.ship.common.vo.user.UserProfileVO;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.UserProfileAdapter;
import com.fedex.fsm.ship.web.util.URLBuilder;
import com.fedex.fsm.ship.web.decouple.DecoupleState;
import com.fedex.fsm.ship.common.constants.CountryConstants;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import org.apache.struts.Globals;
import java.util.*;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.common.constants.AppConstants;
import com.fedex.fsm.ship.common.constants.CountryConstants;
import org.apache.struts.Globals;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.displayRules.SenderDisplayRules;
import com.fedex.fsm.ship.web.util.WebAnalytics;
import com.fedex.fsm.ship.web.displayRules.WebAnalyticsSelector;
import com.fedex.fsm.ship.web.decouple.DecoupleState;

public final class __usernoteligible extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/UserNotEligible.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/Footer.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/LtlAddAccountJSInclude.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/FreightPageCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebCacheInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/Struts2NavigationHeader.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebAnalyticsFooter.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/Header.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/FreightPageCommonCSSInclude.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ReadSessionCSRFToken.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/NavigationHeader.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/MinifyInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 =" \r\n\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\r\n<head>\r\n";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n<meta name=\"wsstitle\" id=\"wsstitle\" content=\"userNotEligible\">\r\n<meta name=\"wssmlc\" id=\"wssmlc\" content=\"/";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\">\r\n<title></title>\r\n";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 =" \r\n\r\n";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\r\n\r\n<!-- Fix for defect 442915 -->\r\n";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\r\n\r\n<script language=\"JavaScript\">\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\r\n\tvar _isReturnShipment = false;\r\n\tvar _isReturnsSPEnabled = false;\r\n\tvar _isSPEnabled = false;\r\n\tvar _isImportShipment = false;\r\n\tvar _isLACSouthMiamiEnabled = false;\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\";\r\n\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 ="\";\r\n\tvar i18n_residential = \"";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 ="\";\r\n\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 ="\";\t\r\n\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\tvar _isFreight2020PickupEnabled = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\t\r\n\t// Jul18CL - ITG 181427 Freight 2020 Phase 2\r\n\tvar _isFreight2020Phase2Enabled = ";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 =";\r\n\t\r\n\t//Jan19CL-PPM38954 FXF2020 Phase 3\r\n\tvar _isFreight2020Phase3Enabled = ";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 =";\r\n\t\r\n\t// Jan18CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestrictedForLTL = ";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 =";\r\n\t\r\n\t//Oct 2018 CMT\r\n\tvar _isFreight2020SMSEnabled = ";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 =";\r\n\t\r\n\t//Jan19CL-Freight2020 BrokerInclusive alert message\r\n\tvar _isFreight2020Phase3_BI_Alert_Enabled=";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{}); \r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="</div>";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="/css/fsm_common.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 ="/css/fsm_temporary.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="/css/fsmImgsSprite.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="/css/fsm_ship.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="/css/fsm_freight.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="/css/fsm_products.css\">\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-min.css\" id=\"globalCSS\" />\r\n\r\n<!--[if lte IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie-min.css\" /><![endif]--> \r\n<!--[if lte IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie6-min.css\" /><![endif]-->";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="\";\r\n</script>";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 ="\r\n\t";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\r\n\r\n<script>\r\nvar pageType=\"freight\";\r\nvar ajaxTimeout = ";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 =";\r\nvar helpPageUrl = \'";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="\';\r\nvar helpPage= \"";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 ="\";\r\nvar contextPath =\"";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 ="\";\r\nvar _utype= ";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 =";\r\nvar adminEmailId = \"";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 ="\";\r\nvar localLang = \'";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\';\r\nvar contryLowerCase = \'";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 ="\';\r\n</script> \r\n\r\n";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\r\n\r\n</head>\r\n<body>\r\n\r\n";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\r\n    \r\n\t<div id=\"container\">\r\n\t\t<div id=\"fedex-header\">\r\n\t\t\r\n\t\t</div>\r\n\t\t<div id=\"content\" class=\"fx_clearfix\">\r\n\t\t\r\n\t\t<style id=\"antiClickjack\">body{display:none !important;}</style>\r\n\r\n\t<script type=\"text/javascript\">\r\n   \tif (self === top) {\r\n       var antiClickjack = document.getElementById(\"antiClickjack\");\r\n       antiClickjack.parentNode.removeChild(antiClickjack);\r\n   \t} else {\r\n       top.location = self.location;\r\n   \t}\r\n\t</script>\r\n";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\r\n\r\n  <div id=\"fsmAddAccountPage\"> \r\n    ";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 ="\r\n      ";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\r\n\r\n\r\n";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\t";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 ="\r\n\tvar helpTechSupportUrl = \'";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="\';\r\n\tvar helpPageUrl = \'";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\';\r\n\tvar helpInterativeGuideUrl = \'";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 ="\';\r\n\tvar historyUrl = \"";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 ="\";\r\n\tvar pendingOperation = \"";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 ="\";\r\n\tvar _isPendingShipmentsReminderEnabled = ";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 =";\r\n\tvar _isNavigateAwayFromShipmentNotifyFlag = ";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 =";\r\n\tvar pendingRecords = \"";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 ="\";\r\n\tvar isEMEA_nav = ";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 =";\r\n\tvar hasGroundManifestReminder = ";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 =";\t\r\n\tvar freightEnabled = ";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 =" ;\r\n\tvar myEcommerceTabShown = ";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 =";\r\n\tvar packageHelp = true;\r\n\tvar _isReturnOnlyPrivilegeEnabled = ";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 =";\r\n\tvar _isImportShipmentAllowed = ";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 =";\r\n\tvar _isReturnShipmentNavigationAllowed = ";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 =";\r\n\t\r\n\t\t\r\n</script>\r\n<div>\r\n";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 ="\r\n\t<input type=\"hidden\" name=\"removeRelatedVO\" value=\"true\" id=\"removeRelatedVO\" />\r\n";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 ="\r\n</div>\r\n";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 ="\r\n<div id=\"cobrand-logo\">\r\n\t<IMG src=\"/images/ascend/shared/apps/";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 =".gif\" alt=\"Co Logo\"\r\n\t\tonerror=\"javascript:fillImage(this,\'/shipping/images/shared/dot_clear.gif\')\"\r\n\t\tborder=0 height=50 width=100 />\r\n</div>\r\n";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 ="\r\n<div id=\"appHeader\">\r\n\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"50%\">\r\n\t\t\t<h1 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 ="</h1>\r\n\t\t\t<input id=\"readOnlyOrphan\" style=\"display: none;\">\r\n\t\t\t\t<label for=\"readOnlyOrphan\" id=\"appTitle\">\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 ="\r\n\t\t\t\t\t<sup>\r\n\t\t\t\t\t\t&reg;\r\n\t\t\t\t\t</sup>\r\n\t\t\t\t</label>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\" align=\"right\">\r\n\t\t\t<a href=\"javascript:;\" id=\"myProfileLink\">";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 ="</a>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\r\n\t\t\t";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 ="\r\n\t\t\t\t<a href=\"javascript:;\" id=\"logoutLink\">";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 ="\r\n\t\t\t\t</a>\r\n\t\t\t";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 =" \r\n\t\t\t</td>\r\n\t\t\t<td width=\"10%\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 ="\r\n\t\t\t\t";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 ="\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 ="\r\n\t<span style=\"position:relative;display:none\">&nbsp;</span>\r\n\t<div aria-label=\"";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 ="\" tabindex=\"0\"></div>\r\n\t";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 ="\r\n\t<div id=\"appnav\" class=\"shipAppNav\">\r\n\t\t";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 ="\r\n\t\t\t";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 =" \r\n\t\t\t\t\t";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 ="\t   \r\n\t\t";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 ="\r\n\t       ";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 ="\r\n\t     ";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 ="\r\n\t\r\n\t\t\t";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 ="\r\n\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 ="\r\n\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 ="\r\n\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 ="\r\n\r\n\t\r\n\t\t\t";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 ="\r\n\t\t\t\t\t\r\n\t";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 ="\r\n\r\n\t\t\t";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 ="\r\n\t\t";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 ="\r\n\t</div>\r\n</div>\r\n";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 ="\r\n    ";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 =" \r\n     ";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 ="\r\n \r\n <script type=\"text/javascript\" charset=\"utf-8\">\r\n \r\n\tvar historyUrl = \"";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 ="\";\r\n\tvar _isCreditCardShipment = ";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

    private static java.lang.String  _wl_block103 =";\r\n\tvar freightEnabled = ";
    private final static byte[]  _wl_block103Bytes = _getBytes( _wl_block103 );

    private static java.lang.String  _wl_block104 =";\r\n\tvar packageHelp = false;\t\r\n\t\r\n\tvar pendingOperation = \"";
    private final static byte[]  _wl_block104Bytes = _getBytes( _wl_block104 );

    private static java.lang.String  _wl_block105 ="\";\t\r\n\tvar _isPendingShipmentsReminderEnabled = ";
    private final static byte[]  _wl_block105Bytes = _getBytes( _wl_block105 );

    private static java.lang.String  _wl_block106 =";\t\r\n\tvar pendingRecords = \"";
    private final static byte[]  _wl_block106Bytes = _getBytes( _wl_block106 );

    private static java.lang.String  _wl_block107 ="\";\r\n\tvar hasGroundManifestReminder = ";
    private final static byte[]  _wl_block107Bytes = _getBytes( _wl_block107 );

    private static java.lang.String  _wl_block108 =";\r\n\tvar _isReturnOnlyPrivilegeEnabled = ";
    private final static byte[]  _wl_block108Bytes = _getBytes( _wl_block108 );

    private static java.lang.String  _wl_block109 =";\r\n\tvar myEcommerceTabShown = ";
    private final static byte[]  _wl_block109Bytes = _getBytes( _wl_block109 );

    private static java.lang.String  _wl_block110 =";\t\t\r\n\t// #ITG 163023 - File:inetAppConfig.properties, Key:AccountMaskingEnabled\r\n\t// As part of cleanup isAccountMaskingEnabled variable is no longer exists\t\t\r\n\t\t\r\n</script>\r\n \r\n  ";
    private final static byte[]  _wl_block110Bytes = _getBytes( _wl_block110 );

    private static java.lang.String  _wl_block111 ="\r\n  ";
    private final static byte[]  _wl_block111Bytes = _getBytes( _wl_block111 );

    private static java.lang.String  _wl_block112 ="\r\n \r\n  ";
    private final static byte[]  _wl_block112Bytes = _getBytes( _wl_block112 );

    private static java.lang.String  _wl_block113 ="  \r\n  ";
    private final static byte[]  _wl_block113Bytes = _getBytes( _wl_block113 );

    private static java.lang.String  _wl_block114 ="\r\n  \r\n<div>\r\n";
    private final static byte[]  _wl_block114Bytes = _getBytes( _wl_block114 );

    private static java.lang.String  _wl_block115 ="\r\n</div>\r\n\r\n";
    private final static byte[]  _wl_block115Bytes = _getBytes( _wl_block115 );

    private static java.lang.String  _wl_block116 ="\r\n\r\n<div id=\"ltlAppHeader\">\r\n\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"50%\">\r\n\t\t\t<input id=\"readOnlyOrphan\" style=\"display: none;\">\r\n\t\t\t<h1 class=\"ui-hidden-accessibleH1\">FedEx Ship Manager<sup>&reg;</sup></h1>\r\n\t\t\t\t<label for=\"readOnlyOrphan\"  id=\"appTitle\" >\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block116Bytes = _getBytes( _wl_block116 );

    private static java.lang.String  _wl_block117 ="\r\n\t\t\t\t\t<sup>\r\n\t\t\t\t\t\t&reg;\r\n\t\t\t\t\t</sup>\r\n\t\t\t\t</label>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\r\n\t\t\t\t<a href=\"javascript:;\" id=\"myProfileLink\">";
    private final static byte[]  _wl_block117Bytes = _getBytes( _wl_block117 );

    private static java.lang.String  _wl_block118 ="</a>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block118Bytes = _getBytes( _wl_block118 );

    private static java.lang.String  _wl_block119 ="\r\n\t\t\t\t\t<a href=\"javascript:;\" id=\"logoutLink\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block119Bytes = _getBytes( _wl_block119 );

    private static java.lang.String  _wl_block120 ="\r\n\t\t\t\t\t</a>\r\n\t\t\t\t";
    private final static byte[]  _wl_block120Bytes = _getBytes( _wl_block120 );

    private static java.lang.String  _wl_block121 ="\r\n\t\t\t</td>\r\n\t\t\t<td width=\"10%\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block121Bytes = _getBytes( _wl_block121 );

    private static java.lang.String  _wl_block122 ="\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block122Bytes = _getBytes( _wl_block122 );

    private static java.lang.String  _wl_block123 ="\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t\r\n\t<span style=\"position:relative;display:none\">&nbsp;</span>\r\n\t<div aria-label=\"";
    private final static byte[]  _wl_block123Bytes = _getBytes( _wl_block123 );

    private static java.lang.String  _wl_block124 ="\" tabindex=\"0\"></div>\r\n\t<div id=\"appnav\" class=\"shipAppNav\">\r\n\t\t";
    private final static byte[]  _wl_block124Bytes = _getBytes( _wl_block124 );

    private static java.lang.String  _wl_block125 ="\r\n\t   ";
    private final static byte[]  _wl_block125Bytes = _getBytes( _wl_block125 );

    private static java.lang.String  _wl_block126 ="\t\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block126Bytes = _getBytes( _wl_block126 );

    private static java.lang.String  _wl_block127 ="\r\n\t    ";
    private final static byte[]  _wl_block127Bytes = _getBytes( _wl_block127 );

    private static java.lang.String  _wl_block128 ="    \r\n\t    \r\n\t    \r\n\t   ";
    private final static byte[]  _wl_block128Bytes = _getBytes( _wl_block128 );

    private static java.lang.String  _wl_block129 =" \r\n\t  \r\n\t\t";
    private final static byte[]  _wl_block129Bytes = _getBytes( _wl_block129 );

    private static java.lang.String  _wl_block130 ="\r\n\t\r\n\t\t";
    private final static byte[]  _wl_block130Bytes = _getBytes( _wl_block130 );

    private static java.lang.String  _wl_block131 ="\r\n\t\t\t\r\n      \t\t";
    private final static byte[]  _wl_block131Bytes = _getBytes( _wl_block131 );

    private static java.lang.String  _wl_block132 ="\r\n      \t\t";
    private final static byte[]  _wl_block132Bytes = _getBytes( _wl_block132 );

    private static java.lang.String  _wl_block133 ="\r\n      \t\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block133Bytes = _getBytes( _wl_block133 );

    private static java.lang.String  _wl_block134 ="\r\n\t\t\r\n\t\t   ";
    private final static byte[]  _wl_block134Bytes = _getBytes( _wl_block134 );

    private static java.lang.String  _wl_block135 ="\t\r\n\t\t   ";
    private final static byte[]  _wl_block135Bytes = _getBytes( _wl_block135 );

    private static java.lang.String  _wl_block136 ="\t\t\t\r\n\t\t\t\r\n\t\t ";
    private final static byte[]  _wl_block136Bytes = _getBytes( _wl_block136 );

    private static java.lang.String  _wl_block137 ="\r\n\t\t\t \r\n\t        ";
    private final static byte[]  _wl_block137Bytes = _getBytes( _wl_block137 );

    private static java.lang.String  _wl_block138 ="\r\n\t        ";
    private final static byte[]  _wl_block138Bytes = _getBytes( _wl_block138 );

    private static java.lang.String  _wl_block139 ="\t\r\n\t        \r\n\t     \t";
    private final static byte[]  _wl_block139Bytes = _getBytes( _wl_block139 );

    private static java.lang.String  _wl_block140 ="\r\n\t\t\t\r\n\t\t   ";
    private final static byte[]  _wl_block140Bytes = _getBytes( _wl_block140 );

    private static java.lang.String  _wl_block141 ="\t\t\t\r\n\t\t";
    private final static byte[]  _wl_block141Bytes = _getBytes( _wl_block141 );

    private static java.lang.String  _wl_block142 ="\t\r\n\t\t\r\n\t\t";
    private final static byte[]  _wl_block142Bytes = _getBytes( _wl_block142 );

    private static java.lang.String  _wl_block143 ="\r\n        <form name=\"addLtlAccount\" action=\"\"> \r\n       \r\n\t       <div id=\"position\">\r\n\t         <div id=\"content\">\t          \r\n\t         ";
    private final static byte[]  _wl_block143Bytes = _getBytes( _wl_block143 );

    private static java.lang.String  _wl_block144 =" ";
    private final static byte[]  _wl_block144Bytes = _getBytes( _wl_block144 );

    private static java.lang.String  _wl_block145 ="\r\n\t           <div id=\"createTitle\" class=\"fsmContentFull\">\r\n\t           <h2 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block145Bytes = _getBytes( _wl_block145 );

    private static java.lang.String  _wl_block146 ="</h2>\r\n\t\t\t\t  <label class=\"appName\" aria-hidden=\"true\">";
    private final static byte[]  _wl_block146Bytes = _getBytes( _wl_block146 );

    private static java.lang.String  _wl_block147 ="</label>\t\t\t\t  \r\n\t\t\t   </div> \r\n\t\t\t   ";
    private final static byte[]  _wl_block147Bytes = _getBytes( _wl_block147 );

    private static java.lang.String  _wl_block148 ="\r\n\t\t\t  \t\t\r\n\t\t\t  \r\n\t\t\t   <div class=\"fsmContentFull\" >\r\n\t\t\t\t   ";
    private final static byte[]  _wl_block148Bytes = _getBytes( _wl_block148 );

    private static java.lang.String  _wl_block149 ="\t\r\n\t\t\t\t\t      <div id=\"ship.contactAdmin\"  style=\"float:right\">\r\n\t\t\t\t\t\t\t<input type=\"button\" id=\"ship.button.contactAdmin\" class=\"btnGray\" value=\"";
    private final static byte[]  _wl_block149Bytes = _getBytes( _wl_block149 );

    private static java.lang.String  _wl_block150 ="\" aria-label=\"";
    private final static byte[]  _wl_block150Bytes = _getBytes( _wl_block150 );

    private static java.lang.String  _wl_block151 ="\"/>\r\n\t\t\t\t\t\t  </div>\r\n\t\t\t\t   ";
    private final static byte[]  _wl_block151Bytes = _getBytes( _wl_block151 );

    private static java.lang.String  _wl_block152 ="\r\n\t\t\t   </div> \r\n\t\t\t  <br></br>\t\r\n\t\t\t  ";
    private final static byte[]  _wl_block152Bytes = _getBytes( _wl_block152 );

    private static java.lang.String  _wl_block153 ="\r\n\t\t\t    <div id=\"message\" class=\"fsmContentFull\"> \r\n\t\t\t          ";
    private final static byte[]  _wl_block153Bytes = _getBytes( _wl_block153 );

    private static java.lang.String  _wl_block154 ="\r\n\t\t\t          \t<div id=\"alertMessage\" class=\"alrtLeft\">\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block154Bytes = _getBytes( _wl_block154 );

    private static java.lang.String  _wl_block155 =" \r\n\t\t\t\t\t\t</div>\t\t\t\t    \r\n\t\t\t\t\t\t<div class=\"alertText\">\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block155Bytes = _getBytes( _wl_block155 );

    private static java.lang.String  _wl_block156 ="\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t  ";
    private final static byte[]  _wl_block156Bytes = _getBytes( _wl_block156 );

    private static java.lang.String  _wl_block157 ="\r\n\t\t\t\t\t   ";
    private final static byte[]  _wl_block157Bytes = _getBytes( _wl_block157 );

    private static java.lang.String  _wl_block158 ="\r\n\t\t\t\t\t\t    <div id=\"alertMessage\" class=\"alrtLeft\">\r\n\t\t\t\t\t\t\t  ";
    private final static byte[]  _wl_block158Bytes = _getBytes( _wl_block158 );

    private static java.lang.String  _wl_block159 =" \r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"alertText\">\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block159Bytes = _getBytes( _wl_block159 );

    private static java.lang.String  _wl_block160 ="\r\n\t\t\t\t\t\t    </div> \t\t\t\t\t    \r\n\t\t\t\t\t  ";
    private final static byte[]  _wl_block160Bytes = _getBytes( _wl_block160 );

    private static java.lang.String  _wl_block161 ="\r\n\t\t\t\t\t  ";
    private final static byte[]  _wl_block161Bytes = _getBytes( _wl_block161 );

    private static java.lang.String  _wl_block162 ="\t\r\n\t\t\t    </div>\t\t\t      \r\n\t\t\t  ";
    private final static byte[]  _wl_block162Bytes = _getBytes( _wl_block162 );

    private static java.lang.String  _wl_block163 ="\r\n\t\t\t  ";
    private final static byte[]  _wl_block163Bytes = _getBytes( _wl_block163 );

    private static java.lang.String  _wl_block164 ="\t \r\n\t\t\t\t<div id=\"message\" class=\"fsmContentFull\"> \r\n\t\t\t\t\t";
    private final static byte[]  _wl_block164Bytes = _getBytes( _wl_block164 );

    private static java.lang.String  _wl_block165 =" \r\n\t\t\t\t\t<h2 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block165Bytes = _getBytes( _wl_block165 );

    private static java.lang.String  _wl_block166 ="</h2>  \r\n\t\t\t\t\t   \t<label class=\"appName\" aria-hidden=\"true\">";
    private final static byte[]  _wl_block166Bytes = _getBytes( _wl_block166 );

    private static java.lang.String  _wl_block167 ="</label><br><br><br>\r\n\r\n\t\t\t\t\t\t<div id=\"message\" class=\"alrtLeft\">\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block167Bytes = _getBytes( _wl_block167 );

    private static java.lang.String  _wl_block168 ="\r\n\t\t\t\t\t\t\t<div class=\"alertText\">\r\n\t\t\t\t\t\t\t   \t";
    private final static byte[]  _wl_block168Bytes = _getBytes( _wl_block168 );

    private static java.lang.String  _wl_block169 ="\r\n\t\t\t\t\t\t\t\t   \t";
    private final static byte[]  _wl_block169Bytes = _getBytes( _wl_block169 );

    private static java.lang.String  _wl_block170 ="<br></br>\r\n\t\t\t\t\t\t\t\t    <div id=\"account.addAccountLink\">\r\n\t\t\t\t\t\t\t\t     \t<a href=\"javascript:;\" id=\"account.addAccount\" onclick=\"location.href=\'addAccount.action\'\">\r\n\t\t\t\t\t\t\t\t\t   \t\t";
    private final static byte[]  _wl_block170Bytes = _getBytes( _wl_block170 );

    private static java.lang.String  _wl_block171 ="\r\n\t\t\t\t\t\t\t\t    \t</a>\r\n\t\t\t\t\t\t      \t\t</div>\r\n\t\t\t\t\t      \t\t";
    private final static byte[]  _wl_block171Bytes = _getBytes( _wl_block171 );

    private static java.lang.String  _wl_block172 ="<br></br>\r\n\t\t\t\t\t\t\t\t   \t";
    private final static byte[]  _wl_block172Bytes = _getBytes( _wl_block172 );

    private static java.lang.String  _wl_block173 ="\r\n\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block173Bytes = _getBytes( _wl_block173 );

    private static java.lang.String  _wl_block174 ="\r\n\t\t\t\t\t    \t</div>\r\n\t\t\t\t\t    </div>\r\n\t\t\t\t\t  ";
    private final static byte[]  _wl_block174Bytes = _getBytes( _wl_block174 );

    private static java.lang.String  _wl_block175 ="\r\n\t\t\t\t\t\t    <div id=\"alertMessage\" class=\"alrtLeft\">\r\n\t\t\t\t\t\t\t  \t";
    private final static byte[]  _wl_block175Bytes = _getBytes( _wl_block175 );

    private static java.lang.String  _wl_block176 ="\r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"alertText\">\r\n\r\n\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block176Bytes = _getBytes( _wl_block176 );

    private static java.lang.String  _wl_block177 ="\r\n\t\t\t\t\t\t\t\t\t";
    private final static byte[]  _wl_block177Bytes = _getBytes( _wl_block177 );

    private static java.lang.String  _wl_block178 ="\r\n\r\n\t\t\t\t\t\t    </div>\r\n\t\t\t\t\t  ";
    private final static byte[]  _wl_block178Bytes = _getBytes( _wl_block178 );

    private static java.lang.String  _wl_block179 ="\t\t\t\t\t  \r\n\t\t\t\t\t   ";
    private final static byte[]  _wl_block179Bytes = _getBytes( _wl_block179 );

    private static java.lang.String  _wl_block180 ="\r\n\t\t\t\t\t\t    <div id=\"alertMessage\"class=\"alrtLeft\">\r\n\t\t\t\t\t\t\t  ";
    private final static byte[]  _wl_block180Bytes = _getBytes( _wl_block180 );

    private static java.lang.String  _wl_block181 =" \r\n\t\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\t<div class=\"alertText\">\r\n\t\t\t\t\t\t\t \t";
    private final static byte[]  _wl_block181Bytes = _getBytes( _wl_block181 );

    private static java.lang.String  _wl_block182 ="\t\t\t\t\t\t  \r\n\t\t\t\t   </div> \r\n\t\t\t\t ";
    private final static byte[]  _wl_block182Bytes = _getBytes( _wl_block182 );

    private static java.lang.String  _wl_block183 =" \r\n\t         \r\n\t         </div>\t         \r\n\t      </div>\t       \r\n\t    </form>\t      \r\n   </div>\r\n   <br></br><br></br>\r\n</body>\r\n";
    private final static byte[]  _wl_block183Bytes = _getBytes( _wl_block183 );

    private static java.lang.String  _wl_block184 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block184Bytes = _getBytes( _wl_block184 );

    private static java.lang.String  _wl_block185 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block185Bytes = _getBytes( _wl_block185 );

    private static java.lang.String  _wl_block186 =".js\"></script>\r\n";
    private final static byte[]  _wl_block186Bytes = _getBytes( _wl_block186 );

    private static java.lang.String  _wl_block187 ="<script type=\"text/javascript\" charset=\"utf-8\" src=\"";
    private final static byte[]  _wl_block187Bytes = _getBytes( _wl_block187 );

    private static java.lang.String  _wl_block188 ="/js/fsm_constants";
    private final static byte[]  _wl_block188Bytes = _getBytes( _wl_block188 );

    private static java.lang.String  _wl_block189 =".js\"></script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"";
    private final static byte[]  _wl_block189Bytes = _getBytes( _wl_block189 );

    private static java.lang.String  _wl_block190 ="/js/fsm_util";
    private final static byte[]  _wl_block190Bytes = _getBytes( _wl_block190 );

    private static java.lang.String  _wl_block191 ="/js/fsm_ada";
    private final static byte[]  _wl_block191Bytes = _getBytes( _wl_block191 );

    private static java.lang.String  _wl_block192 =".js\"></script>\r\n<script type=\"text/javascript\" charset=\"utf-8\"\tsrc=\"";
    private final static byte[]  _wl_block192Bytes = _getBytes( _wl_block192 );

    private static java.lang.String  _wl_block193 ="/js/fsm_popupUtil";
    private final static byte[]  _wl_block193Bytes = _getBytes( _wl_block193 );

    private static java.lang.String  _wl_block194 ="/js/fsm_displayUtil";
    private final static byte[]  _wl_block194Bytes = _getBytes( _wl_block194 );

    private static java.lang.String  _wl_block195 ="/js/fsm_nav";
    private final static byte[]  _wl_block195Bytes = _getBytes( _wl_block195 );

    private static java.lang.String  _wl_block196 ="/js/fsm_ltlFooter";
    private final static byte[]  _wl_block196Bytes = _getBytes( _wl_block196 );

    private static java.lang.String  _wl_block197 ="/js/fsm_ajax";
    private final static byte[]  _wl_block197Bytes = _getBytes( _wl_block197 );

    private static java.lang.String  _wl_block198 ="\r\n    \r\n\t</div>\r\n    \t<div id=\"fedex-footer\">\r\n\t\t\t\r\n\t\t</div>\r\n\t</div>\r\n\t\r\n\t<script type=\"text/javascript\" charset=\"utf-8\" src=\"/templates/components/apps/contentim/contentim_include-min.js\"></script>";
    private final static byte[]  _wl_block198Bytes = _getBytes( _wl_block198 );

    private static java.lang.String  _wl_block199 ="\r\n\r\n<script>\r\n\tfsm.nav.init();\r\n\tfsm.ltlFooter.init();\t\r\n</script>\r\n";
    private final static byte[]  _wl_block199Bytes = _getBytes( _wl_block199 );

    static private weblogic.jsp.internal.jsp.JspFunctionMapper _jspx_fnmap = weblogic.jsp.internal.jsp.JspFunctionMapper.getInstance();
     static {_jspx_fnmap.mapFunction("valueStack:top", com.fedex.fsm.ship.web.taglib.Functions.class, "getTopOfValueStack", new Class[]{});
        _jspx_fnmap.mapFunction("valueStack:find", com.fedex.fsm.ship.web.taglib.Functions.class, "findOnValueStack", new Class[]{java.lang.String.class });
        _jspx_fnmap.mapFunction("valueStack:actionName", com.fedex.fsm.ship.web.taglib.Functions.class, "getActionName", new Class[]{});
    }

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
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block3Bytes, _wl_block3);
             org.apache.struts.taglib.html.HtmlTag __tag0 = null ;
            int __result__tag0 = 0 ;

            if (__tag0 == null ){
                __tag0 = new  org.apache.struts.taglib.html.HtmlTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
            }
            __tag0.setPageContext(pageContext);
            __tag0.setParent(null);
            _activeTag=__tag0;
            __result__tag0 = __tag0.doStartTag();

            if (__result__tag0!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag0== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
                do {
                    _bw.write(_wl_block4Bytes, _wl_block4);

java.util.Locale localee = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
String opMode = (String) request.getAttribute("operatingMode");
String localeLang = localee.getLanguage(); 
String countryLowerCase = localee.getCountry().toLowerCase();
String wssmlc =  countryLowerCase + "/" + localee.getLanguage() + "/fedex/inet/ship";
UserProfileAdapter usrProfileAdapter = WebUtils.getUserProfileAdapter(request);

if (opMode.equalsIgnoreCase((OperatingMode.LTL_FREIGHT).toString())) {
	wssmlc = wssmlc + "ltl/ship";
} else {
	wssmlc = wssmlc + "/ship";
}

                    _bw.write(_wl_block5Bytes, _wl_block5);
                     com.fedex.framework.taglib.encode.HtmlTag __tag1 = null ;
                    int __result__tag1 = 0 ;

                    if (__tag1 == null ){
                        __tag1 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
                    }
                    __tag1.setPageContext(pageContext);
                    __tag1.setParent(__tag0);
                    __tag1.setValue(wssmlc
);
                    _activeTag=__tag1;
                    __result__tag1 = __tag1.doStartTag();

                    if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block7Bytes, _wl_block7);
                    _bw.write(_wl_block2Bytes, _wl_block2);

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
     

                    _bw.write(_wl_block2Bytes, _wl_block2);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag3(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block8Bytes, _wl_block8);
 if(isChrome && !locale.getLanguage().equals("fr")) { 
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag4(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
 } 
                    _bw.write(_wl_block2Bytes, _wl_block2);
 if(isChrome) { 
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag5(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
 } 
                    _bw.write(_wl_block9Bytes, _wl_block9);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block10Bytes, _wl_block10);

                    if (_jsp__tag6(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block11Bytes, _wl_block11);

                    if (_jsp__tag7(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block12Bytes, _wl_block12);

                    if (_jsp__tag8(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block13Bytes, _wl_block13);

                    if (_jsp__tag9(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block14Bytes, _wl_block14);

                    if (_jsp__tag10(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block15Bytes, _wl_block15);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block16Bytes, _wl_block16);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020PickupEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block17Bytes, _wl_block17);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block18Bytes, _wl_block18);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase2Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block19Bytes, _wl_block19);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block20Bytes, _wl_block20);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestrictedForLTL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block21Bytes, _wl_block21);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020SMSEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block22Bytes, _wl_block22);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3_BI_Alert_Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block23Bytes, _wl_block23);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block25Bytes, _wl_block25);
                    _bw.write(_wl_block26Bytes, _wl_block26);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block27Bytes, _wl_block27);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block28Bytes, _wl_block28);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block29Bytes, _wl_block29);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block31Bytes, _wl_block31);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block33Bytes, _wl_block33);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block2Bytes, _wl_block2);

	
	String webCachePolicy = ApplicationPropertyLoader.getInstance().getProperty("WEBCache");
	String webCacheTimeStamp = ApplicationPropertyLoader.getInstance().getProperty("WEBCacheTimeStamp");
	webCacheTimeStamp = ((WebConstants.Y.equals(webCachePolicy) && !webCacheTimeStamp.startsWith("@")) ? "_"+webCacheTimeStamp : "");
	if(webCacheTimeStamp==null){
		webCacheTimeStamp="";
	}
	//System.out.println("webCacheTimeStamp= " + webCacheTimeStamp);
	LoggerFactory.getLogger().debug(
	        "webCacheTimeStamp= " + webCacheTimeStamp);

                    _bw.write(_wl_block34Bytes, _wl_block34);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);

	String helpPagUrl = URLBuilder.getHelpURL(locale, "quick_help");
	String localLang = locale.getLanguage();
	String contryLowerCase = locale.getCountry().toLowerCase();
	boolean isLeanTriggerEnabled = DecoupleState.INSTANCE.isLeanTriggerEnabled();

                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block0Bytes, _wl_block0);
if(isFreight2020Enabled){
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag11(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag12(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
}else{
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag13(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag14(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
}
                    _bw.write(_wl_block2Bytes, _wl_block2);

                    if (_jsp__tag15(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag16(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag17(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag18(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag19(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag20(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag21(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block37Bytes, _wl_block37);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(ApplicationPropertyLoader.getInstance().getProperty("AJAX_TIMEOUT") ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block38Bytes, _wl_block38);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag22 = null ;
                    int __result__tag22 = 0 ;

                    if (__tag22 == null ){
                        __tag22 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
                    }
                    __tag22.setPageContext(pageContext);
                    __tag22.setParent(__tag0);
                    __tag22.setValue(helpPagUrl
);
                    _activeTag=__tag22;
                    __result__tag22 = __tag22.doStartTag();

                    if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag22);
                        return;
                    }
                    _activeTag=__tag22.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
                    __tag22.release();
                    _bw.write(_wl_block39Bytes, _wl_block39);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpPage}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block40Bytes, _wl_block40);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block41Bytes, _wl_block41);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag23 = null ;
                    int __result__tag23 = 0 ;

                    if (__tag23 == null ){
                        __tag23 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
                    }
                    __tag23.setPageContext(pageContext);
                    __tag23.setParent(__tag0);
                    __tag23.setValue(utype
);
                    _activeTag=__tag23;
                    __result__tag23 = __tag23.doStartTag();

                    if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
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
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${adminEmail}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block43Bytes, _wl_block43);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag24 = null ;
                    int __result__tag24 = 0 ;

                    if (__tag24 == null ){
                        __tag24 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
                    }
                    __tag24.setPageContext(pageContext);
                    __tag24.setParent(__tag0);
                    __tag24.setValue(localLang
);
                    _activeTag=__tag24;
                    __result__tag24 = __tag24.doStartTag();

                    if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag24.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag24);
                        return;
                    }
                    _activeTag=__tag24.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag24);
                    __tag24.release();
                    _bw.write(_wl_block44Bytes, _wl_block44);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag25 = null ;
                    int __result__tag25 = 0 ;

                    if (__tag25 == null ){
                        __tag25 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
                    }
                    __tag25.setPageContext(pageContext);
                    __tag25.setParent(__tag0);
                    __tag25.setValue(contryLowerCase
);
                    _activeTag=__tag25;
                    __result__tag25 = __tag25.doStartTag();

                    if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag25.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag25);
                        return;
                    }
                    _activeTag=__tag25.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag25);
                    __tag25.release();
                    _bw.write(_wl_block45Bytes, _wl_block45);

String menu = (String) request.getAttribute("operatingMode");
if (menu.equalsIgnoreCase((OperatingMode.PACKAGE).toString())) {
  request.setAttribute("PRIMARY_MENU",WebConstants.SHIP_MENU);
}else{
  request.setAttribute("PRIMARY_MENU",WebConstants.FREIGHT_MENU);
} 



                    _bw.write(_wl_block46Bytes, _wl_block46);

                    if (_jsp__tag26(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block2Bytes, _wl_block2);

SenderDisplayRules senderDisplayRulesHeader = new SenderDisplayRules();
java.util.Locale localeHeader = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
String localeCountryHeader = localeHeader.getCountry();

                    _bw.write(_wl_block47Bytes, _wl_block47);
                    _bw.write(_wl_block48Bytes, _wl_block48);
                     org.apache.struts2.views.jsp.IfTag __tag27 = null ;
                    int __result__tag27 = 0 ;

                    if (__tag27 == null ){
                        __tag27 = new  org.apache.struts2.views.jsp.IfTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
                    }
                    __tag27.setPageContext(pageContext);
                    __tag27.setParent(__tag0);
                    __tag27.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{operatingMode == \'PACKAGE\'}", java.lang.String.class,"test"));
                    _activeTag=__tag27;
                    __result__tag27 = __tag27.doStartTag();

                    if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        try {
                            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.pushBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                __tag27.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                __tag27.doInitBody();
                            }
                            do {
                                _bw.write(_wl_block49Bytes, _wl_block49);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block50Bytes, _wl_block50);

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
	

                                _bw.write(_wl_block51Bytes, _wl_block51);
	if (isCanada) { // quick fix for defect 55403 - since canada doesn't have 'tech support' item, 'interactive guide' is taking its position
	      helpTechSupportUrl = helpInterativeGuideUrl;
	    }
	
                                _bw.write(_wl_block52Bytes, _wl_block52);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(helpTechSupportUrl), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block53Bytes, _wl_block53);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag28 = null ;
                                int __result__tag28 = 0 ;

                                if (__tag28 == null ){
                                    __tag28 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
                                }
                                __tag28.setPageContext(pageContext);
                                __tag28.setParent(__tag27);
                                __tag28.setValue(helpPageUrl
);
                                _activeTag=__tag28;
                                __result__tag28 = __tag28.doStartTag();

                                if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag28);
                                    return;
                                }
                                _activeTag=__tag28.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
                                __tag28.release();
                                _bw.write(_wl_block54Bytes, _wl_block54);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag29 = null ;
                                int __result__tag29 = 0 ;

                                if (__tag29 == null ){
                                    __tag29 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
                                }
                                __tag29.setPageContext(pageContext);
                                __tag29.setParent(__tag27);
                                __tag29.setValue(helpInterativeGuideUrl
);
                                _activeTag=__tag29;
                                __result__tag29 = __tag29.doStartTag();

                                if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag29.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag29);
                                    return;
                                }
                                _activeTag=__tag29.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag29);
                                __tag29.release();
                                _bw.write(_wl_block55Bytes, _wl_block55);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag30 = null ;
                                int __result__tag30 = 0 ;

                                if (__tag30 == null ){
                                    __tag30 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
                                }
                                __tag30.setPageContext(pageContext);
                                __tag30.setParent(__tag27);
                                __tag30.setValue(historyUrl
);
                                _activeTag=__tag30;
                                __result__tag30 = __tag30.doStartTag();

                                if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag30.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag30);
                                    return;
                                }
                                _activeTag=__tag30.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag30);
                                __tag30.release();
                                _bw.write(_wl_block56Bytes, _wl_block56);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag31 = null ;
                                int __result__tag31 = 0 ;

                                if (__tag31 == null ){
                                    __tag31 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
                                }
                                __tag31.setPageContext(pageContext);
                                __tag31.setParent(__tag27);
                                __tag31.setValue( pendingOperation 
);
                                _activeTag=__tag31;
                                __result__tag31 = __tag31.doStartTag();

                                if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag31.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag31);
                                    return;
                                }
                                _activeTag=__tag31.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag31);
                                __tag31.release();
                                _bw.write(_wl_block57Bytes, _wl_block57);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPendingShipmentsReminderEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block58Bytes, _wl_block58);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNavigateAwayFromShipmentNotifyFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block59Bytes, _wl_block59);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag32 = null ;
                                int __result__tag32 = 0 ;

                                if (__tag32 == null ){
                                    __tag32 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
                                }
                                __tag32.setPageContext(pageContext);
                                __tag32.setParent(__tag27);
                                __tag32.setValue(pendingRecords
);
                                _activeTag=__tag32;
                                __result__tag32 = __tag32.doStartTag();

                                if (__result__tag32!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag32== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag32.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag32);
                                    return;
                                }
                                _activeTag=__tag32.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag32);
                                __tag32.release();
                                _bw.write(_wl_block60Bytes, _wl_block60);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isEMEA), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block61Bytes, _wl_block61);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(hasGroundManifestReminder), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block62Bytes, _wl_block62);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freightEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block63Bytes, _wl_block63);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf( myEcommerceTabShown ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block64Bytes, _wl_block64);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnOnlyPrivilegeEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block65Bytes, _wl_block65);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isImportShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block66Bytes, _wl_block66);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipmentNavigationAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block67Bytes, _wl_block67);

                                if (_jsp__tag33(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block69Bytes, _wl_block69);

	if (cobrandLogo) {

                                _bw.write(_wl_block70Bytes, _wl_block70);
                                 com.fedex.framework.taglib.encode.UrlTag __tag34 = null ;
                                int __result__tag34 = 0 ;

                                if (__tag34 == null ){
                                    __tag34 = new  com.fedex.framework.taglib.encode.UrlTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag34);
                                }
                                __tag34.setPageContext(pageContext);
                                __tag34.setParent(__tag27);
                                __tag34.setValue(companyCd
);
                                _activeTag=__tag34;
                                __result__tag34 = __tag34.doStartTag();

                                if (__result__tag34!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag34== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.UrlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag34.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag34);
                                    return;
                                }
                                _activeTag=__tag34.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag34);
                                __tag34.release();
                                _bw.write(_wl_block71Bytes, _wl_block71);

	}

                                _bw.write(_wl_block72Bytes, _wl_block72);

                                if (_jsp__tag35(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block73Bytes, _wl_block73);

                                if (_jsp__tag36(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block74Bytes, _wl_block74);

                                if (_jsp__tag37(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block75Bytes, _wl_block75);
 if (isFclUser) { 
                                _bw.write(_wl_block76Bytes, _wl_block76);

                                if (_jsp__tag38(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block77Bytes, _wl_block77);
 } 
                                _bw.write(_wl_block78Bytes, _wl_block78);
                                 com.fedex.framework.taglib.HelpMenuTag __tag39 = null ;
                                int __result__tag39 = 0 ;

                                if (__tag39 == null ){
                                    __tag39 = new  com.fedex.framework.taglib.HelpMenuTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag39);
                                }
                                __tag39.setPageContext(pageContext);
                                __tag39.setParent(__tag27);
                                __tag39.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("help.menu.ship", java.lang.String.class,"id"));
                                __tag39.setTitle(helpTitle
);
                                __tag39.setHelpWidth(helpWidth
);
                                __tag39.setItemsMenuWidth(itemsMenuWidth
);
                                _activeTag=__tag39;
                                __result__tag39 = __tag39.doStartTag();

                                if (__result__tag39!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag39== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                    do {
                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                         com.fedex.framework.taglib.HelpMenuItemTag __tag40 = null ;
                                        int __result__tag40 = 0 ;

                                        if (__tag40 == null ){
                                            __tag40 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag40);
                                        }
                                        __tag40.setPageContext(pageContext);
                                        __tag40.setParent(__tag39);
                                        __tag40.sethelpMenuItem(helpItem1
);
                                        _activeTag=__tag40;
                                        __result__tag40 = __tag40.doStartTag();

                                        if (__result__tag40!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag40== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block79Bytes, _wl_block79);
                                            } while (__tag40.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag40.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag40);
                                            return;
                                        }
                                        _activeTag=__tag40.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag40);
                                        __tag40.release();
                                        _bw.write(_wl_block79Bytes, _wl_block79);

						if (isUnitedStates) {
					
                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                         com.fedex.framework.taglib.HelpMenuItemTag __tag41 = null ;
                                        int __result__tag41 = 0 ;

                                        if (__tag41 == null ){
                                            __tag41 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag41);
                                        }
                                        __tag41.setPageContext(pageContext);
                                        __tag41.setParent(__tag39);
                                        __tag41.sethelpMenuItem(helpItem2
);
                                        _activeTag=__tag41;
                                        __result__tag41 = __tag41.doStartTag();

                                        if (__result__tag41!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag41== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block79Bytes, _wl_block79);
                                            } while (__tag41.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag41.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag41);
                                            return;
                                        }
                                        _activeTag=__tag41.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag41);
                                        __tag41.release();
                                        _bw.write(_wl_block79Bytes, _wl_block79);

						}
					
                                        _bw.write(_wl_block79Bytes, _wl_block79);

						if (isUnitedStates || isCanada || isEMEA) {
					
                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                         com.fedex.framework.taglib.HelpMenuItemTag __tag42 = null ;
                                        int __result__tag42 = 0 ;

                                        if (__tag42 == null ){
                                            __tag42 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag42);
                                        }
                                        __tag42.setPageContext(pageContext);
                                        __tag42.setParent(__tag39);
                                        __tag42.sethelpMenuItem(helpItem3
);
                                        _activeTag=__tag42;
                                        __result__tag42 = __tag42.doStartTag();

                                        if (__result__tag42!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag42== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block79Bytes, _wl_block79);
                                            } while (__tag42.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag42.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag42);
                                            return;
                                        }
                                        _activeTag=__tag42.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag42);
                                        __tag42.release();
                                        _bw.write(_wl_block79Bytes, _wl_block79);

						}
					
                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                    } while (__tag39.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                }
                                if (__tag39.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag39);
                                    return;
                                }
                                _activeTag=__tag39.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag39);
                                __tag39.release();
                                _bw.write(_wl_block81Bytes, _wl_block81);
                                _bw.write(_wl_block82Bytes, _wl_block82);

                                if (_jsp__tag43(request, response, pageContext, _activeTag, __tag27))
                                 return;
                                _bw.write(_wl_block83Bytes, _wl_block83);
                                _bw.write(_wl_block84Bytes, _wl_block84);
                                 com.fedex.framework.taglib.MenuTag __tag44 = null ;
                                int __result__tag44 = 0 ;

                                if (__tag44 == null ){
                                    __tag44 = new  com.fedex.framework.taglib.MenuTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag44);
                                }
                                __tag44.setPageContext(pageContext);
                                __tag44.setParent(__tag27);
                                __tag44.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menubar.nav", java.lang.String.class,"id"));
                                _activeTag=__tag44;
                                __result__tag44 = __tag44.doStartTag();

                                if (__result__tag44!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag44== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                    do {
                                        _bw.write(_wl_block85Bytes, _wl_block85);
                                         com.fedex.framework.taglib.MenuTabTag __tag45 = null ;
                                        int __result__tag45 = 0 ;

                                        if (__tag45 == null ){
                                            __tag45 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag45);
                                        }
                                        __tag45.setPageContext(pageContext);
                                        __tag45.setParent(__tag44);
                                        __tag45.setTitle(prepareShipmentTab
);
                                        __tag45.setSelectedMenuTab(isShipmentSelected
);
                                        __tag45.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                                        __tag45.setTabWidth(shipTabWidth
);
                                        __tag45.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag45;
                                        __result__tag45 = __tag45.doStartTag();

                                        if (__result__tag45!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag45== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block36Bytes, _wl_block36);

	   			if (!isReturnOnlyPrivilegeEnabled) { 
                                                _bw.write(_wl_block86Bytes, _wl_block86);
                                                 com.fedex.framework.taglib.MenuItemTag __tag46 = null ;
                                                int __result__tag46 = 0 ;

                                                if (__tag46 == null ){
                                                    __tag46 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag46);
                                                }
                                                __tag46.setPageContext(pageContext);
                                                __tag46.setParent(__tag45);
                                                __tag46.setMenuItem(createShipmentMenu
);
                                                _activeTag=__tag46;
                                                __result__tag46 = __tag46.doStartTag();

                                                if (__result__tag46!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag46== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                                    } while (__tag46.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag46.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag46);
                                                    return;
                                                }
                                                _activeTag=__tag46.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag46);
                                                __tag46.release();
                                                _bw.write(_wl_block36Bytes, _wl_block36);
  		}
	            if(userProfileAdapter.isReturnShipmentNavigationAllowed()){ 
                                                _bw.write(_wl_block79Bytes, _wl_block79);
                                                 com.fedex.framework.taglib.MenuItemTag __tag47 = null ;
                                                int __result__tag47 = 0 ;

                                                if (__tag47 == null ){
                                                    __tag47 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag47);
                                                }
                                                __tag47.setPageContext(pageContext);
                                                __tag47.setParent(__tag45);
                                                __tag47.setMenuItem(createReturnShipmentMenu
);
                                                _activeTag=__tag47;
                                                __result__tag47 = __tag47.doStartTag();

                                                if (__result__tag47!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag47== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                                    } while (__tag47.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag47.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag47);
                                                    return;
                                                }
                                                _activeTag=__tag47.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag47);
                                                __tag47.release();
                                                _bw.write(_wl_block36Bytes, _wl_block36);
			}
	   			if (!isReturnOnlyPrivilegeEnabled && isImportShipmentAllowed) { 
                                                _bw.write(_wl_block86Bytes, _wl_block86);
                                                 com.fedex.framework.taglib.MenuItemTag __tag48 = null ;
                                                int __result__tag48 = 0 ;

                                                if (__tag48 == null ){
                                                    __tag48 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag48);
                                                }
                                                __tag48.setPageContext(pageContext);
                                                __tag48.setParent(__tag45);
                                                __tag48.setMenuItem(createImportShipmentMenu
);
                                                _activeTag=__tag48;
                                                __result__tag48 = __tag48.doStartTag();

                                                if (__result__tag48!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag48== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block79Bytes, _wl_block79);
                                                    } while (__tag48.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag48.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag48);
                                                    return;
                                                }
                                                _activeTag=__tag48.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag48);
                                                __tag48.release();
                                                _bw.write(_wl_block36Bytes, _wl_block36);
  		} 
                                                _bw.write(_wl_block80Bytes, _wl_block80);
                                                 com.fedex.framework.taglib.MenuItemTag __tag49 = null ;
                                                int __result__tag49 = 0 ;

                                                if (__tag49 == null ){
                                                    __tag49 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag49);
                                                }
                                                __tag49.setPageContext(pageContext);
                                                __tag49.setParent(__tag45);
                                                __tag49.setMenuItem(viewPendingShipmentMenu
);
                                                _activeTag=__tag49;
                                                __result__tag49 = __tag49.doStartTag();

                                                if (__result__tag49!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag49== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                                    } while (__tag49.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag49.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag49);
                                                    return;
                                                }
                                                _activeTag=__tag49.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag49);
                                                __tag49.release();
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag45.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag45.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag45);
                                            return;
                                        }
                                        _activeTag=__tag45.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag45);
                                        __tag45.release();
                                        _bw.write(_wl_block36Bytes, _wl_block36);
   
	   if (isFclUser) {    
	   
	
                                        _bw.write(_wl_block87Bytes, _wl_block87);
if(freightEnabled) {
                                        _bw.write(_wl_block88Bytes, _wl_block88);
                                         com.fedex.framework.taglib.MenuTabTag __tag50 = null ;
                                        int __result__tag50 = 0 ;

                                        if (__tag50 == null ){
                                            __tag50 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag50);
                                        }
                                        __tag50.setPageContext(pageContext);
                                        __tag50.setParent(__tag44);
                                        __tag50.setTitle(ltlFreightTab
);
                                        __tag50.setSelectedMenuTab(isFreightMenuSelected
);
                                        __tag50.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag50.setTabWidth(tabWidth
);
                                        __tag50.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag50;
                                        __result__tag50 = __tag50.doStartTag();

                                        if (__result__tag50!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag50== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag50.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag50.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag50);
                                            return;
                                        }
                                        _activeTag=__tag50.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag50);
                                        __tag50.release();
                                        _bw.write(_wl_block89Bytes, _wl_block89);
} 
                                        _bw.write(_wl_block90Bytes, _wl_block90);
                                         com.fedex.framework.taglib.MenuTabTag __tag51 = null ;
                                        int __result__tag51 = 0 ;

                                        if (__tag51 == null ){
                                            __tag51 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag51);
                                        }
                                        __tag51.setPageContext(pageContext);
                                        __tag51.setParent(__tag44);
                                        __tag51.setTitle(shipHistoryTab
);
                                        __tag51.setSelectedMenuTab(isHistoryMenuSelected
);
                                        __tag51.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag51.setTabWidth(histTabWidth
);
                                        __tag51.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag51;
                                        __result__tag51 = __tag51.doStartTag();

                                        if (__result__tag51!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag51== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag51.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag51.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag51);
                                            return;
                                        }
                                        _activeTag=__tag51.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag51);
                                        __tag51.release();
                                        _bw.write(_wl_block90Bytes, _wl_block90);
                                         com.fedex.framework.taglib.MenuTabTag __tag52 = null ;
                                        int __result__tag52 = 0 ;

                                        if (__tag52 == null ){
                                            __tag52 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag52);
                                        }
                                        __tag52.setPageContext(pageContext);
                                        __tag52.setParent(__tag44);
                                        __tag52.setTitle(myListsTab
);
                                        __tag52.setSelectedMenuTab(isListsMenuSelected
);
                                        __tag52.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                                        __tag52.setTabWidth(myListsTabWidth
);
                                        __tag52.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag52;
                                        __result__tag52 = __tag52.doStartTag();

                                        if (__result__tag52!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag52== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block80Bytes, _wl_block80);
                                                 com.fedex.framework.taglib.MenuItemTag __tag53 = null ;
                                                int __result__tag53 = 0 ;

                                                if (__tag53 == null ){
                                                    __tag53 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag53);
                                                }
                                                __tag53.setPageContext(pageContext);
                                                __tag53.setParent(__tag52);
                                                __tag53.setMenuItem(addressBookMenu
);
                                                _activeTag=__tag53;
                                                __result__tag53 = __tag53.doStartTag();

                                                if (__result__tag53!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag53== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                                    } while (__tag53.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag53.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag53);
                                                    return;
                                                }
                                                _activeTag=__tag53.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag53);
                                                __tag53.release();
                                                _bw.write(_wl_block91Bytes, _wl_block91);
                                                 com.fedex.framework.taglib.MenuItemTag __tag54 = null ;
                                                int __result__tag54 = 0 ;

                                                if (__tag54 == null ){
                                                    __tag54 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag54);
                                                }
                                                __tag54.setPageContext(pageContext);
                                                __tag54.setParent(__tag52);
                                                __tag54.setMenuItem(shipmentProfilesMenu
);
                                                _activeTag=__tag54;
                                                __result__tag54 = __tag54.doStartTag();

                                                if (__result__tag54!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag54== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                                    } while (__tag54.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag54.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag54);
                                                    return;
                                                }
                                                _activeTag=__tag54.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag54);
                                                __tag54.release();
                                                _bw.write(_wl_block92Bytes, _wl_block92);
                                                 com.fedex.framework.taglib.MenuItemTag __tag55 = null ;
                                                int __result__tag55 = 0 ;

                                                if (__tag55 == null ){
                                                    __tag55 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag55);
                                                }
                                                __tag55.setPageContext(pageContext);
                                                __tag55.setParent(__tag52);
                                                __tag55.setMenuItem(dimensionsMenu
);
                                                _activeTag=__tag55;
                                                __result__tag55 = __tag55.doStartTag();

                                                if (__result__tag55!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag55== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                                    } while (__tag55.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag55.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag55);
                                                    return;
                                                }
                                                _activeTag=__tag55.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag55);
                                                __tag55.release();
                                                _bw.write(_wl_block93Bytes, _wl_block93);
if(freightEnabled) {
                                                _bw.write(_wl_block80Bytes, _wl_block80);
                                                 com.fedex.framework.taglib.MenuItemTag __tag56 = null ;
                                                int __result__tag56 = 0 ;

                                                if (__tag56 == null ){
                                                    __tag56 = new  com.fedex.framework.taglib.MenuItemTag ();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag56);
                                                }
                                                __tag56.setPageContext(pageContext);
                                                __tag56.setParent(__tag52);
                                                __tag56.setMenuItem(bolLineItemProfilesMenu
);
                                                _activeTag=__tag56;
                                                __result__tag56 = __tag56.doStartTag();

                                                if (__result__tag56!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                    if (__result__tag56== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                    }
                                                    do {
                                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                                    } while (__tag56.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                }
                                                if (__tag56.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                    _activeTag = null;
                                                    _releaseTags(pageContext, __tag56);
                                                    return;
                                                }
                                                _activeTag=__tag56.getParent();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag56);
                                                __tag56.release();
                                                _bw.write(_wl_block80Bytes, _wl_block80);
 }  
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag52.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag52.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag52);
                                            return;
                                        }
                                        _activeTag=__tag52.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag52);
                                        __tag52.release();
                                        _bw.write(_wl_block94Bytes, _wl_block94);
                                         com.fedex.framework.taglib.MenuTabTag __tag57 = null ;
                                        int __result__tag57 = 0 ;

                                        if (__tag57 == null ){
                                            __tag57 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag57);
                                        }
                                        __tag57.setPageContext(pageContext);
                                        __tag57.setParent(__tag44);
                                        __tag57.setTitle(reportsTab
);
                                        __tag57.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag57.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag57.setTabWidth(tabWidth
);
                                        __tag57.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag57;
                                        __result__tag57 = __tag57.doStartTag();

                                        if (__result__tag57!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag57== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag57.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag57.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag57);
                                            return;
                                        }
                                        _activeTag=__tag57.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag57);
                                        __tag57.release();
                                        _bw.write(_wl_block95Bytes, _wl_block95);
 if (myEcommerceTabShown) { 
                                        _bw.write(_wl_block88Bytes, _wl_block88);
                                         com.fedex.framework.taglib.MenuTabTag __tag58 = null ;
                                        int __result__tag58 = 0 ;

                                        if (__tag58 == null ){
                                            __tag58 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag58);
                                        }
                                        __tag58.setPageContext(pageContext);
                                        __tag58.setParent(__tag44);
                                        __tag58.setTitle(myEcommerceTab
);
                                        __tag58.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag58.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag58.setTabWidth(shipTabWidth
);
                                        __tag58.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag58;
                                        __result__tag58 = __tag58.doStartTag();

                                        if (__result__tag58!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag58== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag58.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag58.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag58);
                                            return;
                                        }
                                        _activeTag=__tag58.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag58);
                                        __tag58.release();
                                        _bw.write(_wl_block36Bytes, _wl_block36);
 } 
                                        _bw.write(_wl_block96Bytes, _wl_block96);

				if (userProfileAdapter.isPasskeyAdmin() || isGlobalCustomerAdministrationEnabled) {
			
                                        _bw.write(_wl_block85Bytes, _wl_block85);
                                         com.fedex.framework.taglib.MenuTabTag __tag59 = null ;
                                        int __result__tag59 = 0 ;

                                        if (__tag59 == null ){
                                            __tag59 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag59);
                                        }
                                        __tag59.setPageContext(pageContext);
                                        __tag59.setParent(__tag44);
                                        __tag59.setTitle(adminTab
);
                                        __tag59.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag59.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag59.setTabWidth(adminTabWidth
);
                                        __tag59.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("150")).intValue());
                                        _activeTag=__tag59;
                                        __result__tag59 = __tag59.doStartTag();

                                        if (__result__tag59!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag59== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag59.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag59.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag59);
                                            return;
                                        }
                                        _activeTag=__tag59.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag59);
                                        __tag59.release();
                                        _bw.write(_wl_block36Bytes, _wl_block36);

			}
		}
	
                                        _bw.write(_wl_block97Bytes, _wl_block97);
                                    } while (__tag44.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                }
                                if (__tag44.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag44);
                                    return;
                                }
                                _activeTag=__tag44.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag44);
                                __tag44.release();
                                _bw.write(_wl_block98Bytes, _wl_block98);
                                _bw.write(_wl_block99Bytes, _wl_block99);
                            } while (__tag27.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                        } finally {
                            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.popBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                            }
                        }
                    }
                    if (__tag27.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag27);
                        return;
                    }
                    _activeTag=__tag27.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag27);
                    __tag27.release();
                    _bw.write(_wl_block99Bytes, _wl_block99);
                     org.apache.struts2.views.jsp.ElseTag __tag60 = null ;
                    int __result__tag60 = 0 ;

                    if (__tag60 == null ){
                        __tag60 = new  org.apache.struts2.views.jsp.ElseTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag60);
                    }
                    __tag60.setPageContext(pageContext);
                    __tag60.setParent(__tag0);
                    _activeTag=__tag60;
                    __result__tag60 = __tag60.doStartTag();

                    if (__result__tag60!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        try {
                            if (__result__tag60== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.pushBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                __tag60.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                __tag60.doInitBody();
                            }
                            do {
                                _bw.write(_wl_block100Bytes, _wl_block100);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block2Bytes, _wl_block2);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block7Bytes, _wl_block7);
                                _bw.write(_wl_block0Bytes, _wl_block0);
                                _bw.write(_wl_block2Bytes, _wl_block2);

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
	
	String historyUrl = URLBuilder.getShipHistoryEntryUrl(request);
	String pendingOperation = (String) request.getAttribute(WebConstants.PENDING_OPERATION_VAR);
	// set to empty string so javascript check works; otherwise, it'll be "null".
	if (pendingOperation == null)
	{
		pendingOperation = "";
	}
	String pendingRecords = (String) request.getAttribute(WebConstants.PENDING_RECORDS_AVAILABLE);	
 
    UserProfileAdapter userProfileAdapter = WebUtils.getUserProfileAdapter(request);
	boolean isCreditCardShipment = userProfileAdapter.isCreditCardUser();
	boolean isLoggedInUser = userProfileAdapter.isFclUser(); 
	boolean isReturnOnlyPrivilegeEnabled = userProfileAdapter.isReturnOnlyPrivilegeEnabled();
	boolean isImportShipmentAllowed = DecoupleState.INSTANCE.isImportShipmentAllowed();
	boolean isReturnShipmentNavigationAllowed = userProfileAdapter.isReturnShipmentNavigationAllowed();
 	boolean isEnglishLanguage = WebConstants.ENGLISH_LANGUAGE_CODE.equalsIgnoreCase(locale.getLanguage());
	boolean isUnitedStates = CountryConstants.UNITEDSTATES_COUNTRY_CODE.equals(locale.getCountry());
	// #ITG 163023 - File:inetAppConfig.properties, Key:EnableMyEcommerce
	// As part of cleanup isMyEcommerceEnabled() is no longer exists in DecoupleState.java
	boolean	myEcommerceTabShown = (!isCreditCardShipment && isUnitedStates && isEnglishLanguage);
	// #ITG 163023 - File:inetAppConfig.properties, Key:AccountMaskingEnabled
	// As part of cleanup isAccountMaskingEnabled() is no longer exists in DecoupleState.java
	String companyCode = userProfileAdapter.getCompanyCode();
	//Jul 2016 CL - EACI 2.5 Part 3
	boolean isGlobalCustomerAdministrationEnabled = DecoupleState.INSTANCE.isGlobalCustomerAdministrationEnabled();
 
                                _bw.write(_wl_block101Bytes, _wl_block101);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag61 = null ;
                                int __result__tag61 = 0 ;

                                if (__tag61 == null ){
                                    __tag61 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag61);
                                }
                                __tag61.setPageContext(pageContext);
                                __tag61.setParent(__tag60);
                                __tag61.setValue(historyUrl
);
                                _activeTag=__tag61;
                                __result__tag61 = __tag61.doStartTag();

                                if (__result__tag61!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag61== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag61.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag61);
                                    return;
                                }
                                _activeTag=__tag61.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag61);
                                __tag61.release();
                                _bw.write(_wl_block102Bytes, _wl_block102);

                                if (_jsp__tag62(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block103Bytes, _wl_block103);

                                if (_jsp__tag63(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block104Bytes, _wl_block104);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag64 = null ;
                                int __result__tag64 = 0 ;

                                if (__tag64 == null ){
                                    __tag64 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag64);
                                }
                                __tag64.setPageContext(pageContext);
                                __tag64.setParent(__tag60);
                                __tag64.setValue(pendingOperation 
);
                                _activeTag=__tag64;
                                __result__tag64 = __tag64.doStartTag();

                                if (__result__tag64!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag64== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag64.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag64);
                                    return;
                                }
                                _activeTag=__tag64.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag64);
                                __tag64.release();
                                _bw.write(_wl_block105Bytes, _wl_block105);

                                if (_jsp__tag65(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block58Bytes, _wl_block58);

                                if (_jsp__tag66(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block106Bytes, _wl_block106);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag67 = null ;
                                int __result__tag67 = 0 ;

                                if (__tag67 == null ){
                                    __tag67 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag67);
                                }
                                __tag67.setPageContext(pageContext);
                                __tag67.setParent(__tag60);
                                __tag67.setValue(pendingRecords
);
                                _activeTag=__tag67;
                                __result__tag67 = __tag67.doStartTag();

                                if (__result__tag67!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag67== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag67.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag67);
                                    return;
                                }
                                _activeTag=__tag67.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag67);
                                __tag67.release();
                                _bw.write(_wl_block107Bytes, _wl_block107);

                                if (_jsp__tag68(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block108Bytes, _wl_block108);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag69 = null ;
                                int __result__tag69 = 0 ;

                                if (__tag69 == null ){
                                    __tag69 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag69);
                                }
                                __tag69.setPageContext(pageContext);
                                __tag69.setParent(__tag60);
                                __tag69.setValue(isReturnOnlyPrivilegeEnabled
);
                                _activeTag=__tag69;
                                __result__tag69 = __tag69.doStartTag();

                                if (__result__tag69!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag69== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag69.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag69);
                                    return;
                                }
                                _activeTag=__tag69.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag69);
                                __tag69.release();
                                _bw.write(_wl_block65Bytes, _wl_block65);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag70 = null ;
                                int __result__tag70 = 0 ;

                                if (__tag70 == null ){
                                    __tag70 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag70);
                                }
                                __tag70.setPageContext(pageContext);
                                __tag70.setParent(__tag60);
                                __tag70.setValue(isImportShipmentAllowed
);
                                _activeTag=__tag70;
                                __result__tag70 = __tag70.doStartTag();

                                if (__result__tag70!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag70== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag70.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag70);
                                    return;
                                }
                                _activeTag=__tag70.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag70);
                                __tag70.release();
                                _bw.write(_wl_block66Bytes, _wl_block66);
                                 com.fedex.framework.taglib.encode.JavascriptTag __tag71 = null ;
                                int __result__tag71 = 0 ;

                                if (__tag71 == null ){
                                    __tag71 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag71);
                                }
                                __tag71.setPageContext(pageContext);
                                __tag71.setParent(__tag60);
                                __tag71.setValue(isReturnShipmentNavigationAllowed
);
                                _activeTag=__tag71;
                                __result__tag71 = __tag71.doStartTag();

                                if (__result__tag71!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag71== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag71.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag71);
                                    return;
                                }
                                _activeTag=__tag71.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag71);
                                __tag71.release();
                                _bw.write(_wl_block109Bytes, _wl_block109);
                                out.print(_jsp_expressionInterceptor.intercept( String.valueOf( myEcommerceTabShown ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                                _bw.write(_wl_block110Bytes, _wl_block110);

                                if (_jsp__tag72(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag73(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block112Bytes, _wl_block112);

                                if (_jsp__tag74(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag75(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag76(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag77(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag78(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag79(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag80(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

                                if (_jsp__tag81(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block113Bytes, _wl_block113);

                                if (_jsp__tag82(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block111Bytes, _wl_block111);

   // MenuTab Title  
  	MessageResources navigationResources = (MessageResources) application.getAttribute(Globals.MESSAGES_KEY);
  	String prepareShipmentTab = navigationResources.getMessage(locale, "app.tab.prepareShipment");
	String ltlFreightTab = navigationResources.getMessage(locale, "app.tab.ltlFreightTab");
	String shipHistoryTab = navigationResources.getMessage(locale, "app.tab.shipHistory");
	String myListsTab = navigationResources.getMessage(locale, "app.tab.myLists");
	String reportsTab = navigationResources.getMessage(locale, "app.tab.reports");
	String myProfileTab = navigationResources.getMessage(locale, "app.tab.myProfile");
	String myEcommerceTab = navigationResources.getMessage(locale, "app.tab.myEcommerce");
	String adminTab = navigationResources.getMessage(locale, "app.tab.administration");
	
	//Assuming only Freight is using this navigation header.
	int tabWidth = 82;
	int shipTabWidth = tabWidth + 22;
	int histTabWidth = tabWidth + 30;
   
                                _bw.write(_wl_block114Bytes, _wl_block114);

                                if (_jsp__tag83(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block115Bytes, _wl_block115);
                                 org.apache.struts2.views.jsp.IfTag __tag84 = null ;
                                int __result__tag84 = 0 ;

                                if (__tag84 == null ){
                                    __tag84 = new  org.apache.struts2.views.jsp.IfTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag84);
                                }
                                __tag84.setPageContext(pageContext);
                                __tag84.setParent(__tag60);
                                __tag84.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.cobrandLogo}", java.lang.String.class,"test"));
                                _activeTag=__tag84;
                                __result__tag84 = __tag84.doStartTag();

                                if (__result__tag84!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    try {
                                        if (__result__tag84== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.pushBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                            __tag84.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                            __tag84.doInitBody();
                                        }
                                        do {
                                            _bw.write(_wl_block70Bytes, _wl_block70);
                                             com.fedex.framework.taglib.encode.UrlTag __tag85 = null ;
                                            int __result__tag85 = 0 ;

                                            if (__tag85 == null ){
                                                __tag85 = new  com.fedex.framework.taglib.encode.UrlTag ();
                                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag85);
                                            }
                                            __tag85.setPageContext(pageContext);
                                            __tag85.setParent(__tag84);
                                            __tag85.setValue(companyCode
);
                                            _activeTag=__tag85;
                                            __result__tag85 = __tag85.doStartTag();

                                            if (__result__tag85!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                if (__result__tag85== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.UrlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                }
                                            }
                                            if (__tag85.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                _activeTag = null;
                                                _releaseTags(pageContext, __tag85);
                                                return;
                                            }
                                            _activeTag=__tag85.getParent();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag85);
                                            __tag85.release();
                                            _bw.write(_wl_block71Bytes, _wl_block71);
                                        } while (__tag84.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    } finally {
                                        if (__result__tag84== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.popBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                        }
                                    }
                                }
                                if (__tag84.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag84);
                                    return;
                                }
                                _activeTag=__tag84.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag84);
                                __tag84.release();
                                _bw.write(_wl_block116Bytes, _wl_block116);

                                if (_jsp__tag86(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block117Bytes, _wl_block117);

                                if (_jsp__tag87(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block118Bytes, _wl_block118);

                                if (_jsp__tag88(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block121Bytes, _wl_block121);

                                if (_jsp__tag90(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block123Bytes, _wl_block123);

                                if (_jsp__tag92(request, response, pageContext, _activeTag, __tag60))
                                 return;
                                _bw.write(_wl_block124Bytes, _wl_block124);
                                 com.fedex.framework.taglib.MenuTag __tag93 = null ;
                                int __result__tag93 = 0 ;

                                if (__tag93 == null ){
                                    __tag93 = new  com.fedex.framework.taglib.MenuTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag93);
                                }
                                __tag93.setPageContext(pageContext);
                                __tag93.setParent(__tag60);
                                __tag93.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menubar.nav", java.lang.String.class,"id"));
                                _activeTag=__tag93;
                                __result__tag93 = __tag93.doStartTag();

                                if (__result__tag93!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag93== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                    do {
                                        _bw.write(_wl_block97Bytes, _wl_block97);
if(isCreditCardShipment) {
                                        _bw.write(_wl_block85Bytes, _wl_block85);
                                         com.fedex.framework.taglib.MenuTabTag __tag94 = null ;
                                        int __result__tag94 = 0 ;

                                        if (__tag94 == null ){
                                            __tag94 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag94);
                                        }
                                        __tag94.setPageContext(pageContext);
                                        __tag94.setParent(__tag93);
                                        __tag94.setTitle(prepareShipmentTab
);
                                        __tag94.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("isShipmentSelected")).booleanValue());
                                        __tag94.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag94.setTabWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        __tag94.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag94;
                                        __result__tag94 = __tag94.doStartTag();

                                        if (__result__tag94!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag94== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag94.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag94.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag94);
                                            return;
                                        }
                                        _activeTag=__tag94.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag94);
                                        __tag94.release();
                                        _bw.write(_wl_block125Bytes, _wl_block125);
}else{ 
                                        _bw.write(_wl_block85Bytes, _wl_block85);
                                         com.fedex.framework.taglib.MenuTabTag __tag95 = null ;
                                        int __result__tag95 = 0 ;

                                        if (__tag95 == null ){
                                            __tag95 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag95);
                                        }
                                        __tag95.setPageContext(pageContext);
                                        __tag95.setParent(__tag93);
                                        __tag95.setTitle(prepareShipmentTab
);
                                        __tag95.setSelectedMenuTab(isShipmentSelected
);
                                        __tag95.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                                        __tag95.setTabWidth(shipTabWidth
);
                                        __tag95.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag95;
                                        __result__tag95 = __tag95.doStartTag();

                                        if (__result__tag95!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag95== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block80Bytes, _wl_block80);

                                                if (_jsp__tag96(request, response, pageContext, _activeTag, __tag95))
                                                 return;
                                                _bw.write(_wl_block80Bytes, _wl_block80);

                                                if (_jsp__tag98(request, response, pageContext, _activeTag, __tag95))
                                                 return;
                                                _bw.write(_wl_block80Bytes, _wl_block80);

                                                if (_jsp__tag100(request, response, pageContext, _activeTag, __tag95))
                                                 return;
                                                _bw.write(_wl_block80Bytes, _wl_block80);

                                                if (_jsp__tag102(request, response, pageContext, _activeTag, __tag95))
                                                 return;
                                                _bw.write(_wl_block126Bytes, _wl_block126);
                                            } while (__tag95.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag95.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag95);
                                            return;
                                        }
                                        _activeTag=__tag95.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag95);
                                        __tag95.release();
                                        _bw.write(_wl_block127Bytes, _wl_block127);
} 
                                        _bw.write(_wl_block128Bytes, _wl_block128);
if(isLoggedInUser){ 
                                        _bw.write(_wl_block129Bytes, _wl_block129);
                                         org.apache.struts2.views.jsp.IfTag __tag103 = null ;
                                        int __result__tag103 = 0 ;

                                        if (__tag103 == null ){
                                            __tag103 = new  org.apache.struts2.views.jsp.IfTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag103);
                                        }
                                        __tag103.setPageContext(pageContext);
                                        __tag103.setParent(__tag93);
                                        __tag103.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.freightTabAllowed}", java.lang.String.class,"test"));
                                        _activeTag=__tag103;
                                        __result__tag103 = __tag103.doStartTag();

                                        if (__result__tag103!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            try {
                                                if (__result__tag103== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.pushBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                    __tag103.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                                    __tag103.doInitBody();
                                                }
                                                do {
                                                    _bw.write(_wl_block88Bytes, _wl_block88);
                                                     com.fedex.framework.taglib.MenuTabTag __tag104 = null ;
                                                    int __result__tag104 = 0 ;

                                                    if (__tag104 == null ){
                                                        __tag104 = new  com.fedex.framework.taglib.MenuTabTag ();
                                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag104);
                                                    }
                                                    __tag104.setPageContext(pageContext);
                                                    __tag104.setParent(__tag103);
                                                    __tag104.setTitle(ltlFreightTab
);
                                                    __tag104.setSelectedMenuTab(isFreightMenuSelected
);
                                                    __tag104.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                                    __tag104.setTabWidth(tabWidth
);
                                                    __tag104.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                                    _activeTag=__tag104;
                                                    __result__tag104 = __tag104.doStartTag();

                                                    if (__result__tag104!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                        if (__result__tag104== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                        }
                                                        do {
                                                            _bw.write(_wl_block85Bytes, _wl_block85);
                                                        } while (__tag104.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                    }
                                                    if (__tag104.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                        _activeTag = null;
                                                        _releaseTags(pageContext, __tag104);
                                                        return;
                                                    }
                                                    _activeTag=__tag104.getParent();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag104);
                                                    __tag104.release();
                                                    _bw.write(_wl_block127Bytes, _wl_block127);
                                                } while (__tag103.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                            } finally {
                                                if (__result__tag103== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.popBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                }
                                            }
                                        }
                                        if (__tag103.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag103);
                                            return;
                                        }
                                        _activeTag=__tag103.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag103);
                                        __tag103.release();
                                        _bw.write(_wl_block130Bytes, _wl_block130);
                                         com.fedex.framework.taglib.MenuTabTag __tag105 = null ;
                                        int __result__tag105 = 0 ;

                                        if (__tag105 == null ){
                                            __tag105 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag105);
                                        }
                                        __tag105.setPageContext(pageContext);
                                        __tag105.setParent(__tag93);
                                        __tag105.setTitle(shipHistoryTab 
);
                                        __tag105.setSelectedMenuTab(isHistoryMenuSelected
);
                                        __tag105.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag105.setTabWidth(histTabWidth
);
                                        __tag105.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag105;
                                        __result__tag105 = __tag105.doStartTag();

                                        if (__result__tag105!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag105== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block97Bytes, _wl_block97);
                                            } while (__tag105.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag105.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag105);
                                            return;
                                        }
                                        _activeTag=__tag105.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag105);
                                        __tag105.release();
                                        _bw.write(_wl_block130Bytes, _wl_block130);
                                         com.fedex.framework.taglib.MenuTabTag __tag106 = null ;
                                        int __result__tag106 = 0 ;

                                        if (__tag106 == null ){
                                            __tag106 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag106);
                                        }
                                        __tag106.setPageContext(pageContext);
                                        __tag106.setParent(__tag93);
                                        __tag106.setTitle(myListsTab 
);
                                        __tag106.setSelectedMenuTab(isListsMenuSelected
);
                                        __tag106.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                                        __tag106.setTabWidth(tabWidth
);
                                        __tag106.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag106;
                                        __result__tag106 = __tag106.doStartTag();

                                        if (__result__tag106!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag106== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);

                                                if (_jsp__tag107(request, response, pageContext, _activeTag, __tag106))
                                                 return;
                                                _bw.write(_wl_block131Bytes, _wl_block131);

                                                if (_jsp__tag108(request, response, pageContext, _activeTag, __tag106))
                                                 return;
                                                _bw.write(_wl_block133Bytes, _wl_block133);

                                                if (_jsp__tag110(request, response, pageContext, _activeTag, __tag106))
                                                 return;
                                                _bw.write(_wl_block134Bytes, _wl_block134);

                                                if (_jsp__tag111(request, response, pageContext, _activeTag, __tag106))
                                                 return;
                                                _bw.write(_wl_block136Bytes, _wl_block136);
                                            } while (__tag106.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag106.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag106);
                                            return;
                                        }
                                        _activeTag=__tag106.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag106);
                                        __tag106.release();
                                        _bw.write(_wl_block137Bytes, _wl_block137);
                                         org.apache.struts2.views.jsp.IfTag __tag113 = null ;
                                        int __result__tag113 = 0 ;

                                        if (__tag113 == null ){
                                            __tag113 = new  org.apache.struts2.views.jsp.IfTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag113);
                                        }
                                        __tag113.setPageContext(pageContext);
                                        __tag113.setParent(__tag93);
                                        __tag113.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{!freightNavigationView.creditCardShipment}", java.lang.String.class,"test"));
                                        _activeTag=__tag113;
                                        __result__tag113 = __tag113.doStartTag();

                                        if (__result__tag113!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            try {
                                                if (__result__tag113== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.pushBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                    __tag113.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                                    __tag113.doInitBody();
                                                }
                                                do {
                                                    _bw.write(_wl_block80Bytes, _wl_block80);
                                                     com.fedex.framework.taglib.MenuTabTag __tag114 = null ;
                                                    int __result__tag114 = 0 ;

                                                    if (__tag114 == null ){
                                                        __tag114 = new  com.fedex.framework.taglib.MenuTabTag ();
                                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag114);
                                                    }
                                                    __tag114.setPageContext(pageContext);
                                                    __tag114.setParent(__tag113);
                                                    __tag114.setTitle(reportsTab 
);
                                                    __tag114.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                                    __tag114.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                                    __tag114.setTabWidth(tabWidth
);
                                                    __tag114.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                                    _activeTag=__tag114;
                                                    __result__tag114 = __tag114.doStartTag();

                                                    if (__result__tag114!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                        if (__result__tag114== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                                        }
                                                        do {
                                                            _bw.write(_wl_block80Bytes, _wl_block80);
                                                        } while (__tag114.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                                    }
                                                    if (__tag114.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                                        _activeTag = null;
                                                        _releaseTags(pageContext, __tag114);
                                                        return;
                                                    }
                                                    _activeTag=__tag114.getParent();
                                                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag114);
                                                    __tag114.release();
                                                    _bw.write(_wl_block138Bytes, _wl_block138);
                                                } while (__tag113.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                            } finally {
                                                if (__result__tag113== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.popBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                }
                                            }
                                        }
                                        if (__tag113.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag113);
                                            return;
                                        }
                                        _activeTag=__tag113.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag113);
                                        __tag113.release();
                                        _bw.write(_wl_block139Bytes, _wl_block139);
 if (myEcommerceTabShown) { 
                                        _bw.write(_wl_block88Bytes, _wl_block88);
                                         com.fedex.framework.taglib.MenuTabTag __tag115 = null ;
                                        int __result__tag115 = 0 ;

                                        if (__tag115 == null ){
                                            __tag115 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag115);
                                        }
                                        __tag115.setPageContext(pageContext);
                                        __tag115.setParent(__tag93);
                                        __tag115.setTitle(myEcommerceTab
);
                                        __tag115.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag115.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag115.setTabWidth(shipTabWidth
);
                                        __tag115.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag115;
                                        __result__tag115 = __tag115.doStartTag();

                                        if (__result__tag115!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag115== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block85Bytes, _wl_block85);
                                            } while (__tag115.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag115.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag115);
                                            return;
                                        }
                                        _activeTag=__tag115.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag115);
                                        __tag115.release();
                                        _bw.write(_wl_block85Bytes, _wl_block85);
 } 
                                        _bw.write(_wl_block140Bytes, _wl_block140);
if (userProfileAdapter.isPasskeyAdmin() || isGlobalCustomerAdministrationEnabled) { 
                                        _bw.write(_wl_block80Bytes, _wl_block80);
                                         com.fedex.framework.taglib.MenuTabTag __tag116 = null ;
                                        int __result__tag116 = 0 ;

                                        if (__tag116 == null ){
                                            __tag116 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag116);
                                        }
                                        __tag116.setPageContext(pageContext);
                                        __tag116.setParent(__tag93);
                                        __tag116.setTitle(adminTab
);
                                        __tag116.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag116.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag116.setTabWidth(tabWidth
);
                                        __tag116.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag116;
                                        __result__tag116 = __tag116.doStartTag();

                                        if (__result__tag116!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag116== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block80Bytes, _wl_block80);
                                            } while (__tag116.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag116.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag116);
                                            return;
                                        }
                                        _activeTag=__tag116.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag116);
                                        __tag116.release();
                                        _bw.write(_wl_block141Bytes, _wl_block141);
 	}
		 } 
                                        _bw.write(_wl_block142Bytes, _wl_block142);
                                    } while (__tag93.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                }
                                if (__tag93.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag93);
                                    return;
                                }
                                _activeTag=__tag93.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag93);
                                __tag93.release();
                                _bw.write(_wl_block98Bytes, _wl_block98);
                                _bw.write(_wl_block99Bytes, _wl_block99);
                            } while (__tag60.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                        } finally {
                            if (__result__tag60== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.popBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                            }
                        }
                    }
                    if (__tag60.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag60);
                        return;
                    }
                    _activeTag=__tag60.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag60);
                    __tag60.release();
                    _bw.write(_wl_block143Bytes, _wl_block143);

                    if (_jsp__tag117(request, response, pageContext, _activeTag, __tag0))
                     return;

                    if (_jsp__tag118(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block148Bytes, _wl_block148);

                    if (_jsp__tag119(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block152Bytes, _wl_block152);

                    if (_jsp__tag122(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block163Bytes, _wl_block163);
                     org.apache.struts2.views.jsp.ElseTag __tag132 = null ;
                    int __result__tag132 = 0 ;

                    if (__tag132 == null ){
                        __tag132 = new  org.apache.struts2.views.jsp.ElseTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag132);
                    }
                    __tag132.setPageContext(pageContext);
                    __tag132.setParent(__tag0);
                    _activeTag=__tag132;
                    __result__tag132 = __tag132.doStartTag();

                    if (__result__tag132!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        try {
                            if (__result__tag132== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.pushBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                __tag132.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                __tag132.doInitBody();
                            }
                            do {
                                _bw.write(_wl_block164Bytes, _wl_block164);
                                 org.apache.struts2.views.jsp.IfTag __tag133 = null ;
                                int __result__tag133 = 0 ;

                                if (__tag133 == null ){
                                    __tag133 = new  org.apache.struts2.views.jsp.IfTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag133);
                                }
                                __tag133.setPageContext(pageContext);
                                __tag133.setParent(__tag132);
                                __tag133.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'regUserNoAccount\'}", java.lang.String.class,"test"));
                                _activeTag=__tag133;
                                __result__tag133 = __tag133.doStartTag();

                                if (__result__tag133!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    try {
                                        if (__result__tag133== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.pushBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                            __tag133.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                            __tag133.doInitBody();
                                        }
                                        do {
                                            _bw.write(_wl_block165Bytes, _wl_block165);
                                            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                                            _bw.write(_wl_block166Bytes, _wl_block166);
                                            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                                            _bw.write(_wl_block167Bytes, _wl_block167);

                                            if (_jsp__tag134(request, response, pageContext, _activeTag, __tag133))
                                             return;
                                            _bw.write(_wl_block168Bytes, _wl_block168);
if(isLeanTriggerEnabled)
					 			{ 
                                            _bw.write(_wl_block169Bytes, _wl_block169);
                                            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${alertNoFreightAccount}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                                            _bw.write(_wl_block170Bytes, _wl_block170);

                                            if (_jsp__tag135(request, response, pageContext, _activeTag, __tag133))
                                             return;
                                            _bw.write(_wl_block171Bytes, _wl_block171);
 } else { 
                                            _bw.write(_wl_block169Bytes, _wl_block169);

                                            if (_jsp__tag136(request, response, pageContext, _activeTag, __tag133))
                                             return;
                                            _bw.write(_wl_block172Bytes, _wl_block172);

                                            if (_jsp__tag137(request, response, pageContext, _activeTag, __tag133))
                                             return;
                                            _bw.write(_wl_block173Bytes, _wl_block173);
 } 
                                            _bw.write(_wl_block174Bytes, _wl_block174);
                                        } while (__tag133.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    } finally {
                                        if (__result__tag133== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.popBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                        }
                                    }
                                }
                                if (__tag133.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag133);
                                    return;
                                }
                                _activeTag=__tag133.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag133);
                                __tag133.release();
                                _bw.write(_wl_block161Bytes, _wl_block161);

                                if (_jsp__tag138(request, response, pageContext, _activeTag, __tag132))
                                 return;
                                _bw.write(_wl_block161Bytes, _wl_block161);
                                 org.apache.struts2.views.jsp.ElseIfTag __tag141 = null ;
                                int __result__tag141 = 0 ;

                                if (__tag141 == null ){
                                    __tag141 = new  org.apache.struts2.views.jsp.ElseIfTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag141);
                                }
                                __tag141.setPageContext(pageContext);
                                __tag141.setParent(__tag132);
                                __tag141.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'adminNoAccount\'}", java.lang.String.class,"test"));
                                _activeTag=__tag141;
                                __result__tag141 = __tag141.doStartTag();

                                if (__result__tag141!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    try {
                                        if (__result__tag141== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.pushBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                            __tag141.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                            __tag141.doInitBody();
                                        }
                                        do {
                                            _bw.write(_wl_block175Bytes, _wl_block175);

                                            if (_jsp__tag142(request, response, pageContext, _activeTag, __tag141))
                                             return;
                                            _bw.write(_wl_block176Bytes, _wl_block176);
if(isLeanTriggerEnabled && usrProfileAdapter.getUserProfileVO().getPackageUserConfigurationVO().getPrivilegesVO().isAddAccountLinkAllowed())					 			
							{ 
                                            _bw.write(_wl_block169Bytes, _wl_block169);
                                            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${alertNoFreightAccount}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                                            _bw.write(_wl_block170Bytes, _wl_block170);

                                            if (_jsp__tag143(request, response, pageContext, _activeTag, __tag141))
                                             return;
                                            _bw.write(_wl_block171Bytes, _wl_block171);
 } else { 
                                            _bw.write(_wl_block177Bytes, _wl_block177);

                                            if (_jsp__tag144(request, response, pageContext, _activeTag, __tag141))
                                             return;
                                            _bw.write(_wl_block173Bytes, _wl_block173);
 } 
                                            _bw.write(_wl_block178Bytes, _wl_block178);
                                        } while (__tag141.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                    } finally {
                                        if (__result__tag141== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                            out = pageContext.popBody();
                                            _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                        }
                                    }
                                }
                                if (__tag141.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag141);
                                    return;
                                }
                                _activeTag=__tag141.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag141);
                                __tag141.release();
                                _bw.write(_wl_block179Bytes, _wl_block179);

                                if (_jsp__tag145(request, response, pageContext, _activeTag, __tag132))
                                 return;
                                _bw.write(_wl_block161Bytes, _wl_block161);

                                if (_jsp__tag148(request, response, pageContext, _activeTag, __tag132))
                                 return;
                                _bw.write(_wl_block182Bytes, _wl_block182);
                            } while (__tag132.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                        } finally {
                            if (__result__tag132== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.popBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                            }
                        }
                    }
                    if (__tag132.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag132);
                        return;
                    }
                    _activeTag=__tag132.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag132);
                    __tag132.release();
                    _bw.write(_wl_block183Bytes, _wl_block183);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block2Bytes, _wl_block2);

	
	String minifiedJSFileSuffix = (String)request.getAttribute("jsSuffix") ;
	String minifiedFwkFileSuffix = (String)request.getAttribute("frameworkSuffix");
	if(minifiedJSFileSuffix==null){
		minifiedJSFileSuffix="";
	}
	if(minifiedFwkFileSuffix==null){
		minifiedFwkFileSuffix="";
	}
	LoggerFactory.getLogger().debug(
	        "minifiedJSFileSuffix= " + minifiedJSFileSuffix + " minifiedFWKFileSuffix= "
	                + minifiedFwkFileSuffix);

                    _bw.write(_wl_block184Bytes, _wl_block184);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    _bw.write(_wl_block185Bytes, _wl_block185);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block186Bytes, _wl_block186);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block187Bytes, _wl_block187);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block188Bytes, _wl_block188);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block190Bytes, _wl_block190);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block191Bytes, _wl_block191);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block192Bytes, _wl_block192);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block193Bytes, _wl_block193);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block194Bytes, _wl_block194);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block195Bytes, _wl_block195);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block196Bytes, _wl_block196);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block189Bytes, _wl_block189);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block197Bytes, _wl_block197);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block186Bytes, _wl_block186);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block50Bytes, _wl_block50);

	WebAnalyticsSelector ws = new WebAnalyticsSelector();
	String webAnalyticsJSFile = ws.getWebAnalyticsTool().getJsFile();

                    _bw.write(_wl_block2Bytes, _wl_block2);
                     com.fedex.fsm.ship.web.taglib.component.ScriptTag __tag151 = null ;
                    int __result__tag151 = 0 ;

                    if (__tag151 == null ){
                        __tag151 = new  com.fedex.fsm.ship.web.taglib.component.ScriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag151);
                    }
                    __tag151.setPageContext(pageContext);
                    __tag151.setParent(__tag0);
                    __tag151.setDir(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("js", java.lang.String.class,"dir"));
                    __tag151.setFile(webAnalyticsJSFile
);
                    __tag151.setMinified(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("false", java.lang.String.class,"minified"));
                    __tag151.setVersioned(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("true", java.lang.String.class,"versioned"));
                    _activeTag=__tag151;
                    __result__tag151 = __tag151.doStartTag();

                    if (__result__tag151!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag151== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.fsm.ship.web.taglib.component.ScriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag151.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag151);
                        return;
                    }
                    _activeTag=__tag151.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag151);
                    __tag151.release();
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block2Bytes, _wl_block2);

SenderDisplayRules senderDisplayRulesFooter = new SenderDisplayRules();
java.util.Locale localeFooter = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
String localeCountryFooter = localeFooter.getCountry();

                    _bw.write(_wl_block198Bytes, _wl_block198);
                    _bw.write(_wl_block199Bytes, _wl_block199);
                } while (__tag0.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            }
            if (__tag0.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag0);
                return;
            }
            _activeTag=__tag0.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag0);
            __tag0.release();
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
        __tag2.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("14", java.lang.String.class,"value"));
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
        __tag3.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("23", java.lang.String.class,"value"));
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
         org.apache.struts2.views.jsp.SetTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag4, parent);
        __tag4.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlPhoneNumberSize", java.lang.String.class,"name"));
        __tag4.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("16", java.lang.String.class,"value"));
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
         org.apache.struts2.views.jsp.SetTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag5, parent);
        __tag5.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlNotificationElementSize", java.lang.String.class,"name"));
        __tag5.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("21", java.lang.String.class,"value"));
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
        __tag6.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.select\')", java.lang.String.class,"name"));
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
        __tag7.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.address.results\')", java.lang.String.class,"name"));
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
        __tag8.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Commercial\')", java.lang.String.class,"name"));
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

    private boolean _jsp__tag9(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag9 = null ;
        int __result__tag9 = 0 ;

        if (__tag9 == null ){
            __tag9 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag9);
        }
        __tag9.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag9, parent);
        __tag9.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Residential\')", java.lang.String.class,"name"));
        _activeTag=__tag9;
        __result__tag9 = __tag9.doStartTag();

        if (__result__tag9!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag9== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts2.views.jsp.TextTag __tag10 = null ;
        int __result__tag10 = 0 ;

        if (__tag10 == null ){
            __tag10 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
        }
        __tag10.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag10, parent);
        __tag10.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.UseAddressAsEntered\')", java.lang.String.class,"name"));
        _activeTag=__tag10;
        __result__tag10 = __tag10.doStartTag();

        if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jsp__tag11(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag11 = null ;
        int __result__tag11 = 0 ;

        if (__tag11 == null ){
            __tag11 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
        }
        __tag11.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag11, parent);
        __tag11.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("textCreateBOL", java.lang.String.class,"name"));
        __tag11.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.noaccount.freight2020\')", java.lang.String.class,"value"));
        _activeTag=__tag11;
        __result__tag11 = __tag11.doStartTag();

        if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag11);
            return true;
        }
        _activeTag=__tag11.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
        __tag11.release();
        return false;
    }

    private boolean _jsp__tag12(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag12 = null ;
        int __result__tag12 = 0 ;

        if (__tag12 == null ){
            __tag12 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
        }
        __tag12.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag12, parent);
        __tag12.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("alertNoFreightAccount", java.lang.String.class,"name"));
        __tag12.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alert.noaccount.freight2020\')", java.lang.String.class,"value"));
        _activeTag=__tag12;
        __result__tag12 = __tag12.doStartTag();

        if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag12);
            return true;
        }
        _activeTag=__tag12.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
        __tag12.release();
        return false;
    }

    private boolean _jsp__tag13(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag13 = null ;
        int __result__tag13 = 0 ;

        if (__tag13 == null ){
            __tag13 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
        }
        __tag13.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag13, parent);
        __tag13.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("textCreateBOL", java.lang.String.class,"name"));
        __tag13.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.create.bol\')", java.lang.String.class,"value"));
        _activeTag=__tag13;
        __result__tag13 = __tag13.doStartTag();

        if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag13.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag13);
            return true;
        }
        _activeTag=__tag13.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag13);
        __tag13.release();
        return false;
    }

    private boolean _jsp__tag14(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag14 = null ;
        int __result__tag14 = 0 ;

        if (__tag14 == null ){
            __tag14 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
        }
        __tag14.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag14, parent);
        __tag14.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("alertNoFreightAccount", java.lang.String.class,"name"));
        __tag14.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.regular.noaccount2\')", java.lang.String.class,"value"));
        _activeTag=__tag14;
        __result__tag14 = __tag14.doStartTag();

        if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag14.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag14);
            return true;
        }
        _activeTag=__tag14.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag14);
        __tag14.release();
        return false;
    }

    private boolean _jsp__tag15(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag15 = null ;
        int __result__tag15 = 0 ;

        if (__tag15 == null ){
            __tag15 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
        }
        __tag15.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag15, parent);
        __tag15.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpText", java.lang.String.class,"name"));
        __tag15.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.help\')", java.lang.String.class,"value"));
        _activeTag=__tag15;
        __result__tag15 = __tag15.doStartTag();

        if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jsp__tag16(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag16 = null ;
        int __result__tag16 = 0 ;

        if (__tag16 == null ){
            __tag16 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
        }
        __tag16.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag16, parent);
        __tag16.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpPage", java.lang.String.class,"name"));
        __tag16.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'page.help.freight\')", java.lang.String.class,"value"));
        _activeTag=__tag16;
        __result__tag16 = __tag16.doStartTag();

        if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag16.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag16);
            return true;
        }
        _activeTag=__tag16.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag16);
        __tag16.release();
        return false;
    }

    private boolean _jsp__tag17(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag17 = null ;
        int __result__tag17 = 0 ;

        if (__tag17 == null ){
            __tag17 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag17);
        }
        __tag17.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag17, parent);
        __tag17.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("editText", java.lang.String.class,"name"));
        __tag17.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.edit\')", java.lang.String.class,"value"));
        _activeTag=__tag17;
        __result__tag17 = __tag17.doStartTag();

        if (__result__tag17!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag17== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag17.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag17);
            return true;
        }
        _activeTag=__tag17.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag17);
        __tag17.release();
        return false;
    }

    private boolean _jsp__tag18(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag18 = null ;
        int __result__tag18 = 0 ;

        if (__tag18 == null ){
            __tag18 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
        }
        __tag18.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag18, parent);
        __tag18.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("hideText", java.lang.String.class,"name"));
        __tag18.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.hide\')", java.lang.String.class,"value"));
        _activeTag=__tag18;
        __result__tag18 = __tag18.doStartTag();

        if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag18.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag18);
            return true;
        }
        _activeTag=__tag18.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag18);
        __tag18.release();
        return false;
    }

    private boolean _jsp__tag19(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag19 = null ;
        int __result__tag19 = 0 ;

        if (__tag19 == null ){
            __tag19 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
        }
        __tag19.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag19, parent);
        __tag19.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("closeText", java.lang.String.class,"name"));
        __tag19.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.close\')", java.lang.String.class,"value"));
        _activeTag=__tag19;
        __result__tag19 = __tag19.doStartTag();

        if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag19.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag19);
            return true;
        }
        _activeTag=__tag19.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag19);
        __tag19.release();
        return false;
    }

    private boolean _jsp__tag20(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag20 = null ;
        int __result__tag20 = 0 ;

        if (__tag20 == null ){
            __tag20 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
        }
        __tag20.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag20, parent);
        __tag20.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("enterOrSelectText", java.lang.String.class,"name"));
        __tag20.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.enterOrSelect\')", java.lang.String.class,"value"));
        _activeTag=__tag20;
        __result__tag20 = __tag20.doStartTag();

        if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag20.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag20);
            return true;
        }
        _activeTag=__tag20.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag20);
        __tag20.release();
        return false;
    }

    private boolean _jsp__tag21(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag21 = null ;
        int __result__tag21 = 0 ;

        if (__tag21 == null ){
            __tag21 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
        }
        __tag21.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag21, parent);
        __tag21.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("selectText", java.lang.String.class,"name"));
        __tag21.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.select\')", java.lang.String.class,"value"));
        _activeTag=__tag21;
        __result__tag21 = __tag21.doStartTag();

        if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag21);
            return true;
        }
        _activeTag=__tag21.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
        __tag21.release();
        return false;
    }

    private boolean _jsp__tag26(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.FloatingWindowTag __tag26 = null ;
        int __result__tag26 = 0 ;

        if (__tag26 == null ){
            __tag26 = new  com.fedex.framework.taglib.FloatingWindowTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
        }
        __tag26.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag26, parent);
        __tag26.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("floatingWindow.help", java.lang.String.class,"id"));
        __tag26.setTitle(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Help", java.lang.String.class,"title"));
        __tag26.setCloseText(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Close", java.lang.String.class,"closeText"));
        _activeTag=__tag26;
        __result__tag26 = __tag26.doStartTag();

        if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.FloatingWindowTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block0Bytes, _wl_block0);
            } while (__tag26.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag26.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag26);
            return true;
        }
        _activeTag=__tag26.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag26);
        __tag26.release();
        return false;
    }

    private boolean _jsp__tag33(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.FormTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  org.apache.struts.taglib.html.FormTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        __tag33.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("navigationHeaderAction", java.lang.String.class,"action"));
        _activeTag=__tag33;
        __result__tag33 = __tag33.doStartTag();

        if (__result__tag33!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag33== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block68Bytes, _wl_block68);
            } while (__tag33.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag33.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag33);
            return true;
        }
        _activeTag=__tag33.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag33);
        __tag33.release();
        return false;
    }

    private boolean _jsp__tag35(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag35 = null ;
        int __result__tag35 = 0 ;

        if (__tag35 == null ){
            __tag35 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag35);
        }
        __tag35.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag35, parent);
        __tag35.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag35;
        __result__tag35 = __tag35.doStartTag();

        if (__result__tag35!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag35== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag35.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag35);
            return true;
        }
        _activeTag=__tag35.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag35);
        __tag35.release();
        return false;
    }

    private boolean _jsp__tag36(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag36 = null ;
        int __result__tag36 = 0 ;

        if (__tag36 == null ){
            __tag36 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag36);
        }
        __tag36.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag36, parent);
        __tag36.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("app.name", java.lang.String.class,"key"));
        _activeTag=__tag36;
        __result__tag36 = __tag36.doStartTag();

        if (__result__tag36!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag36== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag36.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag36);
            return true;
        }
        _activeTag=__tag36.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag36);
        __tag36.release();
        return false;
    }

    private boolean _jsp__tag37(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag37 = null ;
        int __result__tag37 = 0 ;

        if (__tag37 == null ){
            __tag37 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag37);
        }
        __tag37.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag37, parent);
        __tag37.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.myProfile", java.lang.String.class,"key"));
        _activeTag=__tag37;
        __result__tag37 = __tag37.doStartTag();

        if (__result__tag37!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag37== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag37.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag37);
            return true;
        }
        _activeTag=__tag37.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag37);
        __tag37.release();
        return false;
    }

    private boolean _jsp__tag38(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag38 = null ;
        int __result__tag38 = 0 ;

        if (__tag38 == null ){
            __tag38 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag38);
        }
        __tag38.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag38, parent);
        __tag38.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.logout", java.lang.String.class,"key"));
        _activeTag=__tag38;
        __result__tag38 = __tag38.doStartTag();

        if (__result__tag38!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag38== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag38.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag38);
            return true;
        }
        _activeTag=__tag38.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag38);
        __tag38.release();
        return false;
    }

    private boolean _jsp__tag43(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag43 = null ;
        int __result__tag43 = 0 ;

        if (__tag43 == null ){
            __tag43 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag43);
        }
        __tag43.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag43, parent);
        __tag43.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.onreloadofpagelabel", java.lang.String.class,"key"));
        _activeTag=__tag43;
        __result__tag43 = __tag43.doStartTag();

        if (__result__tag43!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag43== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag43.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag43);
            return true;
        }
        _activeTag=__tag43.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag43);
        __tag43.release();
        return false;
    }

    private boolean _jsp__tag62(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag62 = null ;
        int __result__tag62 = 0 ;

        if (__tag62 == null ){
            __tag62 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag62);
        }
        __tag62.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag62, parent);
        __tag62.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.creditCardShipment", java.lang.String.class,"value"));
        _activeTag=__tag62;
        __result__tag62 = __tag62.doStartTag();

        if (__result__tag62!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag62== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag62.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag62);
            return true;
        }
        _activeTag=__tag62.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag62);
        __tag62.release();
        return false;
    }

    private boolean _jsp__tag63(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag63 = null ;
        int __result__tag63 = 0 ;

        if (__tag63 == null ){
            __tag63 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag63);
        }
        __tag63.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag63, parent);
        __tag63.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.freightTabAllowed", java.lang.String.class,"value"));
        _activeTag=__tag63;
        __result__tag63 = __tag63.doStartTag();

        if (__result__tag63!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag63== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag63.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag63);
            return true;
        }
        _activeTag=__tag63.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag63);
        __tag63.release();
        return false;
    }

    private boolean _jsp__tag65(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag65 = null ;
        int __result__tag65 = 0 ;

        if (__tag65 == null ){
            __tag65 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag65);
        }
        __tag65.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag65, parent);
        __tag65.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.pendingShipmentsReminderEnabled", java.lang.String.class,"value"));
        _activeTag=__tag65;
        __result__tag65 = __tag65.doStartTag();

        if (__result__tag65!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag65== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag65.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag65);
            return true;
        }
        _activeTag=__tag65.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag65);
        __tag65.release();
        return false;
    }

    private boolean _jsp__tag66(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag66 = null ;
        int __result__tag66 = 0 ;

        if (__tag66 == null ){
            __tag66 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag66);
        }
        __tag66.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag66, parent);
        __tag66.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.navigateAwayFromShipmentNotifyFlag", java.lang.String.class,"value"));
        _activeTag=__tag66;
        __result__tag66 = __tag66.doStartTag();

        if (__result__tag66!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag66== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag66.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag66);
            return true;
        }
        _activeTag=__tag66.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag66);
        __tag66.release();
        return false;
    }

    private boolean _jsp__tag68(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag68 = null ;
        int __result__tag68 = 0 ;

        if (__tag68 == null ){
            __tag68 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag68);
        }
        __tag68.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag68, parent);
        __tag68.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.groundManifestReminder", java.lang.String.class,"value"));
        _activeTag=__tag68;
        __result__tag68 = __tag68.doStartTag();

        if (__result__tag68!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag68== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag68.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag68);
            return true;
        }
        _activeTag=__tag68.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag68);
        __tag68.release();
        return false;
    }

    private boolean _jsp__tag72(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag72 = null ;
        int __result__tag72 = 0 ;

        if (__tag72 == null ){
            __tag72 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag72);
        }
        __tag72.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag72, parent);
        __tag72.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpTitle", java.lang.String.class,"name"));
        __tag72.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.help\')", java.lang.String.class,"value"));
        _activeTag=__tag72;
        __result__tag72 = __tag72.doStartTag();

        if (__result__tag72!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag72== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag72.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag72);
            return true;
        }
        _activeTag=__tag72.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag72);
        __tag72.release();
        return false;
    }

    private boolean _jsp__tag73(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag73 = null ;
        int __result__tag73 = 0 ;

        if (__tag73 == null ){
            __tag73 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag73);
        }
        __tag73.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag73, parent);
        __tag73.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpItem1", java.lang.String.class,"name"));
        __tag73.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.quickhelp.help.with.this.page\')", java.lang.String.class,"value"));
        _activeTag=__tag73;
        __result__tag73 = __tag73.doStartTag();

        if (__result__tag73!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag73== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag73.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag73);
            return true;
        }
        _activeTag=__tag73.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag73);
        __tag73.release();
        return false;
    }

    private boolean _jsp__tag74(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag74 = null ;
        int __result__tag74 = 0 ;

        if (__tag74 == null ){
            __tag74 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag74);
        }
        __tag74.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag74, parent);
        __tag74.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createShipmentMenu", java.lang.String.class,"name"));
        __tag74.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag74;
        __result__tag74 = __tag74.doStartTag();

        if (__result__tag74!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag74== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag74.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag74);
            return true;
        }
        _activeTag=__tag74.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag74);
        __tag74.release();
        return false;
    }

    private boolean _jsp__tag75(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag75 = null ;
        int __result__tag75 = 0 ;

        if (__tag75 == null ){
            __tag75 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag75);
        }
        __tag75.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag75, parent);
        __tag75.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createReturnShipmentMenu", java.lang.String.class,"name"));
        __tag75.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createReturnShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag75;
        __result__tag75 = __tag75.doStartTag();

        if (__result__tag75!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag75== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag75.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag75);
            return true;
        }
        _activeTag=__tag75.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag75);
        __tag75.release();
        return false;
    }

    private boolean _jsp__tag76(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag76 = null ;
        int __result__tag76 = 0 ;

        if (__tag76 == null ){
            __tag76 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag76);
        }
        __tag76.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag76, parent);
        __tag76.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createImportShipmentMenu", java.lang.String.class,"name"));
        __tag76.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createImportShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag76;
        __result__tag76 = __tag76.doStartTag();

        if (__result__tag76!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag76== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag76.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag76);
            return true;
        }
        _activeTag=__tag76.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag76);
        __tag76.release();
        return false;
    }

    private boolean _jsp__tag77(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag77 = null ;
        int __result__tag77 = 0 ;

        if (__tag77 == null ){
            __tag77 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag77);
        }
        __tag77.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag77, parent);
        __tag77.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("viewPendingShipmentMenu", java.lang.String.class,"name"));
        __tag77.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.viewPendingShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag77;
        __result__tag77 = __tag77.doStartTag();

        if (__result__tag77!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag77== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag77.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag77);
            return true;
        }
        _activeTag=__tag77.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag77);
        __tag77.release();
        return false;
    }

    private boolean _jsp__tag78(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag78 = null ;
        int __result__tag78 = 0 ;

        if (__tag78 == null ){
            __tag78 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag78);
        }
        __tag78.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag78, parent);
        __tag78.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressBookMenu", java.lang.String.class,"name"));
        __tag78.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.addressBook\')", java.lang.String.class,"value"));
        _activeTag=__tag78;
        __result__tag78 = __tag78.doStartTag();

        if (__result__tag78!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag78== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag78.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag78);
            return true;
        }
        _activeTag=__tag78.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag78);
        __tag78.release();
        return false;
    }

    private boolean _jsp__tag79(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag79 = null ;
        int __result__tag79 = 0 ;

        if (__tag79 == null ){
            __tag79 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag79);
        }
        __tag79.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag79, parent);
        __tag79.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipmentProfilesMenu", java.lang.String.class,"name"));
        __tag79.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.shipmentProfiles\')", java.lang.String.class,"value"));
        _activeTag=__tag79;
        __result__tag79 = __tag79.doStartTag();

        if (__result__tag79!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag79== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag79.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag79);
            return true;
        }
        _activeTag=__tag79.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag79);
        __tag79.release();
        return false;
    }

    private boolean _jsp__tag80(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag80 = null ;
        int __result__tag80 = 0 ;

        if (__tag80 == null ){
            __tag80 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag80);
        }
        __tag80.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag80, parent);
        __tag80.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("dimensionsMenu", java.lang.String.class,"name"));
        __tag80.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.dims\')", java.lang.String.class,"value"));
        _activeTag=__tag80;
        __result__tag80 = __tag80.doStartTag();

        if (__result__tag80!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag80== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag80.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag80);
            return true;
        }
        _activeTag=__tag80.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag80);
        __tag80.release();
        return false;
    }

    private boolean _jsp__tag81(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag81 = null ;
        int __result__tag81 = 0 ;

        if (__tag81 == null ){
            __tag81 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag81);
        }
        __tag81.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag81, parent);
        __tag81.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpTechSupportUrl", java.lang.String.class,"name"));
        __tag81.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'online.tech.support\')", java.lang.String.class,"value"));
        _activeTag=__tag81;
        __result__tag81 = __tag81.doStartTag();

        if (__result__tag81!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag81== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag81.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag81);
            return true;
        }
        _activeTag=__tag81.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag81);
        __tag81.release();
        return false;
    }

    private boolean _jsp__tag82(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag82 = null ;
        int __result__tag82 = 0 ;

        if (__tag82 == null ){
            __tag82 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag82);
        }
        __tag82.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag82, parent);
        __tag82.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("bolLineItemProfilesMenu", java.lang.String.class,"name"));
        __tag82.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.menu.bolLineItemProfiles\')", java.lang.String.class,"value"));
        _activeTag=__tag82;
        __result__tag82 = __tag82.doStartTag();

        if (__result__tag82!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag82== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag82.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag82);
            return true;
        }
        _activeTag=__tag82.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag82);
        __tag82.release();
        return false;
    }

    private boolean _jsp__tag83(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.FormTag __tag83 = null ;
        int __result__tag83 = 0 ;

        if (__tag83 == null ){
            __tag83 = new  org.apache.struts.taglib.html.FormTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag83);
        }
        __tag83.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag83, parent);
        __tag83.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("navigationHeaderAction", java.lang.String.class,"action"));
        _activeTag=__tag83;
        __result__tag83 = __tag83.doStartTag();

        if (__result__tag83!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag83== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block0Bytes, _wl_block0);
            } while (__tag83.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag83.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag83);
            return true;
        }
        _activeTag=__tag83.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag83);
        __tag83.release();
        return false;
    }

    private boolean _jsp__tag86(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag86 = null ;
        int __result__tag86 = 0 ;

        if (__tag86 == null ){
            __tag86 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag86);
        }
        __tag86.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag86, parent);
        __tag86.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'app.name\')", java.lang.String.class,"name"));
        _activeTag=__tag86;
        __result__tag86 = __tag86.doStartTag();

        if (__result__tag86!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag86== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag86.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag86);
            return true;
        }
        _activeTag=__tag86.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag86);
        __tag86.release();
        return false;
    }

    private boolean _jsp__tag87(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag87 = null ;
        int __result__tag87 = 0 ;

        if (__tag87 == null ){
            __tag87 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag87);
        }
        __tag87.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag87, parent);
        __tag87.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.myProfile", java.lang.String.class,"key"));
        _activeTag=__tag87;
        __result__tag87 = __tag87.doStartTag();

        if (__result__tag87!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag87== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag87.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag87);
            return true;
        }
        _activeTag=__tag87.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag87);
        __tag87.release();
        return false;
    }

    private boolean _jsp__tag88(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag88 = null ;
        int __result__tag88 = 0 ;

        if (__tag88 == null ){
            __tag88 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag88);
        }
        __tag88.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag88, parent);
        __tag88.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.fclUser}", java.lang.String.class,"test"));
        _activeTag=__tag88;
        __result__tag88 = __tag88.doStartTag();

        if (__result__tag88!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag88== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag88.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag88.doInitBody();
                }
                do {
                    _bw.write(_wl_block119Bytes, _wl_block119);

                    if (_jsp__tag89(request, response, pageContext, _activeTag, __tag88))
                     return true;
                    _bw.write(_wl_block120Bytes, _wl_block120);
                } while (__tag88.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag88== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag88.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag88);
            return true;
        }
        _activeTag=__tag88.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag88);
        __tag88.release();
        return false;
    }

    private boolean _jsp__tag89(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag89 = null ;
        int __result__tag89 = 0 ;

        if (__tag89 == null ){
            __tag89 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag89);
        }
        __tag89.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag89, parent);
        __tag89.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.logout\')", java.lang.String.class,"name"));
        _activeTag=__tag89;
        __result__tag89 = __tag89.doStartTag();

        if (__result__tag89!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag89== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag89.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag89);
            return true;
        }
        _activeTag=__tag89.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag89);
        __tag89.release();
        return false;
    }

    private boolean _jsp__tag90(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.HelpMenuTag __tag90 = null ;
        int __result__tag90 = 0 ;

        if (__tag90 == null ){
            __tag90 = new  com.fedex.framework.taglib.HelpMenuTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag90);
        }
        __tag90.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag90, parent);
        __tag90.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("help.menu.ship", java.lang.String.class,"id"));
        __tag90.setTitle(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpTitle}",java.lang.String.class,pageContext,_jspx_fnmap));
        __tag90.setHelpWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("72")).intValue());
        __tag90.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("125")).intValue());
        _activeTag=__tag90;
        __result__tag90 = __tag90.doStartTag();

        if (__result__tag90!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag90== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block79Bytes, _wl_block79);

                if (_jsp__tag91(request, response, pageContext, _activeTag, __tag90))
                 return true;
                _bw.write(_wl_block122Bytes, _wl_block122);
            } while (__tag90.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag90.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag90);
            return true;
        }
        _activeTag=__tag90.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag90);
        __tag90.release();
        return false;
    }

    private boolean _jsp__tag91(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.HelpMenuItemTag __tag91 = null ;
        int __result__tag91 = 0 ;

        if (__tag91 == null ){
            __tag91 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag91);
        }
        __tag91.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag91, parent);
        __tag91.sethelpMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpItem1}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag91;
        __result__tag91 = __tag91.doStartTag();

        if (__result__tag91!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag91== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block79Bytes, _wl_block79);
            } while (__tag91.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag91.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag91);
            return true;
        }
        _activeTag=__tag91.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag91);
        __tag91.release();
        return false;
    }

    private boolean _jsp__tag92(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag92 = null ;
        int __result__tag92 = 0 ;

        if (__tag92 == null ){
            __tag92 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag92);
        }
        __tag92.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag92, parent);
        __tag92.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.onreloadofpagelabel", java.lang.String.class,"key"));
        _activeTag=__tag92;
        __result__tag92 = __tag92.doStartTag();

        if (__result__tag92!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag92== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag92.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag92);
            return true;
        }
        _activeTag=__tag92.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag92);
        __tag92.release();
        return false;
    }

    private boolean _jsp__tag96(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag96 = null ;
        int __result__tag96 = 0 ;

        if (__tag96 == null ){
            __tag96 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag96);
        }
        __tag96.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag96, parent);
        __tag96.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.createShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag96;
        __result__tag96 = __tag96.doStartTag();

        if (__result__tag96!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag96== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag96.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag96.doInitBody();
                }
                do {
                    _bw.write(_wl_block80Bytes, _wl_block80);

                    if (_jsp__tag97(request, response, pageContext, _activeTag, __tag96))
                     return true;
                    _bw.write(_wl_block80Bytes, _wl_block80);
                } while (__tag96.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag96== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag96.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag96);
            return true;
        }
        _activeTag=__tag96.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag96);
        __tag96.release();
        return false;
    }

    private boolean _jsp__tag97(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag97 = null ;
        int __result__tag97 = 0 ;

        if (__tag97 == null ){
            __tag97 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag97);
        }
        __tag97.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag97, parent);
        __tag97.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag97;
        __result__tag97 = __tag97.doStartTag();

        if (__result__tag97!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag97== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag97.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag97.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag97);
            return true;
        }
        _activeTag=__tag97.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag97);
        __tag97.release();
        return false;
    }

    private boolean _jsp__tag98(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag98 = null ;
        int __result__tag98 = 0 ;

        if (__tag98 == null ){
            __tag98 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag98);
        }
        __tag98.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag98, parent);
        __tag98.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.returnShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag98;
        __result__tag98 = __tag98.doStartTag();

        if (__result__tag98!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag98== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag98.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag98.doInitBody();
                }
                do {
                    _bw.write(_wl_block80Bytes, _wl_block80);

                    if (_jsp__tag99(request, response, pageContext, _activeTag, __tag98))
                     return true;
                    _bw.write(_wl_block80Bytes, _wl_block80);
                } while (__tag98.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag98== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag98.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag98);
            return true;
        }
        _activeTag=__tag98.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag98);
        __tag98.release();
        return false;
    }

    private boolean _jsp__tag99(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag99 = null ;
        int __result__tag99 = 0 ;

        if (__tag99 == null ){
            __tag99 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag99);
        }
        __tag99.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag99, parent);
        __tag99.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createReturnShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag99;
        __result__tag99 = __tag99.doStartTag();

        if (__result__tag99!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag99== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag99.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag99.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag99);
            return true;
        }
        _activeTag=__tag99.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag99);
        __tag99.release();
        return false;
    }

    private boolean _jsp__tag100(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag100 = null ;
        int __result__tag100 = 0 ;

        if (__tag100 == null ){
            __tag100 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag100);
        }
        __tag100.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag100, parent);
        __tag100.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.importShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag100;
        __result__tag100 = __tag100.doStartTag();

        if (__result__tag100!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag100== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag100.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag100.doInitBody();
                }
                do {
                    _bw.write(_wl_block80Bytes, _wl_block80);

                    if (_jsp__tag101(request, response, pageContext, _activeTag, __tag100))
                     return true;
                    _bw.write(_wl_block80Bytes, _wl_block80);
                } while (__tag100.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag100== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag100.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag100);
            return true;
        }
        _activeTag=__tag100.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag100);
        __tag100.release();
        return false;
    }

    private boolean _jsp__tag101(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag101 = null ;
        int __result__tag101 = 0 ;

        if (__tag101 == null ){
            __tag101 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag101);
        }
        __tag101.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag101, parent);
        __tag101.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createImportShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag101;
        __result__tag101 = __tag101.doStartTag();

        if (__result__tag101!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag101== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag101.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag101.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag101);
            return true;
        }
        _activeTag=__tag101.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag101);
        __tag101.release();
        return false;
    }

    private boolean _jsp__tag102(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag102 = null ;
        int __result__tag102 = 0 ;

        if (__tag102 == null ){
            __tag102 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag102);
        }
        __tag102.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag102, parent);
        __tag102.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${viewPendingShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag102;
        __result__tag102 = __tag102.doStartTag();

        if (__result__tag102!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag102== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag102.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag102.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag102);
            return true;
        }
        _activeTag=__tag102.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag102);
        __tag102.release();
        return false;
    }

    private boolean _jsp__tag107(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag107 = null ;
        int __result__tag107 = 0 ;

        if (__tag107 == null ){
            __tag107 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag107);
        }
        __tag107.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag107, parent);
        __tag107.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${addressBookMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag107;
        __result__tag107 = __tag107.doStartTag();

        if (__result__tag107!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag107== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block85Bytes, _wl_block85);
            } while (__tag107.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag107.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag107);
            return true;
        }
        _activeTag=__tag107.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag107);
        __tag107.release();
        return false;
    }

    private boolean _jsp__tag108(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag108 = null ;
        int __result__tag108 = 0 ;

        if (__tag108 == null ){
            __tag108 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag108);
        }
        __tag108.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag108, parent);
        __tag108.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{!freightNavigationView.creditCardShipment}", java.lang.String.class,"test"));
        _activeTag=__tag108;
        __result__tag108 = __tag108.doStartTag();

        if (__result__tag108!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag108== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag108.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag108.doInitBody();
                }
                do {
                    _bw.write(_wl_block80Bytes, _wl_block80);

                    if (_jsp__tag109(request, response, pageContext, _activeTag, __tag108))
                     return true;
                    _bw.write(_wl_block132Bytes, _wl_block132);
                } while (__tag108.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag108== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag108.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag108);
            return true;
        }
        _activeTag=__tag108.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag108);
        __tag108.release();
        return false;
    }

    private boolean _jsp__tag109(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag109 = null ;
        int __result__tag109 = 0 ;

        if (__tag109 == null ){
            __tag109 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag109);
        }
        __tag109.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag109, parent);
        __tag109.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${shipmentProfilesMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag109;
        __result__tag109 = __tag109.doStartTag();

        if (__result__tag109!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag109== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag109.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag109.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag109);
            return true;
        }
        _activeTag=__tag109.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag109);
        __tag109.release();
        return false;
    }

    private boolean _jsp__tag110(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag110 = null ;
        int __result__tag110 = 0 ;

        if (__tag110 == null ){
            __tag110 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag110);
        }
        __tag110.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag110, parent);
        __tag110.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${dimensionsMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag110;
        __result__tag110 = __tag110.doStartTag();

        if (__result__tag110!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag110== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block85Bytes, _wl_block85);
            } while (__tag110.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag110.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag110);
            return true;
        }
        _activeTag=__tag110.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag110);
        __tag110.release();
        return false;
    }

    private boolean _jsp__tag111(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag111 = null ;
        int __result__tag111 = 0 ;

        if (__tag111 == null ){
            __tag111 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag111);
        }
        __tag111.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag111, parent);
        __tag111.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.freightTabAllowed}", java.lang.String.class,"test"));
        _activeTag=__tag111;
        __result__tag111 = __tag111.doStartTag();

        if (__result__tag111!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag111== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag111.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag111.doInitBody();
                }
                do {
                    _bw.write(_wl_block80Bytes, _wl_block80);

                    if (_jsp__tag112(request, response, pageContext, _activeTag, __tag111))
                     return true;
                    _bw.write(_wl_block135Bytes, _wl_block135);
                } while (__tag111.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag111== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag111.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag111);
            return true;
        }
        _activeTag=__tag111.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag111);
        __tag111.release();
        return false;
    }

    private boolean _jsp__tag112(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag112 = null ;
        int __result__tag112 = 0 ;

        if (__tag112 == null ){
            __tag112 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag112);
        }
        __tag112.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag112, parent);
        __tag112.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${bolLineItemProfilesMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag112;
        __result__tag112 = __tag112.doStartTag();

        if (__result__tag112!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag112== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag112.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag112.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag112);
            return true;
        }
        _activeTag=__tag112.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag112);
        __tag112.release();
        return false;
    }

    private boolean _jsp__tag117(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag117 = null ;
        int __result__tag117 = 0 ;

        if (__tag117 == null ){
            __tag117 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag117);
        }
        __tag117.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag117, parent);
        __tag117.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'regUserNoAccount\'}", java.lang.String.class,"test"));
        _activeTag=__tag117;
        __result__tag117 = __tag117.doStartTag();

        if (__result__tag117!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag117== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag117.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag117.doInitBody();
                }
                do {
                    _bw.write(_wl_block144Bytes, _wl_block144);
                } while (__tag117.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag117== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag117.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag117);
            return true;
        }
        _activeTag=__tag117.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag117);
        __tag117.release();
        return false;
    }

    private boolean _jsp__tag118(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseTag __tag118 = null ;
        int __result__tag118 = 0 ;

        if (__tag118 == null ){
            __tag118 = new  org.apache.struts2.views.jsp.ElseTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag118);
        }
        __tag118.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag118, parent);
        _activeTag=__tag118;
        __result__tag118 = __tag118.doStartTag();

        if (__result__tag118!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag118== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag118.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag118.doInitBody();
                }
                do {
                    _bw.write(_wl_block145Bytes, _wl_block145);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block146Bytes, _wl_block146);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext,_jspx_fnmap), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block147Bytes, _wl_block147);
                } while (__tag118.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag118== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag118.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag118);
            return true;
        }
        _activeTag=__tag118.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag118);
        __tag118.release();
        return false;
    }

    private boolean _jsp__tag119(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag119 = null ;
        int __result__tag119 = 0 ;

        if (__tag119 == null ){
            __tag119 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag119);
        }
        __tag119.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag119, parent);
        __tag119.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{contactAdminButtonApplicable}", java.lang.String.class,"test"));
        _activeTag=__tag119;
        __result__tag119 = __tag119.doStartTag();

        if (__result__tag119!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag119== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag119.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag119.doInitBody();
                }
                do {
                    _bw.write(_wl_block149Bytes, _wl_block149);

                    if (_jsp__tag120(request, response, pageContext, _activeTag, __tag119))
                     return true;
                    _bw.write(_wl_block150Bytes, _wl_block150);

                    if (_jsp__tag121(request, response, pageContext, _activeTag, __tag119))
                     return true;
                    _bw.write(_wl_block151Bytes, _wl_block151);
                } while (__tag119.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag119== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag119.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag119);
            return true;
        }
        _activeTag=__tag119.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag119);
        __tag119.release();
        return false;
    }

    private boolean _jsp__tag120(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag120 = null ;
        int __result__tag120 = 0 ;

        if (__tag120 == null ){
            __tag120 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag120);
        }
        __tag120.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag120, parent);
        __tag120.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.passkey.contactAdmin", java.lang.String.class,"key"));
        _activeTag=__tag120;
        __result__tag120 = __tag120.doStartTag();

        if (__result__tag120!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag120== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag120.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag120);
            return true;
        }
        _activeTag=__tag120.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag120);
        __tag120.release();
        return false;
    }

    private boolean _jsp__tag121(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag121 = null ;
        int __result__tag121 = 0 ;

        if (__tag121 == null ){
            __tag121 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag121);
        }
        __tag121.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag121, parent);
        __tag121.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.administrator", java.lang.String.class,"key"));
        _activeTag=__tag121;
        __result__tag121 = __tag121.doStartTag();

        if (__result__tag121!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag121== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag121.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag121);
            return true;
        }
        _activeTag=__tag121.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag121);
        __tag121.release();
        return false;
    }

    private boolean _jsp__tag122(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag122 = null ;
        int __result__tag122 = 0 ;

        if (__tag122 == null ){
            __tag122 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag122);
        }
        __tag122.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag122, parent);
        __tag122.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{operatingMode == \'PACKAGE\'}", java.lang.String.class,"test"));
        _activeTag=__tag122;
        __result__tag122 = __tag122.doStartTag();

        if (__result__tag122!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag122== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag122.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag122.doInitBody();
                }
                do {
                    _bw.write(_wl_block153Bytes, _wl_block153);

                    if (_jsp__tag123(request, response, pageContext, _activeTag, __tag122))
                     return true;
                    _bw.write(_wl_block157Bytes, _wl_block157);

                    if (_jsp__tag126(request, response, pageContext, _activeTag, __tag122))
                     return true;
                    _bw.write(_wl_block161Bytes, _wl_block161);

                    if (_jsp__tag129(request, response, pageContext, _activeTag, __tag122))
                     return true;
                    _bw.write(_wl_block162Bytes, _wl_block162);
                } while (__tag122.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag122== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag122.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag122);
            return true;
        }
        _activeTag=__tag122.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag122);
        __tag122.release();
        return false;
    }

    private boolean _jsp__tag123(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag123 = null ;
        int __result__tag123 = 0 ;

        if (__tag123 == null ){
            __tag123 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag123);
        }
        __tag123.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag123, parent);
        __tag123.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'regUserNoServices\'}", java.lang.String.class,"test"));
        _activeTag=__tag123;
        __result__tag123 = __tag123.doStartTag();

        if (__result__tag123!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag123== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag123.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag123.doInitBody();
                }
                do {
                    _bw.write(_wl_block154Bytes, _wl_block154);

                    if (_jsp__tag124(request, response, pageContext, _activeTag, __tag123))
                     return true;
                    _bw.write(_wl_block155Bytes, _wl_block155);

                    if (_jsp__tag125(request, response, pageContext, _activeTag, __tag123))
                     return true;
                    _bw.write(_wl_block156Bytes, _wl_block156);
                } while (__tag123.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag123== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag123.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag123);
            return true;
        }
        _activeTag=__tag123.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag123);
        __tag123.release();
        return false;
    }

    private boolean _jsp__tag124(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag124 = null ;
        int __result__tag124 = 0 ;

        if (__tag124 == null ){
            __tag124 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag124);
        }
        __tag124.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag124, parent);
        __tag124.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag124;
        __result__tag124 = __tag124.doStartTag();

        if (__result__tag124!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag124== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag124.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag124);
            return true;
        }
        _activeTag=__tag124.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag124);
        __tag124.release();
        return false;
    }

    private boolean _jsp__tag125(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag125 = null ;
        int __result__tag125 = 0 ;

        if (__tag125 == null ){
            __tag125 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag125);
        }
        __tag125.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag125, parent);
        __tag125.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.regular.noServices\')", java.lang.String.class,"name"));
        _activeTag=__tag125;
        __result__tag125 = __tag125.doStartTag();

        if (__result__tag125!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag125== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag125.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag125);
            return true;
        }
        _activeTag=__tag125.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag125);
        __tag125.release();
        return false;
    }

    private boolean _jsp__tag126(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag126 = null ;
        int __result__tag126 = 0 ;

        if (__tag126 == null ){
            __tag126 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag126);
        }
        __tag126.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag126, parent);
        __tag126.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'ipassUserNoServices\' }", java.lang.String.class,"test"));
        _activeTag=__tag126;
        __result__tag126 = __tag126.doStartTag();

        if (__result__tag126!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag126== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag126.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag126.doInitBody();
                }
                do {
                    _bw.write(_wl_block158Bytes, _wl_block158);

                    if (_jsp__tag127(request, response, pageContext, _activeTag, __tag126))
                     return true;
                    _bw.write(_wl_block159Bytes, _wl_block159);

                    if (_jsp__tag128(request, response, pageContext, _activeTag, __tag126))
                     return true;
                    _bw.write(_wl_block160Bytes, _wl_block160);
                } while (__tag126.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag126== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag126.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag126);
            return true;
        }
        _activeTag=__tag126.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag126);
        __tag126.release();
        return false;
    }

    private boolean _jsp__tag127(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag127 = null ;
        int __result__tag127 = 0 ;

        if (__tag127 == null ){
            __tag127 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag127);
        }
        __tag127.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag127, parent);
        __tag127.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag127;
        __result__tag127 = __tag127.doStartTag();

        if (__result__tag127!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag127== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag127.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag127);
            return true;
        }
        _activeTag=__tag127.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag127);
        __tag127.release();
        return false;
    }

    private boolean _jsp__tag128(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag128 = null ;
        int __result__tag128 = 0 ;

        if (__tag128 == null ){
            __tag128 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag128);
        }
        __tag128.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag128, parent);
        __tag128.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.ipass.noServices\')", java.lang.String.class,"name"));
        _activeTag=__tag128;
        __result__tag128 = __tag128.doStartTag();

        if (__result__tag128!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag128== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag128.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag128);
            return true;
        }
        _activeTag=__tag128.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag128);
        __tag128.release();
        return false;
    }

    private boolean _jsp__tag129(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag129 = null ;
        int __result__tag129 = 0 ;

        if (__tag129 == null ){
            __tag129 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag129);
        }
        __tag129.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag129, parent);
        __tag129.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'adminNoServices\'}", java.lang.String.class,"test"));
        _activeTag=__tag129;
        __result__tag129 = __tag129.doStartTag();

        if (__result__tag129!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag129== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag129.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag129.doInitBody();
                }
                do {
                    _bw.write(_wl_block158Bytes, _wl_block158);

                    if (_jsp__tag130(request, response, pageContext, _activeTag, __tag129))
                     return true;
                    _bw.write(_wl_block159Bytes, _wl_block159);

                    if (_jsp__tag131(request, response, pageContext, _activeTag, __tag129))
                     return true;
                    _bw.write(_wl_block160Bytes, _wl_block160);
                } while (__tag129.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag129== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag129.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag129);
            return true;
        }
        _activeTag=__tag129.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag129);
        __tag129.release();
        return false;
    }

    private boolean _jsp__tag130(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag130 = null ;
        int __result__tag130 = 0 ;

        if (__tag130 == null ){
            __tag130 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag130);
        }
        __tag130.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag130, parent);
        __tag130.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag130;
        __result__tag130 = __tag130.doStartTag();

        if (__result__tag130!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag130== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag130.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag130);
            return true;
        }
        _activeTag=__tag130.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag130);
        __tag130.release();
        return false;
    }

    private boolean _jsp__tag131(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag131 = null ;
        int __result__tag131 = 0 ;

        if (__tag131 == null ){
            __tag131 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag131);
        }
        __tag131.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag131, parent);
        __tag131.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.admin.noServices\')", java.lang.String.class,"name"));
        _activeTag=__tag131;
        __result__tag131 = __tag131.doStartTag();

        if (__result__tag131!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag131== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag131.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag131);
            return true;
        }
        _activeTag=__tag131.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag131);
        __tag131.release();
        return false;
    }

    private boolean _jsp__tag134(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag134 = null ;
        int __result__tag134 = 0 ;

        if (__tag134 == null ){
            __tag134 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag134);
        }
        __tag134.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag134, parent);
        __tag134.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag134;
        __result__tag134 = __tag134.doStartTag();

        if (__result__tag134!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag134== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag134.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag134);
            return true;
        }
        _activeTag=__tag134.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag134);
        __tag134.release();
        return false;
    }

    private boolean _jsp__tag135(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag135 = null ;
        int __result__tag135 = 0 ;

        if (__tag135 == null ){
            __tag135 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag135);
        }
        __tag135.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag135, parent);
        __tag135.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'accountModule.addAccountLink\')", java.lang.String.class,"name"));
        _activeTag=__tag135;
        __result__tag135 = __tag135.doStartTag();

        if (__result__tag135!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag135== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag135.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag135);
            return true;
        }
        _activeTag=__tag135.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag135);
        __tag135.release();
        return false;
    }

    private boolean _jsp__tag136(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag136 = null ;
        int __result__tag136 = 0 ;

        if (__tag136 == null ){
            __tag136 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag136);
        }
        __tag136.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag136, parent);
        __tag136.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.regular.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag136;
        __result__tag136 = __tag136.doStartTag();

        if (__result__tag136!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag136== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag136.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag136);
            return true;
        }
        _activeTag=__tag136.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag136);
        __tag136.release();
        return false;
    }

    private boolean _jsp__tag137(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag137 = null ;
        int __result__tag137 = 0 ;

        if (__tag137 == null ){
            __tag137 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag137);
        }
        __tag137.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag137, parent);
        __tag137.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.regular.noaccount1\')", java.lang.String.class,"name"));
        _activeTag=__tag137;
        __result__tag137 = __tag137.doStartTag();

        if (__result__tag137!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag137== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag137.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag137);
            return true;
        }
        _activeTag=__tag137.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag137);
        __tag137.release();
        return false;
    }

    private boolean _jsp__tag138(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag138 = null ;
        int __result__tag138 = 0 ;

        if (__tag138 == null ){
            __tag138 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag138);
        }
        __tag138.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag138, parent);
        __tag138.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'ipassUserNoAccount\' }", java.lang.String.class,"test"));
        _activeTag=__tag138;
        __result__tag138 = __tag138.doStartTag();

        if (__result__tag138!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag138== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag138.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag138.doInitBody();
                }
                do {
                    _bw.write(_wl_block158Bytes, _wl_block158);

                    if (_jsp__tag139(request, response, pageContext, _activeTag, __tag138))
                     return true;
                    _bw.write(_wl_block159Bytes, _wl_block159);

                    if (_jsp__tag140(request, response, pageContext, _activeTag, __tag138))
                     return true;
                    _bw.write(_wl_block160Bytes, _wl_block160);
                } while (__tag138.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag138== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag138.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag138);
            return true;
        }
        _activeTag=__tag138.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag138);
        __tag138.release();
        return false;
    }

    private boolean _jsp__tag139(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag139 = null ;
        int __result__tag139 = 0 ;

        if (__tag139 == null ){
            __tag139 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag139);
        }
        __tag139.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag139, parent);
        __tag139.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag139;
        __result__tag139 = __tag139.doStartTag();

        if (__result__tag139!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag139== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag139.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag139);
            return true;
        }
        _activeTag=__tag139.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag139);
        __tag139.release();
        return false;
    }

    private boolean _jsp__tag140(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag140 = null ;
        int __result__tag140 = 0 ;

        if (__tag140 == null ){
            __tag140 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag140);
        }
        __tag140.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag140, parent);
        __tag140.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.ipass.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag140;
        __result__tag140 = __tag140.doStartTag();

        if (__result__tag140!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag140== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag140.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag140);
            return true;
        }
        _activeTag=__tag140.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag140);
        __tag140.release();
        return false;
    }

    private boolean _jsp__tag142(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag142 = null ;
        int __result__tag142 = 0 ;

        if (__tag142 == null ){
            __tag142 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag142);
        }
        __tag142.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag142, parent);
        __tag142.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag142;
        __result__tag142 = __tag142.doStartTag();

        if (__result__tag142!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag142== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag142.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag142);
            return true;
        }
        _activeTag=__tag142.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag142);
        __tag142.release();
        return false;
    }

    private boolean _jsp__tag143(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag143 = null ;
        int __result__tag143 = 0 ;

        if (__tag143 == null ){
            __tag143 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag143);
        }
        __tag143.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag143, parent);
        __tag143.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'accountModule.addAccountLink\')", java.lang.String.class,"name"));
        _activeTag=__tag143;
        __result__tag143 = __tag143.doStartTag();

        if (__result__tag143!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag143== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag143.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag143);
            return true;
        }
        _activeTag=__tag143.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag143);
        __tag143.release();
        return false;
    }

    private boolean _jsp__tag144(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag144 = null ;
        int __result__tag144 = 0 ;

        if (__tag144 == null ){
            __tag144 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag144);
        }
        __tag144.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag144, parent);
        __tag144.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.admin.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag144;
        __result__tag144 = __tag144.doStartTag();

        if (__result__tag144!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag144== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag144.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag144);
            return true;
        }
        _activeTag=__tag144.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag144);
        __tag144.release();
        return false;
    }

    private boolean _jsp__tag145(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag145 = null ;
        int __result__tag145 = 0 ;

        if (__tag145 == null ){
            __tag145 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag145);
        }
        __tag145.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag145, parent);
        __tag145.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'ipassNoServicePrivilege\'}", java.lang.String.class,"test"));
        _activeTag=__tag145;
        __result__tag145 = __tag145.doStartTag();

        if (__result__tag145!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag145== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag145.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag145.doInitBody();
                }
                do {
                    _bw.write(_wl_block180Bytes, _wl_block180);

                    if (_jsp__tag146(request, response, pageContext, _activeTag, __tag145))
                     return true;
                    _bw.write(_wl_block159Bytes, _wl_block159);

                    if (_jsp__tag147(request, response, pageContext, _activeTag, __tag145))
                     return true;
                    _bw.write(_wl_block160Bytes, _wl_block160);
                } while (__tag145.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag145== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag145.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag145);
            return true;
        }
        _activeTag=__tag145.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag145);
        __tag145.release();
        return false;
    }

    private boolean _jsp__tag146(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag146 = null ;
        int __result__tag146 = 0 ;

        if (__tag146 == null ){
            __tag146 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag146);
        }
        __tag146.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag146, parent);
        __tag146.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag146;
        __result__tag146 = __tag146.doStartTag();

        if (__result__tag146!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag146== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag146.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag146);
            return true;
        }
        _activeTag=__tag146.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag146);
        __tag146.release();
        return false;
    }

    private boolean _jsp__tag147(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag147 = null ;
        int __result__tag147 = 0 ;

        if (__tag147 == null ){
            __tag147 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag147);
        }
        __tag147.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag147, parent);
        __tag147.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.ipass.noServicePrivileges\')", java.lang.String.class,"name"));
        _activeTag=__tag147;
        __result__tag147 = __tag147.doStartTag();

        if (__result__tag147!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag147== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag147.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag147);
            return true;
        }
        _activeTag=__tag147.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag147);
        __tag147.release();
        return false;
    }

    private boolean _jsp__tag148(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag148 = null ;
        int __result__tag148 = 0 ;

        if (__tag148 == null ){
            __tag148 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag148);
        }
        __tag148.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag148, parent);
        __tag148.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{reason == \'adminNoServicePrivilege\'}", java.lang.String.class,"test"));
        _activeTag=__tag148;
        __result__tag148 = __tag148.doStartTag();

        if (__result__tag148!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag148== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag148.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag148.doInitBody();
                }
                do {
                    _bw.write(_wl_block175Bytes, _wl_block175);

                    if (_jsp__tag149(request, response, pageContext, _activeTag, __tag148))
                     return true;
                    _bw.write(_wl_block181Bytes, _wl_block181);

                    if (_jsp__tag150(request, response, pageContext, _activeTag, __tag148))
                     return true;
                    _bw.write(_wl_block160Bytes, _wl_block160);
                } while (__tag148.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag148== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag148.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag148);
            return true;
        }
        _activeTag=__tag148.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag148);
        __tag148.release();
        return false;
    }

    private boolean _jsp__tag149(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag149 = null ;
        int __result__tag149 = 0 ;

        if (__tag149 == null ){
            __tag149 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag149);
        }
        __tag149.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag149, parent);
        __tag149.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag149;
        __result__tag149 = __tag149.doStartTag();

        if (__result__tag149!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag149== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag149.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag149);
            return true;
        }
        _activeTag=__tag149.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag149);
        __tag149.release();
        return false;
    }

    private boolean _jsp__tag150(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag150 = null ;
        int __result__tag150 = 0 ;

        if (__tag150 == null ){
            __tag150 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag150);
        }
        __tag150.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag150, parent);
        __tag150.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.admin.noServicePrivileges\')", java.lang.String.class,"name"));
        _activeTag=__tag150;
        __result__tag150 = __tag150.doStartTag();

        if (__result__tag150!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag150== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag150.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag150);
            return true;
        }
        _activeTag=__tag150.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag150);
        __tag150.release();
        return false;
    }
}
