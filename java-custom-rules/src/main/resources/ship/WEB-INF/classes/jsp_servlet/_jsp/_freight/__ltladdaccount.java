package jsp_servlet._jsp._freight;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

public final class __ltladdaccount extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/freight/LtlAddAccount.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/FrameworkJSInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/Struts2NavigationHeader.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/WebCacheInclude.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/FreightPageCommonCSSInclude.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/Header.jsp", 1550053020000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/LtlAddAccountJSInclude.jsi", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/freight/FreightPageCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ReadSessionCSRFToken.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 =" \r\n\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="\r\n<head>\r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\r\n\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 =" \r\n\r\n";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n\r\n<!-- Fix for defect 442915 -->\r\n";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\r\n\r\n<script language=\"JavaScript\">\r\n\tvar fsmr = {};\r\n\tfsmr.priv = {};\r\n\tfsmr.url={};\r\n\tfsmr.pref={};\r\n\t\r\n\tvar contextPath =\"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 ="\";\r\n\tvar _isReturnShipment = false;\r\n\tvar _isReturnsSPEnabled = false;\r\n\tvar _isSPEnabled = false;\r\n\tvar _isImportShipment = false;\r\n\tvar _isLACSouthMiamiEnabled = false;\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 ="\";\r\n\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\";\r\n\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 ="\";\r\n\tvar i18n_residential = \"";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 ="\";\r\n\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 ="\";\t\r\n\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\r\n\tvar _isFreight2020PickupEnabled = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\t\r\n\t// Jul18CL - ITG 181427 Freight 2020 Phase 2\r\n\tvar _isFreight2020Phase2Enabled = ";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 =";\r\n\t\r\n\t//Jan19CL-PPM38954 FXF2020 Phase 3\r\n\tvar _isFreight2020Phase3Enabled = ";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\t\r\n\t// Jan18CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestrictedForLTL = ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\t\r\n\t//Oct 2018 CMT\r\n\tvar _isFreight2020SMSEnabled = ";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 =";\r\n\t\r\n\t//Jan19CL-Freight2020 BrokerInclusive alert message\r\n\tvar _isFreight2020Phase3_BI_Alert_Enabled=";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 =";\r\n\t\r\n\tfunction readUpdatedSessionCSRFToken() {\r\n    \t$(\'#reloadCSRFToken\').load(\'reloadCSRFToken.action\',{}); \r\n    \t// Added {} at end to force POST request. By default IE uses GET request due to which page is cached and subsequent page loading requests are blocked. \r\n    }\r\n</script>\r\n<div id=\"reloadCSRFToken\"> ";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\r\n<script>\r\n\tvar _csrfToken = \"";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 ="\";\r\n</script>\r\n";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 ="</div>";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="<link rel=\"stylesheet\" type=\"text/css\" href=\"/framework/css/widgets.css\">\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="/css/fsm_common.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="/css/fsm_temporary.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="/css/fsmImgsSprite.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="/css/fsm_ship.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 ="/css/fsm_freight.css\">\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 ="/css/fsm_products.css\">\r\n\r\n<link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-min.css\" id=\"globalCSS\" />\r\n\r\n<!--[if lte IE 7]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie-min.css\" /><![endif]--> \r\n<!--[if lte IE 6]><link rel=\"stylesheet\" type=\"text/css\" href=\"/css/t1/global-wrapper-ie6-min.css\" /><![endif]-->";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 ="\r\n\r\n<script>\r\nvar webCacheTimeStamp = \"";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="\";\r\n</script>";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="\r\n\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n<meta name=\"wsstitle\" id=\"wsstitle\" content=\"Add Account\">\r\n<meta name=\"wssmlc\" id=\"wssmlc\" content=\"/";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 ="/";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="/fedex/inet/ltl\">\r\n<title></title>\r\n\r\n";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 ="\r\n\t";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\r\n\r\n<script>\r\nvar pageType=\"freight\";\r\nvar helpPageUrl = \'";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 ="\';\r\nvar helpPage= \"";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 ="\";\r\nvar contextPath =\"";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 ="\";\r\nvar _utype= ";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 =";\r\nvar adminEmailId = \"";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 ="\";\r\nvar isAdministeredUser=";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 =";\r\nvar localLang = \'";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 ="\';\r\nvar contryLowerCase = \'";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 ="\';\r\n</script> \r\n\r\n";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 ="\r\n\r\n</head>\r\n<body>\r\n\r\n";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\r\n    \r\n\t<div id=\"container\">\r\n\t\t<div id=\"fedex-header\">\r\n\t\t\r\n\t\t</div>\r\n\t\t<div id=\"content\" class=\"fx_clearfix\">\r\n\t\t\r\n\t\t<style id=\"antiClickjack\">body{display:none !important;}</style>\r\n\r\n\t<script type=\"text/javascript\">\r\n   \tif (self === top) {\r\n       var antiClickjack = document.getElementById(\"antiClickjack\");\r\n       antiClickjack.parentNode.removeChild(antiClickjack);\r\n   \t} else {\r\n       top.location = self.location;\r\n   \t}\r\n\t</script>\r\n";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\r\n\r\n  <div id=\"fsmAddAccountPage\">  \r\n    ";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 ="\r\n \r\n <script type=\"text/javascript\" charset=\"utf-8\">\r\n \r\n\tvar historyUrl = \"";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\";\r\n\tvar _isCreditCardShipment = ";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 =";\r\n\tvar freightEnabled = ";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 =";\r\n\tvar packageHelp = false;\t\r\n\t\r\n\tvar pendingOperation = \"";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="\";\t\r\n\tvar _isPendingShipmentsReminderEnabled = ";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 =";\r\n\tvar _isNavigateAwayFromShipmentNotifyFlag = ";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 =";\t\r\n\tvar pendingRecords = \"";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 ="\";\r\n\tvar hasGroundManifestReminder = ";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 =";\r\n\tvar _isReturnOnlyPrivilegeEnabled = ";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 =";\r\n\tvar _isImportShipmentAllowed = ";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 =";\r\n\tvar _isReturnShipmentNavigationAllowed = ";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 =";\r\n\tvar myEcommerceTabShown = ";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 =";\t\t\r\n\t// #ITG 163023 - File:inetAppConfig.properties, Key:AccountMaskingEnabled\r\n\t// As part of cleanup isAccountMaskingEnabled variable is no longer exists\t\t\r\n\t\t\r\n</script>\r\n \r\n  ";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 ="\r\n  ";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 ="\r\n \r\n  ";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 ="  \r\n  ";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 ="\r\n  \r\n<div>\r\n";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 ="\r\n</div>\r\n\r\n";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 ="\r\n<div id=\"cobrand-logo\">\r\n\t<IMG src=\"/images/ascend/shared/apps/";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 =".gif\" alt=\"Co Logo\"\r\n\t\tonerror=\"javascript:fillImage(this,\'/shipping/images/shared/dot_clear.gif\')\"\r\n\t\tborder=0 height=50 width=100 />\r\n</div>\r\n";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 ="\r\n\r\n<div id=\"ltlAppHeader\">\r\n\t<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n\t\t<tr>\r\n\t\t\t<td width=\"50%\">\r\n\t\t\t<input id=\"readOnlyOrphan\" style=\"display: none;\">\r\n\t\t\t<h1 class=\"ui-hidden-accessibleH1\">FedEx Ship Manager<sup>&reg;</sup></h1>\r\n\t\t\t\t<label for=\"readOnlyOrphan\"  id=\"appTitle\" >\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 ="\r\n\t\t\t\t\t<sup>\r\n\t\t\t\t\t\t&reg;\r\n\t\t\t\t\t</sup>\r\n\t\t\t\t</label>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\r\n\t\t\t\t<a href=\"javascript:;\" id=\"myProfileLink\">";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 ="</a>\r\n\t\t\t</td>\r\n\t\t\t<td nowrap width=\"20%\">\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 ="\r\n\t\t\t\t\t<a href=\"javascript:;\" id=\"logoutLink\">\r\n\t\t\t\t\t\t";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 ="\r\n\t\t\t\t\t</a>\r\n\t\t\t\t";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 ="\r\n\t\t\t</td>\r\n\t\t\t<td width=\"10%\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 ="\t\t\t\t\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 ="\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t</table>\r\n\t\r\n\t<span style=\"position:relative;display:none\">&nbsp;</span>\r\n\t<div aria-label=\"";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 ="\" tabindex=\"0\"></div>\r\n\t<div id=\"appnav\" class=\"shipAppNav\">\r\n\t\t";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 ="\r\n\t\t";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 ="\r\n\t\t\t";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 ="\r\n\t   ";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 ="\r\n\t\t\t\t";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 ="\t\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 ="\r\n\t    ";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 ="    \r\n\t    \r\n\t    \r\n\t   ";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 =" \r\n\t  \r\n\t\t";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 ="\r\n\t       ";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 ="\r\n\t\r\n\t\t";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 ="\r\n\t\t\t\r\n      \t\t";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 ="\r\n      \t\t";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 ="\r\n      \t\t\t\t\r\n\t\t\t";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 ="\r\n\t\t\r\n\t\t   ";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 ="\t\r\n\t\t   ";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 ="\t\t\t\r\n\t\t\t\r\n\t\t ";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 ="\r\n\t\t\t \r\n\t        ";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 ="\r\n\t        ";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 ="\t\r\n\t        \r\n\t     \t";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 ="\r\n\t\t\t\r\n\t\t   ";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 ="\t\t\t\r\n\t\t";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 ="\t\r\n\t\t\r\n\t\t";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 ="\r\n\t</div>\r\n</div>\r\n";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 ="\r\n        <form name=\"addLtlAccount\" action=\"\"> \r\n          <input type=\"hidden\" id=\"freightMessage\" name=\"freightMessage\">\r\n          \r\n\t       <div id=\"position\">\r\n\t         <div id=\"content\">\t          \r\n\t         \r\n\t           <div id=\"createTitle\" class=\"fullWidth\">\r\n\t           <h2 class=\"ui-hidden-accessibleH1\">";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

    private static java.lang.String  _wl_block103 ="</h2>\r\n\t\t\t\t  <label class=\"appName\" aria-hidden=\"true\">";
    private final static byte[]  _wl_block103Bytes = _getBytes( _wl_block103 );

    private static java.lang.String  _wl_block104 ="</label>\t\t\t\t  \r\n\t\t\t   </div> \t\t\r\n\t\t\t  \r\n\t\t\t   <div class=\"fullWidth\" >\r\n\t\t\t\t   ";
    private final static byte[]  _wl_block104Bytes = _getBytes( _wl_block104 );

    private static java.lang.String  _wl_block105 ="\t\r\n\t\t\t\t\t      <div id=\"ship.contactAdmin\"  style=\"float:right\">\r\n\t\t\t\t\t\t\t<input type=\"button\" id=\"ship.button.contactAdmin\" class=\"btnGray\" value=\"";
    private final static byte[]  _wl_block105Bytes = _getBytes( _wl_block105 );

    private static java.lang.String  _wl_block106 ="\" aria-label=\"";
    private final static byte[]  _wl_block106Bytes = _getBytes( _wl_block106 );

    private static java.lang.String  _wl_block107 ="\"/>\r\n\t\t\t\t\t\t  </div>\r\n\t\t\t\t   ";
    private final static byte[]  _wl_block107Bytes = _getBytes( _wl_block107 );

    private static java.lang.String  _wl_block108 ="\r\n\t\t\t   </div> \r\n\t\t\t  \t \r\n\t\t\t  <div id=\"message\" class=\"fullWidth\"> \r\n\t\t\t\t  ";
    private final static byte[]  _wl_block108Bytes = _getBytes( _wl_block108 );

    private static java.lang.String  _wl_block109 ="   \r\n\t\t\t\t\t   <div id=\"message\" class=\"fullWidth\">\r\n\t\t\t\t\t     <label class=\'stepOff\'>";
    private final static byte[]  _wl_block109Bytes = _getBytes( _wl_block109 );

    private static java.lang.String  _wl_block110 ="</label>\r\n\t\t\t\t\t   </div>\r\n\t\t\t\t\t   <div class=\"fullWidth\" id=\"account.addAccountLink\">\r\n\t\t\t\t\t     <a id=\"account.addAccount\" href=\"ltl/addAccount.action\">\r\n\t\t\t\t\t\t   ";
    private final static byte[]  _wl_block110Bytes = _getBytes( _wl_block110 );

    private static java.lang.String  _wl_block111 ="\t\t\t\t\r\n\t\t\t\t\t     </a>\r\n\t\t\t\t      </div>\t\t\t\t     \t\t   \r\n\t\t\t\t  ";
    private final static byte[]  _wl_block111Bytes = _getBytes( _wl_block111 );

    private static java.lang.String  _wl_block112 ="\r\n\t\t\t\t  ";
    private final static byte[]  _wl_block112Bytes = _getBytes( _wl_block112 );

    private static java.lang.String  _wl_block113 ="\r\n\t\t\t\t\t    <div id=\"alertMessage\" class=\"fullWidth\">\r\n\t\t\t\t\t\t  ";
    private final static byte[]  _wl_block113Bytes = _getBytes( _wl_block113 );

    private static java.lang.String  _wl_block114 =" ";
    private final static byte[]  _wl_block114Bytes = _getBytes( _wl_block114 );

    private static java.lang.String  _wl_block115 ="\r\n\t\t\t\t\t    </div> \t\t\t\t\t    \r\n\t\t\t\t  ";
    private final static byte[]  _wl_block115Bytes = _getBytes( _wl_block115 );

    private static java.lang.String  _wl_block116 ="\t\t\t\t\t  \r\n\t\t\t\t   ";
    private final static byte[]  _wl_block116Bytes = _getBytes( _wl_block116 );

    private static java.lang.String  _wl_block117 ="\r\n\t\t\t\t  \r\n\t\t\t  </div>   \r\n\t         \r\n\t         </div>\t         \r\n\t      </div>\t       \r\n\t    </form>\t      \r\n   </div>\r\n   <br></br><br></br>\r\n</body>\r\n";
    private final static byte[]  _wl_block117Bytes = _getBytes( _wl_block117 );

    private static java.lang.String  _wl_block118 ="\r\n\r\n<script>\r\nvar minifiedJSFileSuffix = \"";
    private final static byte[]  _wl_block118Bytes = _getBytes( _wl_block118 );

    private static java.lang.String  _wl_block119 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"/framework/js/framework";
    private final static byte[]  _wl_block119Bytes = _getBytes( _wl_block119 );

    private static java.lang.String  _wl_block120 =".js\"></script>\r\n";
    private final static byte[]  _wl_block120Bytes = _getBytes( _wl_block120 );

    private static java.lang.String  _wl_block121 ="<script type=\"text/javascript\" charset=\"utf-8\" src=\"";
    private final static byte[]  _wl_block121Bytes = _getBytes( _wl_block121 );

    private static java.lang.String  _wl_block122 ="/js/fsm_constants";
    private final static byte[]  _wl_block122Bytes = _getBytes( _wl_block122 );

    private static java.lang.String  _wl_block123 =".js\"></script>\r\n<script type=\"text/javascript\" charset=\"utf-8\" src=\"";
    private final static byte[]  _wl_block123Bytes = _getBytes( _wl_block123 );

    private static java.lang.String  _wl_block124 ="/js/fsm_util";
    private final static byte[]  _wl_block124Bytes = _getBytes( _wl_block124 );

    private static java.lang.String  _wl_block125 ="/js/fsm_ada";
    private final static byte[]  _wl_block125Bytes = _getBytes( _wl_block125 );

    private static java.lang.String  _wl_block126 =".js\"></script>\r\n<script type=\"text/javascript\" charset=\"utf-8\"\tsrc=\"";
    private final static byte[]  _wl_block126Bytes = _getBytes( _wl_block126 );

    private static java.lang.String  _wl_block127 ="/js/fsm_popupUtil";
    private final static byte[]  _wl_block127Bytes = _getBytes( _wl_block127 );

    private static java.lang.String  _wl_block128 ="/js/fsm_displayUtil";
    private final static byte[]  _wl_block128Bytes = _getBytes( _wl_block128 );

    private static java.lang.String  _wl_block129 ="/js/fsm_nav";
    private final static byte[]  _wl_block129Bytes = _getBytes( _wl_block129 );

    private static java.lang.String  _wl_block130 ="/js/fsm_ltlFooter";
    private final static byte[]  _wl_block130Bytes = _getBytes( _wl_block130 );

    private static java.lang.String  _wl_block131 ="/js/fsm_ajax";
    private final static byte[]  _wl_block131Bytes = _getBytes( _wl_block131 );

    private static java.lang.String  _wl_block132 ="\r\n\r\n<script>\r\n\tfsm.nav.init();\r\n\tfsm.ltlFooter.init();\t\r\n</script>\r\n";
    private final static byte[]  _wl_block132Bytes = _getBytes( _wl_block132 );

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
                    _bw.write(_wl_block2Bytes, _wl_block2);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block4Bytes, _wl_block4);
                    _bw.write(_wl_block3Bytes, _wl_block3);

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
     

                    _bw.write(_wl_block3Bytes, _wl_block3);

                    if (_jsp__tag1(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag2(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block5Bytes, _wl_block5);
 if(isChrome && !locale.getLanguage().equals("fr")) { 
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag3(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
 } 
                    _bw.write(_wl_block3Bytes, _wl_block3);
 if(isChrome) { 
                    _bw.write(_wl_block0Bytes, _wl_block0);

                    if (_jsp__tag4(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
 } 
                    _bw.write(_wl_block6Bytes, _wl_block6);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block7Bytes, _wl_block7);

                    if (_jsp__tag5(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block8Bytes, _wl_block8);

                    if (_jsp__tag6(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block9Bytes, _wl_block9);

                    if (_jsp__tag7(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block10Bytes, _wl_block10);

                    if (_jsp__tag8(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block11Bytes, _wl_block11);

                    if (_jsp__tag9(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block12Bytes, _wl_block12);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block13Bytes, _wl_block13);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020PickupEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block14Bytes, _wl_block14);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block15Bytes, _wl_block15);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase2Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block16Bytes, _wl_block16);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block17Bytes, _wl_block17);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestrictedForLTL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block18Bytes, _wl_block18);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020SMSEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block19Bytes, _wl_block19);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Phase3_BI_Alert_Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block20Bytes, _wl_block20);
 String csrfToken =  (String) session.getAttribute("csrfToken"); 
                    _bw.write(_wl_block21Bytes, _wl_block21);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(csrfToken), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block22Bytes, _wl_block22);
                    _bw.write(_wl_block23Bytes, _wl_block23);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block24Bytes, _wl_block24);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block25Bytes, _wl_block25);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block26Bytes, _wl_block26);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block27Bytes, _wl_block27);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block28Bytes, _wl_block28);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block29Bytes, _wl_block29);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block30Bytes, _wl_block30);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	
	String webCachePolicy = ApplicationPropertyLoader.getInstance().getProperty("WEBCache");
	String webCacheTimeStamp = ApplicationPropertyLoader.getInstance().getProperty("WEBCacheTimeStamp");
	webCacheTimeStamp = ((WebConstants.Y.equals(webCachePolicy) && !webCacheTimeStamp.startsWith("@")) ? "_"+webCacheTimeStamp : "");
	if(webCacheTimeStamp==null){
		webCacheTimeStamp="";
	}
	//System.out.println("webCacheTimeStamp= " + webCacheTimeStamp);
	LoggerFactory.getLogger().debug(
	        "webCacheTimeStamp= " + webCacheTimeStamp);

                    _bw.write(_wl_block31Bytes, _wl_block31);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    _bw.write(_wl_block33Bytes, _wl_block33);
                     com.fedex.framework.taglib.encode.HtmlTag __tag10 = null ;
                    int __result__tag10 = 0 ;

                    if (__tag10 == null ){
                        __tag10 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag10);
                    }
                    __tag10.setPageContext(pageContext);
                    __tag10.setParent(__tag0);
                    __tag10.setValue(locale.getCountry().toLowerCase()
);
                    _activeTag=__tag10;
                    __result__tag10 = __tag10.doStartTag();

                    if (__result__tag10!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag10== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag10.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag10);
                        return;
                    }
                    _activeTag=__tag10.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag10);
                    __tag10.release();
                    _bw.write(_wl_block34Bytes, _wl_block34);
                     com.fedex.framework.taglib.encode.HtmlTag __tag11 = null ;
                    int __result__tag11 = 0 ;

                    if (__tag11 == null ){
                        __tag11 = new  com.fedex.framework.taglib.encode.HtmlTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
                    }
                    __tag11.setPageContext(pageContext);
                    __tag11.setParent(__tag0);
                    __tag11.setValue(locale.getLanguage()
);
                    _activeTag=__tag11;
                    __result__tag11 = __tag11.doStartTag();

                    if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.HtmlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag11.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag11);
                        return;
                    }
                    _activeTag=__tag11.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag11);
                    __tag11.release();
                    _bw.write(_wl_block35Bytes, _wl_block35);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	String helpPageUrl = URLBuilder.getHelpURL(locale, "quick_help");
	String localLang = locale.getLanguage();
	String contryLowerCase = locale.getCountry().toLowerCase();

                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block0Bytes, _wl_block0);
if(isFreight2020Enabled){
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag12(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
}else{
                    _bw.write(_wl_block36Bytes, _wl_block36);

                    if (_jsp__tag13(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);
}
                    _bw.write(_wl_block3Bytes, _wl_block3);

                    if (_jsp__tag14(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block0Bytes, _wl_block0);

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
                    _bw.write(_wl_block37Bytes, _wl_block37);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag21 = null ;
                    int __result__tag21 = 0 ;

                    if (__tag21 == null ){
                        __tag21 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
                    }
                    __tag21.setPageContext(pageContext);
                    __tag21.setParent(__tag0);
                    __tag21.setValue(helpPageUrl
);
                    _activeTag=__tag21;
                    __result__tag21 = __tag21.doStartTag();

                    if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag21.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag21);
                        return;
                    }
                    _activeTag=__tag21.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag21);
                    __tag21.release();
                    _bw.write(_wl_block38Bytes, _wl_block38);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpPage}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block39Bytes, _wl_block39);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block40Bytes, _wl_block40);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag22 = null ;
                    int __result__tag22 = 0 ;

                    if (__tag22 == null ){
                        __tag22 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
                    }
                    __tag22.setPageContext(pageContext);
                    __tag22.setParent(__tag0);
                    __tag22.setValue(utype
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
                    _bw.write(_wl_block41Bytes, _wl_block41);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${adminEmail}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block42Bytes, _wl_block42);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${administeredUser}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block43Bytes, _wl_block43);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag23 = null ;
                    int __result__tag23 = 0 ;

                    if (__tag23 == null ){
                        __tag23 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
                    }
                    __tag23.setPageContext(pageContext);
                    __tag23.setParent(__tag0);
                    __tag23.setValue(localLang
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
                    _bw.write(_wl_block44Bytes, _wl_block44);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag24 = null ;
                    int __result__tag24 = 0 ;

                    if (__tag24 == null ){
                        __tag24 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
                    }
                    __tag24.setPageContext(pageContext);
                    __tag24.setParent(__tag0);
                    __tag24.setValue(contryLowerCase
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
                    _bw.write(_wl_block45Bytes, _wl_block45);

 request.setAttribute("PRIMARY_MENU",WebConstants.FREIGHT_MENU);

                    _bw.write(_wl_block46Bytes, _wl_block46);

                    if (_jsp__tag25(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block3Bytes, _wl_block3);

SenderDisplayRules senderDisplayRulesHeader = new SenderDisplayRules();
java.util.Locale localeHeader = (java.util.Locale)session.getAttribute(WebConstants.COOKIE_LOCALE);
String localeCountryHeader = localeHeader.getCountry();

                    _bw.write(_wl_block47Bytes, _wl_block47);
                    _bw.write(_wl_block48Bytes, _wl_block48);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block3Bytes, _wl_block3);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block4Bytes, _wl_block4);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block3Bytes, _wl_block3);

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
 
                    _bw.write(_wl_block49Bytes, _wl_block49);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag26 = null ;
                    int __result__tag26 = 0 ;

                    if (__tag26 == null ){
                        __tag26 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
                    }
                    __tag26.setPageContext(pageContext);
                    __tag26.setParent(__tag0);
                    __tag26.setValue(historyUrl
);
                    _activeTag=__tag26;
                    __result__tag26 = __tag26.doStartTag();

                    if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag26.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag26);
                        return;
                    }
                    _activeTag=__tag26.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag26);
                    __tag26.release();
                    _bw.write(_wl_block50Bytes, _wl_block50);

                    if (_jsp__tag27(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block51Bytes, _wl_block51);

                    if (_jsp__tag28(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block52Bytes, _wl_block52);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag29 = null ;
                    int __result__tag29 = 0 ;

                    if (__tag29 == null ){
                        __tag29 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
                    }
                    __tag29.setPageContext(pageContext);
                    __tag29.setParent(__tag0);
                    __tag29.setValue(pendingOperation 
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
                    _bw.write(_wl_block53Bytes, _wl_block53);

                    if (_jsp__tag30(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block54Bytes, _wl_block54);

                    if (_jsp__tag31(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block55Bytes, _wl_block55);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag32 = null ;
                    int __result__tag32 = 0 ;

                    if (__tag32 == null ){
                        __tag32 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
                    }
                    __tag32.setPageContext(pageContext);
                    __tag32.setParent(__tag0);
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
                    _bw.write(_wl_block56Bytes, _wl_block56);

                    if (_jsp__tag33(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block57Bytes, _wl_block57);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag34 = null ;
                    int __result__tag34 = 0 ;

                    if (__tag34 == null ){
                        __tag34 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag34);
                    }
                    __tag34.setPageContext(pageContext);
                    __tag34.setParent(__tag0);
                    __tag34.setValue(isReturnOnlyPrivilegeEnabled
);
                    _activeTag=__tag34;
                    __result__tag34 = __tag34.doStartTag();

                    if (__result__tag34!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag34== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
                    _bw.write(_wl_block58Bytes, _wl_block58);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag35 = null ;
                    int __result__tag35 = 0 ;

                    if (__tag35 == null ){
                        __tag35 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag35);
                    }
                    __tag35.setPageContext(pageContext);
                    __tag35.setParent(__tag0);
                    __tag35.setValue(isImportShipmentAllowed
);
                    _activeTag=__tag35;
                    __result__tag35 = __tag35.doStartTag();

                    if (__result__tag35!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag35== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag35.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag35);
                        return;
                    }
                    _activeTag=__tag35.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag35);
                    __tag35.release();
                    _bw.write(_wl_block59Bytes, _wl_block59);
                     com.fedex.framework.taglib.encode.JavascriptTag __tag36 = null ;
                    int __result__tag36 = 0 ;

                    if (__tag36 == null ){
                        __tag36 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag36);
                    }
                    __tag36.setPageContext(pageContext);
                    __tag36.setParent(__tag0);
                    __tag36.setValue(isReturnShipmentNavigationAllowed
);
                    _activeTag=__tag36;
                    __result__tag36 = __tag36.doStartTag();

                    if (__result__tag36!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag36== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                    }
                    if (__tag36.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag36);
                        return;
                    }
                    _activeTag=__tag36.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag36);
                    __tag36.release();
                    _bw.write(_wl_block60Bytes, _wl_block60);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf( myEcommerceTabShown ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block61Bytes, _wl_block61);

                    if (_jsp__tag37(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag38(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block63Bytes, _wl_block63);

                    if (_jsp__tag39(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag40(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag41(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag42(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag43(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag44(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag45(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

                    if (_jsp__tag46(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block64Bytes, _wl_block64);

                    if (_jsp__tag47(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block62Bytes, _wl_block62);

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
   
                    _bw.write(_wl_block65Bytes, _wl_block65);

                    if (_jsp__tag48(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block66Bytes, _wl_block66);
                     org.apache.struts2.views.jsp.IfTag __tag49 = null ;
                    int __result__tag49 = 0 ;

                    if (__tag49 == null ){
                        __tag49 = new  org.apache.struts2.views.jsp.IfTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag49);
                    }
                    __tag49.setPageContext(pageContext);
                    __tag49.setParent(__tag0);
                    __tag49.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.cobrandLogo}", java.lang.String.class,"test"));
                    _activeTag=__tag49;
                    __result__tag49 = __tag49.doStartTag();

                    if (__result__tag49!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        try {
                            if (__result__tag49== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.pushBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                __tag49.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                __tag49.doInitBody();
                            }
                            do {
                                _bw.write(_wl_block67Bytes, _wl_block67);
                                 com.fedex.framework.taglib.encode.UrlTag __tag50 = null ;
                                int __result__tag50 = 0 ;

                                if (__tag50 == null ){
                                    __tag50 = new  com.fedex.framework.taglib.encode.UrlTag ();
                                    weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag50);
                                }
                                __tag50.setPageContext(pageContext);
                                __tag50.setParent(__tag49);
                                __tag50.setValue(companyCode
);
                                _activeTag=__tag50;
                                __result__tag50 = __tag50.doStartTag();

                                if (__result__tag50!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                    if (__result__tag50== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                         throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.UrlTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                    }
                                }
                                if (__tag50.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                    _activeTag = null;
                                    _releaseTags(pageContext, __tag50);
                                    return;
                                }
                                _activeTag=__tag50.getParent();
                                weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag50);
                                __tag50.release();
                                _bw.write(_wl_block68Bytes, _wl_block68);
                            } while (__tag49.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                        } finally {
                            if (__result__tag49== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                out = pageContext.popBody();
                                _bw = (weblogic.servlet.jsp.ByteWriter)out;
                            }
                        }
                    }
                    if (__tag49.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag49);
                        return;
                    }
                    _activeTag=__tag49.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag49);
                    __tag49.release();
                    _bw.write(_wl_block69Bytes, _wl_block69);

                    if (_jsp__tag51(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block70Bytes, _wl_block70);

                    if (_jsp__tag52(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block71Bytes, _wl_block71);

                    if (_jsp__tag53(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block74Bytes, _wl_block74);

                    if (_jsp__tag55(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block77Bytes, _wl_block77);

                    if (_jsp__tag57(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block78Bytes, _wl_block78);
                     com.fedex.framework.taglib.MenuTag __tag58 = null ;
                    int __result__tag58 = 0 ;

                    if (__tag58 == null ){
                        __tag58 = new  com.fedex.framework.taglib.MenuTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag58);
                    }
                    __tag58.setPageContext(pageContext);
                    __tag58.setParent(__tag0);
                    __tag58.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("menubar.nav", java.lang.String.class,"id"));
                    _activeTag=__tag58;
                    __result__tag58 = __tag58.doStartTag();

                    if (__result__tag58!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag58== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block79Bytes, _wl_block79);
if(isCreditCardShipment) {
                            _bw.write(_wl_block80Bytes, _wl_block80);
                             com.fedex.framework.taglib.MenuTabTag __tag59 = null ;
                            int __result__tag59 = 0 ;

                            if (__tag59 == null ){
                                __tag59 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag59);
                            }
                            __tag59.setPageContext(pageContext);
                            __tag59.setParent(__tag58);
                            __tag59.setTitle(prepareShipmentTab
);
                            __tag59.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("isShipmentSelected")).booleanValue());
                            __tag59.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag59.setTabWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            __tag59.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag59;
                            __result__tag59 = __tag59.doStartTag();

                            if (__result__tag59!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag59== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block80Bytes, _wl_block80);
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
                            _bw.write(_wl_block81Bytes, _wl_block81);
}else{ 
                            _bw.write(_wl_block80Bytes, _wl_block80);
                             com.fedex.framework.taglib.MenuTabTag __tag60 = null ;
                            int __result__tag60 = 0 ;

                            if (__tag60 == null ){
                                __tag60 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag60);
                            }
                            __tag60.setPageContext(pageContext);
                            __tag60.setParent(__tag58);
                            __tag60.setTitle(prepareShipmentTab
);
                            __tag60.setSelectedMenuTab(isShipmentSelected
);
                            __tag60.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                            __tag60.setTabWidth(shipTabWidth
);
                            __tag60.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag60;
                            __result__tag60 = __tag60.doStartTag();

                            if (__result__tag60!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag60== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block82Bytes, _wl_block82);

                                    if (_jsp__tag61(request, response, pageContext, _activeTag, __tag60))
                                     return;
                                    _bw.write(_wl_block82Bytes, _wl_block82);

                                    if (_jsp__tag63(request, response, pageContext, _activeTag, __tag60))
                                     return;
                                    _bw.write(_wl_block82Bytes, _wl_block82);

                                    if (_jsp__tag65(request, response, pageContext, _activeTag, __tag60))
                                     return;
                                    _bw.write(_wl_block82Bytes, _wl_block82);

                                    if (_jsp__tag67(request, response, pageContext, _activeTag, __tag60))
                                     return;
                                    _bw.write(_wl_block83Bytes, _wl_block83);
                                } while (__tag60.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag60.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag60);
                                return;
                            }
                            _activeTag=__tag60.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag60);
                            __tag60.release();
                            _bw.write(_wl_block84Bytes, _wl_block84);
} 
                            _bw.write(_wl_block85Bytes, _wl_block85);
if(isLoggedInUser){ 
                            _bw.write(_wl_block86Bytes, _wl_block86);
                             org.apache.struts2.views.jsp.IfTag __tag68 = null ;
                            int __result__tag68 = 0 ;

                            if (__tag68 == null ){
                                __tag68 = new  org.apache.struts2.views.jsp.IfTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag68);
                            }
                            __tag68.setPageContext(pageContext);
                            __tag68.setParent(__tag58);
                            __tag68.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.freightTabAllowed}", java.lang.String.class,"test"));
                            _activeTag=__tag68;
                            __result__tag68 = __tag68.doStartTag();

                            if (__result__tag68!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                try {
                                    if (__result__tag68== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                        out = pageContext.pushBody();
                                        _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                        __tag68.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                        __tag68.doInitBody();
                                    }
                                    do {
                                        _bw.write(_wl_block87Bytes, _wl_block87);
                                         com.fedex.framework.taglib.MenuTabTag __tag69 = null ;
                                        int __result__tag69 = 0 ;

                                        if (__tag69 == null ){
                                            __tag69 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag69);
                                        }
                                        __tag69.setPageContext(pageContext);
                                        __tag69.setParent(__tag68);
                                        __tag69.setTitle(ltlFreightTab
);
                                        __tag69.setSelectedMenuTab(isFreightMenuSelected
);
                                        __tag69.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag69.setTabWidth(tabWidth
);
                                        __tag69.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag69;
                                        __result__tag69 = __tag69.doStartTag();

                                        if (__result__tag69!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag69== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block80Bytes, _wl_block80);
                                            } while (__tag69.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag69.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag69);
                                            return;
                                        }
                                        _activeTag=__tag69.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag69);
                                        __tag69.release();
                                        _bw.write(_wl_block84Bytes, _wl_block84);
                                    } while (__tag68.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                } finally {
                                    if (__result__tag68== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                        out = pageContext.popBody();
                                        _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                    }
                                }
                            }
                            if (__tag68.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag68);
                                return;
                            }
                            _activeTag=__tag68.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag68);
                            __tag68.release();
                            _bw.write(_wl_block88Bytes, _wl_block88);
                             com.fedex.framework.taglib.MenuTabTag __tag70 = null ;
                            int __result__tag70 = 0 ;

                            if (__tag70 == null ){
                                __tag70 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag70);
                            }
                            __tag70.setPageContext(pageContext);
                            __tag70.setParent(__tag58);
                            __tag70.setTitle(shipHistoryTab 
);
                            __tag70.setSelectedMenuTab(isHistoryMenuSelected
);
                            __tag70.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag70.setTabWidth(histTabWidth
);
                            __tag70.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag70;
                            __result__tag70 = __tag70.doStartTag();

                            if (__result__tag70!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag70== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block79Bytes, _wl_block79);
                                } while (__tag70.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag70.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag70);
                                return;
                            }
                            _activeTag=__tag70.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag70);
                            __tag70.release();
                            _bw.write(_wl_block88Bytes, _wl_block88);
                             com.fedex.framework.taglib.MenuTabTag __tag71 = null ;
                            int __result__tag71 = 0 ;

                            if (__tag71 == null ){
                                __tag71 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag71);
                            }
                            __tag71.setPageContext(pageContext);
                            __tag71.setParent(__tag58);
                            __tag71.setTitle(myListsTab 
);
                            __tag71.setSelectedMenuTab(isListsMenuSelected
);
                            __tag71.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("true")).booleanValue());
                            __tag71.setTabWidth(tabWidth
);
                            __tag71.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag71;
                            __result__tag71 = __tag71.doStartTag();

                            if (__result__tag71!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag71== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block80Bytes, _wl_block80);

                                    if (_jsp__tag72(request, response, pageContext, _activeTag, __tag71))
                                     return;
                                    _bw.write(_wl_block89Bytes, _wl_block89);

                                    if (_jsp__tag73(request, response, pageContext, _activeTag, __tag71))
                                     return;
                                    _bw.write(_wl_block91Bytes, _wl_block91);

                                    if (_jsp__tag75(request, response, pageContext, _activeTag, __tag71))
                                     return;
                                    _bw.write(_wl_block92Bytes, _wl_block92);

                                    if (_jsp__tag76(request, response, pageContext, _activeTag, __tag71))
                                     return;
                                    _bw.write(_wl_block94Bytes, _wl_block94);
                                } while (__tag71.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag71.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag71);
                                return;
                            }
                            _activeTag=__tag71.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag71);
                            __tag71.release();
                            _bw.write(_wl_block95Bytes, _wl_block95);
                             org.apache.struts2.views.jsp.IfTag __tag78 = null ;
                            int __result__tag78 = 0 ;

                            if (__tag78 == null ){
                                __tag78 = new  org.apache.struts2.views.jsp.IfTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag78);
                            }
                            __tag78.setPageContext(pageContext);
                            __tag78.setParent(__tag58);
                            __tag78.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{!freightNavigationView.creditCardShipment}", java.lang.String.class,"test"));
                            _activeTag=__tag78;
                            __result__tag78 = __tag78.doStartTag();

                            if (__result__tag78!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                try {
                                    if (__result__tag78== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                        out = pageContext.pushBody();
                                        _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                        __tag78.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                        __tag78.doInitBody();
                                    }
                                    do {
                                        _bw.write(_wl_block82Bytes, _wl_block82);
                                         com.fedex.framework.taglib.MenuTabTag __tag79 = null ;
                                        int __result__tag79 = 0 ;

                                        if (__tag79 == null ){
                                            __tag79 = new  com.fedex.framework.taglib.MenuTabTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag79);
                                        }
                                        __tag79.setPageContext(pageContext);
                                        __tag79.setParent(__tag78);
                                        __tag79.setTitle(reportsTab 
);
                                        __tag79.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag79.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                                        __tag79.setTabWidth(tabWidth
);
                                        __tag79.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                                        _activeTag=__tag79;
                                        __result__tag79 = __tag79.doStartTag();

                                        if (__result__tag79!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            if (__result__tag79== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                            }
                                            do {
                                                _bw.write(_wl_block82Bytes, _wl_block82);
                                            } while (__tag79.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                        }
                                        if (__tag79.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                            _activeTag = null;
                                            _releaseTags(pageContext, __tag79);
                                            return;
                                        }
                                        _activeTag=__tag79.getParent();
                                        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag79);
                                        __tag79.release();
                                        _bw.write(_wl_block96Bytes, _wl_block96);
                                    } while (__tag78.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                } finally {
                                    if (__result__tag78== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                        out = pageContext.popBody();
                                        _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                    }
                                }
                            }
                            if (__tag78.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag78);
                                return;
                            }
                            _activeTag=__tag78.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag78);
                            __tag78.release();
                            _bw.write(_wl_block97Bytes, _wl_block97);
 if (myEcommerceTabShown) { 
                            _bw.write(_wl_block87Bytes, _wl_block87);
                             com.fedex.framework.taglib.MenuTabTag __tag80 = null ;
                            int __result__tag80 = 0 ;

                            if (__tag80 == null ){
                                __tag80 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag80);
                            }
                            __tag80.setPageContext(pageContext);
                            __tag80.setParent(__tag58);
                            __tag80.setTitle(myEcommerceTab
);
                            __tag80.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag80.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag80.setTabWidth(shipTabWidth
);
                            __tag80.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag80;
                            __result__tag80 = __tag80.doStartTag();

                            if (__result__tag80!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag80== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block80Bytes, _wl_block80);
                                } while (__tag80.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag80.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag80);
                                return;
                            }
                            _activeTag=__tag80.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag80);
                            __tag80.release();
                            _bw.write(_wl_block80Bytes, _wl_block80);
 } 
                            _bw.write(_wl_block98Bytes, _wl_block98);
if (userProfileAdapter.isPasskeyAdmin() || isGlobalCustomerAdministrationEnabled) { 
                            _bw.write(_wl_block82Bytes, _wl_block82);
                             com.fedex.framework.taglib.MenuTabTag __tag81 = null ;
                            int __result__tag81 = 0 ;

                            if (__tag81 == null ){
                                __tag81 = new  com.fedex.framework.taglib.MenuTabTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag81);
                            }
                            __tag81.setPageContext(pageContext);
                            __tag81.setParent(__tag58);
                            __tag81.setTitle(adminTab
);
                            __tag81.setSelectedMenuTab(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag81.setHasItems(java.lang.Boolean.valueOf( weblogic.utils.StringUtils.valueOf("false")).booleanValue());
                            __tag81.setTabWidth(tabWidth
);
                            __tag81.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("145")).intValue());
                            _activeTag=__tag81;
                            __result__tag81 = __tag81.doStartTag();

                            if (__result__tag81!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                if (__result__tag81== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuTabTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                                }
                                do {
                                    _bw.write(_wl_block82Bytes, _wl_block82);
                                } while (__tag81.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                            }
                            if (__tag81.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                                _activeTag = null;
                                _releaseTags(pageContext, __tag81);
                                return;
                            }
                            _activeTag=__tag81.getParent();
                            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag81);
                            __tag81.release();
                            _bw.write(_wl_block99Bytes, _wl_block99);
 	}
		 } 
                            _bw.write(_wl_block100Bytes, _wl_block100);
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
                    _bw.write(_wl_block101Bytes, _wl_block101);
                    _bw.write(_wl_block102Bytes, _wl_block102);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block103Bytes, _wl_block103);
                    out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${textCreateBOL}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
                    _bw.write(_wl_block104Bytes, _wl_block104);

                    if (_jsp__tag82(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block108Bytes, _wl_block108);

                    if (_jsp__tag85(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block112Bytes, _wl_block112);

                    if (_jsp__tag89(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block112Bytes, _wl_block112);

                    if (_jsp__tag92(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block116Bytes, _wl_block116);

                    if (_jsp__tag95(request, response, pageContext, _activeTag, __tag0))
                     return;
                    _bw.write(_wl_block117Bytes, _wl_block117);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block3Bytes, _wl_block3);

	
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

                    _bw.write(_wl_block118Bytes, _wl_block118);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedJSFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block32Bytes, _wl_block32);
                    _bw.write(_wl_block119Bytes, _wl_block119);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(minifiedFwkFileSuffix), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block120Bytes, _wl_block120);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block121Bytes, _wl_block121);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block122Bytes, _wl_block122);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block124Bytes, _wl_block124);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block125Bytes, _wl_block125);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block126Bytes, _wl_block126);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block127Bytes, _wl_block127);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block128Bytes, _wl_block128);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block129Bytes, _wl_block129);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block130Bytes, _wl_block130);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block123Bytes, _wl_block123);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(contextPath ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block131Bytes, _wl_block131);
                    out.print(_jsp_expressionInterceptor.intercept( String.valueOf(webCacheTimeStamp), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
                    _bw.write(_wl_block120Bytes, _wl_block120);
                    _bw.write(_wl_block0Bytes, _wl_block0);
                    _bw.write(_wl_block132Bytes, _wl_block132);
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
        __tag1.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlPhoneNumberSize", java.lang.String.class,"name"));
        __tag1.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("14", java.lang.String.class,"value"));
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
        __tag2.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlNotificationElementSize", java.lang.String.class,"name"));
        __tag2.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("23", java.lang.String.class,"value"));
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
        __tag3.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlPhoneNumberSize", java.lang.String.class,"name"));
        __tag3.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("16", java.lang.String.class,"value"));
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
        __tag4.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ltlNotificationElementSize", java.lang.String.class,"name"));
        __tag4.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("21", java.lang.String.class,"value"));
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
        __tag5.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.select\')", java.lang.String.class,"name"));
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
        __tag6.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.address.results\')", java.lang.String.class,"name"));
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
        __tag7.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Commercial\')", java.lang.String.class,"name"));
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
        __tag8.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.Residential\')", java.lang.String.class,"name"));
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
        __tag9.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'addressChecker.text.UseAddressAsEntered\')", java.lang.String.class,"name"));
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
        __tag12.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("textCreateBOL", java.lang.String.class,"name"));
        __tag12.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.noaccount.freight2020\')", java.lang.String.class,"value"));
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
        __tag14.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpText", java.lang.String.class,"name"));
        __tag14.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.help\')", java.lang.String.class,"value"));
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
        __tag15.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpPage", java.lang.String.class,"name"));
        __tag15.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'page.help.freight\')", java.lang.String.class,"value"));
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
        __tag16.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("editText", java.lang.String.class,"name"));
        __tag16.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.edit\')", java.lang.String.class,"value"));
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
        __tag17.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("hideText", java.lang.String.class,"name"));
        __tag17.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.hide\')", java.lang.String.class,"value"));
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
        __tag18.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("closeText", java.lang.String.class,"name"));
        __tag18.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.close\')", java.lang.String.class,"value"));
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
        __tag19.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("enterOrSelectText", java.lang.String.class,"name"));
        __tag19.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.enterOrSelect\')", java.lang.String.class,"value"));
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
        __tag20.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("selectText", java.lang.String.class,"name"));
        __tag20.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.select\')", java.lang.String.class,"value"));
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

    private boolean _jsp__tag25(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.FloatingWindowTag __tag25 = null ;
        int __result__tag25 = 0 ;

        if (__tag25 == null ){
            __tag25 = new  com.fedex.framework.taglib.FloatingWindowTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
        }
        __tag25.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag25, parent);
        __tag25.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("floatingWindow.help", java.lang.String.class,"id"));
        __tag25.setTitle(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Help", java.lang.String.class,"title"));
        __tag25.setCloseText(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("Close", java.lang.String.class,"closeText"));
        _activeTag=__tag25;
        __result__tag25 = __tag25.doStartTag();

        if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.FloatingWindowTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block0Bytes, _wl_block0);
            } while (__tag25.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag25.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag25);
            return true;
        }
        _activeTag=__tag25.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag25);
        __tag25.release();
        return false;
    }

    private boolean _jsp__tag27(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag27 = null ;
        int __result__tag27 = 0 ;

        if (__tag27 == null ){
            __tag27 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
        }
        __tag27.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag27, parent);
        __tag27.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.creditCardShipment", java.lang.String.class,"value"));
        _activeTag=__tag27;
        __result__tag27 = __tag27.doStartTag();

        if (__result__tag27!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag27== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag27.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag27);
            return true;
        }
        _activeTag=__tag27.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag27);
        __tag27.release();
        return false;
    }

    private boolean _jsp__tag28(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag28 = null ;
        int __result__tag28 = 0 ;

        if (__tag28 == null ){
            __tag28 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
        }
        __tag28.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag28, parent);
        __tag28.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.freightTabAllowed", java.lang.String.class,"value"));
        _activeTag=__tag28;
        __result__tag28 = __tag28.doStartTag();

        if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag28.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag28);
            return true;
        }
        _activeTag=__tag28.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag28);
        __tag28.release();
        return false;
    }

    private boolean _jsp__tag30(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag30 = null ;
        int __result__tag30 = 0 ;

        if (__tag30 == null ){
            __tag30 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
        }
        __tag30.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag30, parent);
        __tag30.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.pendingShipmentsReminderEnabled", java.lang.String.class,"value"));
        _activeTag=__tag30;
        __result__tag30 = __tag30.doStartTag();

        if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag30.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag30);
            return true;
        }
        _activeTag=__tag30.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag30);
        __tag30.release();
        return false;
    }

    private boolean _jsp__tag31(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag31 = null ;
        int __result__tag31 = 0 ;

        if (__tag31 == null ){
            __tag31 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
        }
        __tag31.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag31, parent);
        __tag31.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.navigateAwayFromShipmentNotifyFlag", java.lang.String.class,"value"));
        _activeTag=__tag31;
        __result__tag31 = __tag31.doStartTag();

        if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag31.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag31);
            return true;
        }
        _activeTag=__tag31.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag31);
        __tag31.release();
        return false;
    }

    private boolean _jsp__tag33(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.PropertyTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  org.apache.struts2.views.jsp.PropertyTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        __tag33.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("freightNavigationView.groundManifestReminder", java.lang.String.class,"value"));
        _activeTag=__tag33;
        __result__tag33 = __tag33.doStartTag();

        if (__result__tag33!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag33== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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

    private boolean _jsp__tag37(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag37 = null ;
        int __result__tag37 = 0 ;

        if (__tag37 == null ){
            __tag37 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag37);
        }
        __tag37.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag37, parent);
        __tag37.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpTitle", java.lang.String.class,"name"));
        __tag37.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.help\')", java.lang.String.class,"value"));
        _activeTag=__tag37;
        __result__tag37 = __tag37.doStartTag();

        if (__result__tag37!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag37== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts2.views.jsp.SetTag __tag38 = null ;
        int __result__tag38 = 0 ;

        if (__tag38 == null ){
            __tag38 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag38);
        }
        __tag38.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag38, parent);
        __tag38.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpItem1", java.lang.String.class,"name"));
        __tag38.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.quickhelp.help.with.this.page\')", java.lang.String.class,"value"));
        _activeTag=__tag38;
        __result__tag38 = __tag38.doStartTag();

        if (__result__tag38!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag38== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jsp__tag39(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag39 = null ;
        int __result__tag39 = 0 ;

        if (__tag39 == null ){
            __tag39 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag39);
        }
        __tag39.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag39, parent);
        __tag39.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createShipmentMenu", java.lang.String.class,"name"));
        __tag39.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag39;
        __result__tag39 = __tag39.doStartTag();

        if (__result__tag39!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag39== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag39.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag39);
            return true;
        }
        _activeTag=__tag39.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag39);
        __tag39.release();
        return false;
    }

    private boolean _jsp__tag40(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag40 = null ;
        int __result__tag40 = 0 ;

        if (__tag40 == null ){
            __tag40 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag40);
        }
        __tag40.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag40, parent);
        __tag40.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createReturnShipmentMenu", java.lang.String.class,"name"));
        __tag40.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createReturnShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag40;
        __result__tag40 = __tag40.doStartTag();

        if (__result__tag40!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag40== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag40.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag40);
            return true;
        }
        _activeTag=__tag40.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag40);
        __tag40.release();
        return false;
    }

    private boolean _jsp__tag41(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag41 = null ;
        int __result__tag41 = 0 ;

        if (__tag41 == null ){
            __tag41 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag41);
        }
        __tag41.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag41, parent);
        __tag41.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("createImportShipmentMenu", java.lang.String.class,"name"));
        __tag41.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.createImportShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag41;
        __result__tag41 = __tag41.doStartTag();

        if (__result__tag41!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag41== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag41.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag41);
            return true;
        }
        _activeTag=__tag41.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag41);
        __tag41.release();
        return false;
    }

    private boolean _jsp__tag42(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag42 = null ;
        int __result__tag42 = 0 ;

        if (__tag42 == null ){
            __tag42 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag42);
        }
        __tag42.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag42, parent);
        __tag42.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("viewPendingShipmentMenu", java.lang.String.class,"name"));
        __tag42.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.viewPendingShipment\')", java.lang.String.class,"value"));
        _activeTag=__tag42;
        __result__tag42 = __tag42.doStartTag();

        if (__result__tag42!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag42== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag42.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag42);
            return true;
        }
        _activeTag=__tag42.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag42);
        __tag42.release();
        return false;
    }

    private boolean _jsp__tag43(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag43 = null ;
        int __result__tag43 = 0 ;

        if (__tag43 == null ){
            __tag43 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag43);
        }
        __tag43.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag43, parent);
        __tag43.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressBookMenu", java.lang.String.class,"name"));
        __tag43.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.addressBook\')", java.lang.String.class,"value"));
        _activeTag=__tag43;
        __result__tag43 = __tag43.doStartTag();

        if (__result__tag43!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag43== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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

    private boolean _jsp__tag44(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag44 = null ;
        int __result__tag44 = 0 ;

        if (__tag44 == null ){
            __tag44 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag44);
        }
        __tag44.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag44, parent);
        __tag44.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipmentProfilesMenu", java.lang.String.class,"name"));
        __tag44.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.shipmentProfiles\')", java.lang.String.class,"value"));
        _activeTag=__tag44;
        __result__tag44 = __tag44.doStartTag();

        if (__result__tag44!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag44== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag44.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag44);
            return true;
        }
        _activeTag=__tag44.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag44);
        __tag44.release();
        return false;
    }

    private boolean _jsp__tag45(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag45 = null ;
        int __result__tag45 = 0 ;

        if (__tag45 == null ){
            __tag45 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag45);
        }
        __tag45.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag45, parent);
        __tag45.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("dimensionsMenu", java.lang.String.class,"name"));
        __tag45.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.dims\')", java.lang.String.class,"value"));
        _activeTag=__tag45;
        __result__tag45 = __tag45.doStartTag();

        if (__result__tag45!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag45== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag45.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag45);
            return true;
        }
        _activeTag=__tag45.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag45);
        __tag45.release();
        return false;
    }

    private boolean _jsp__tag46(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag46 = null ;
        int __result__tag46 = 0 ;

        if (__tag46 == null ){
            __tag46 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag46);
        }
        __tag46.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag46, parent);
        __tag46.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("helpTechSupportUrl", java.lang.String.class,"name"));
        __tag46.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'online.tech.support\')", java.lang.String.class,"value"));
        _activeTag=__tag46;
        __result__tag46 = __tag46.doStartTag();

        if (__result__tag46!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag46== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag46.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag46);
            return true;
        }
        _activeTag=__tag46.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag46);
        __tag46.release();
        return false;
    }

    private boolean _jsp__tag47(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.SetTag __tag47 = null ;
        int __result__tag47 = 0 ;

        if (__tag47 == null ){
            __tag47 = new  org.apache.struts2.views.jsp.SetTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag47);
        }
        __tag47.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag47, parent);
        __tag47.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("bolLineItemProfilesMenu", java.lang.String.class,"name"));
        __tag47.setValue(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.menu.bolLineItemProfiles\')", java.lang.String.class,"value"));
        _activeTag=__tag47;
        __result__tag47 = __tag47.doStartTag();

        if (__result__tag47!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag47== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag47.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag47);
            return true;
        }
        _activeTag=__tag47.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag47);
        __tag47.release();
        return false;
    }

    private boolean _jsp__tag48(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.FormTag __tag48 = null ;
        int __result__tag48 = 0 ;

        if (__tag48 == null ){
            __tag48 = new  org.apache.struts.taglib.html.FormTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag48);
        }
        __tag48.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag48, parent);
        __tag48.setAction(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("navigationHeaderAction", java.lang.String.class,"action"));
        _activeTag=__tag48;
        __result__tag48 = __tag48.doStartTag();

        if (__result__tag48!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag48== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.html.FormTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block0Bytes, _wl_block0);
            } while (__tag48.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag48.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag48);
            return true;
        }
        _activeTag=__tag48.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag48);
        __tag48.release();
        return false;
    }

    private boolean _jsp__tag51(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag51 = null ;
        int __result__tag51 = 0 ;

        if (__tag51 == null ){
            __tag51 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag51);
        }
        __tag51.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag51, parent);
        __tag51.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'app.name\')", java.lang.String.class,"name"));
        _activeTag=__tag51;
        __result__tag51 = __tag51.doStartTag();

        if (__result__tag51!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag51== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag51.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag51);
            return true;
        }
        _activeTag=__tag51.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag51);
        __tag51.release();
        return false;
    }

    private boolean _jsp__tag52(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag52 = null ;
        int __result__tag52 = 0 ;

        if (__tag52 == null ){
            __tag52 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag52);
        }
        __tag52.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag52, parent);
        __tag52.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.myProfile", java.lang.String.class,"key"));
        _activeTag=__tag52;
        __result__tag52 = __tag52.doStartTag();

        if (__result__tag52!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag52== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag52.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag52);
            return true;
        }
        _activeTag=__tag52.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag52);
        __tag52.release();
        return false;
    }

    private boolean _jsp__tag53(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag53 = null ;
        int __result__tag53 = 0 ;

        if (__tag53 == null ){
            __tag53 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag53);
        }
        __tag53.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag53, parent);
        __tag53.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.fclUser}", java.lang.String.class,"test"));
        _activeTag=__tag53;
        __result__tag53 = __tag53.doStartTag();

        if (__result__tag53!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag53== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag53.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag53.doInitBody();
                }
                do {
                    _bw.write(_wl_block72Bytes, _wl_block72);

                    if (_jsp__tag54(request, response, pageContext, _activeTag, __tag53))
                     return true;
                    _bw.write(_wl_block73Bytes, _wl_block73);
                } while (__tag53.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag53== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag53.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag53);
            return true;
        }
        _activeTag=__tag53.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag53);
        __tag53.release();
        return false;
    }

    private boolean _jsp__tag54(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag54 = null ;
        int __result__tag54 = 0 ;

        if (__tag54 == null ){
            __tag54 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag54);
        }
        __tag54.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag54, parent);
        __tag54.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.logout\')", java.lang.String.class,"name"));
        _activeTag=__tag54;
        __result__tag54 = __tag54.doStartTag();

        if (__result__tag54!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag54== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag54.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag54);
            return true;
        }
        _activeTag=__tag54.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag54);
        __tag54.release();
        return false;
    }

    private boolean _jsp__tag55(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.HelpMenuTag __tag55 = null ;
        int __result__tag55 = 0 ;

        if (__tag55 == null ){
            __tag55 = new  com.fedex.framework.taglib.HelpMenuTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag55);
        }
        __tag55.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag55, parent);
        __tag55.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("help.menu.ship", java.lang.String.class,"id"));
        __tag55.setTitle(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpTitle}",java.lang.String.class,pageContext,_jspx_fnmap));
        __tag55.setHelpWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("72")).intValue());
        __tag55.setItemsMenuWidth(java.lang.Integer.valueOf( weblogic.utils.StringUtils.valueOf("125")).intValue());
        _activeTag=__tag55;
        __result__tag55 = __tag55.doStartTag();

        if (__result__tag55!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag55== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block75Bytes, _wl_block75);

                if (_jsp__tag56(request, response, pageContext, _activeTag, __tag55))
                 return true;
                _bw.write(_wl_block76Bytes, _wl_block76);
            } while (__tag55.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag55.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag55);
            return true;
        }
        _activeTag=__tag55.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag55);
        __tag55.release();
        return false;
    }

    private boolean _jsp__tag56(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.HelpMenuItemTag __tag56 = null ;
        int __result__tag56 = 0 ;

        if (__tag56 == null ){
            __tag56 = new  com.fedex.framework.taglib.HelpMenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag56);
        }
        __tag56.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag56, parent);
        __tag56.sethelpMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${helpItem1}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag56;
        __result__tag56 = __tag56.doStartTag();

        if (__result__tag56!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag56== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.HelpMenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block75Bytes, _wl_block75);
            } while (__tag56.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag56.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag56);
            return true;
        }
        _activeTag=__tag56.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag56);
        __tag56.release();
        return false;
    }

    private boolean _jsp__tag57(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag57 = null ;
        int __result__tag57 = 0 ;

        if (__tag57 == null ){
            __tag57 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag57);
        }
        __tag57.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag57, parent);
        __tag57.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.onreloadofpagelabel", java.lang.String.class,"key"));
        _activeTag=__tag57;
        __result__tag57 = __tag57.doStartTag();

        if (__result__tag57!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag57== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag57.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag57);
            return true;
        }
        _activeTag=__tag57.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag57);
        __tag57.release();
        return false;
    }

    private boolean _jsp__tag61(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag61 = null ;
        int __result__tag61 = 0 ;

        if (__tag61 == null ){
            __tag61 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag61);
        }
        __tag61.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag61, parent);
        __tag61.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.createShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag61;
        __result__tag61 = __tag61.doStartTag();

        if (__result__tag61!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag61== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag61.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag61.doInitBody();
                }
                do {
                    _bw.write(_wl_block82Bytes, _wl_block82);

                    if (_jsp__tag62(request, response, pageContext, _activeTag, __tag61))
                     return true;
                    _bw.write(_wl_block82Bytes, _wl_block82);
                } while (__tag61.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag61== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag61.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag61);
            return true;
        }
        _activeTag=__tag61.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag61);
        __tag61.release();
        return false;
    }

    private boolean _jsp__tag62(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag62 = null ;
        int __result__tag62 = 0 ;

        if (__tag62 == null ){
            __tag62 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag62);
        }
        __tag62.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag62, parent);
        __tag62.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag62;
        __result__tag62 = __tag62.doStartTag();

        if (__result__tag62!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag62== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag62.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
         org.apache.struts2.views.jsp.IfTag __tag63 = null ;
        int __result__tag63 = 0 ;

        if (__tag63 == null ){
            __tag63 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag63);
        }
        __tag63.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag63, parent);
        __tag63.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.returnShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag63;
        __result__tag63 = __tag63.doStartTag();

        if (__result__tag63!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag63== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag63.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag63.doInitBody();
                }
                do {
                    _bw.write(_wl_block82Bytes, _wl_block82);

                    if (_jsp__tag64(request, response, pageContext, _activeTag, __tag63))
                     return true;
                    _bw.write(_wl_block82Bytes, _wl_block82);
                } while (__tag63.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag63== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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

    private boolean _jsp__tag64(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag64 = null ;
        int __result__tag64 = 0 ;

        if (__tag64 == null ){
            __tag64 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag64);
        }
        __tag64.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag64, parent);
        __tag64.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createReturnShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag64;
        __result__tag64 = __tag64.doStartTag();

        if (__result__tag64!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag64== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag64.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag64.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag64);
            return true;
        }
        _activeTag=__tag64.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag64);
        __tag64.release();
        return false;
    }

    private boolean _jsp__tag65(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag65 = null ;
        int __result__tag65 = 0 ;

        if (__tag65 == null ){
            __tag65 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag65);
        }
        __tag65.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag65, parent);
        __tag65.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.importShipmentMenu}", java.lang.String.class,"test"));
        _activeTag=__tag65;
        __result__tag65 = __tag65.doStartTag();

        if (__result__tag65!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag65== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag65.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag65.doInitBody();
                }
                do {
                    _bw.write(_wl_block82Bytes, _wl_block82);

                    if (_jsp__tag66(request, response, pageContext, _activeTag, __tag65))
                     return true;
                    _bw.write(_wl_block82Bytes, _wl_block82);
                } while (__tag65.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag65== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         com.fedex.framework.taglib.MenuItemTag __tag66 = null ;
        int __result__tag66 = 0 ;

        if (__tag66 == null ){
            __tag66 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag66);
        }
        __tag66.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag66, parent);
        __tag66.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${createImportShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag66;
        __result__tag66 = __tag66.doStartTag();

        if (__result__tag66!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag66== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag66.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jsp__tag67(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag67 = null ;
        int __result__tag67 = 0 ;

        if (__tag67 == null ){
            __tag67 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag67);
        }
        __tag67.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag67, parent);
        __tag67.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${viewPendingShipmentMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag67;
        __result__tag67 = __tag67.doStartTag();

        if (__result__tag67!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag67== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag67.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
        }
        if (__tag67.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag67);
            return true;
        }
        _activeTag=__tag67.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag67);
        __tag67.release();
        return false;
    }

    private boolean _jsp__tag72(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.MenuItemTag __tag72 = null ;
        int __result__tag72 = 0 ;

        if (__tag72 == null ){
            __tag72 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag72);
        }
        __tag72.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag72, parent);
        __tag72.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${addressBookMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag72;
        __result__tag72 = __tag72.doStartTag();

        if (__result__tag72!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag72== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag72.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
         org.apache.struts2.views.jsp.IfTag __tag73 = null ;
        int __result__tag73 = 0 ;

        if (__tag73 == null ){
            __tag73 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag73);
        }
        __tag73.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag73, parent);
        __tag73.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{!freightNavigationView.creditCardShipment}", java.lang.String.class,"test"));
        _activeTag=__tag73;
        __result__tag73 = __tag73.doStartTag();

        if (__result__tag73!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag73== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag73.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag73.doInitBody();
                }
                do {
                    _bw.write(_wl_block82Bytes, _wl_block82);

                    if (_jsp__tag74(request, response, pageContext, _activeTag, __tag73))
                     return true;
                    _bw.write(_wl_block90Bytes, _wl_block90);
                } while (__tag73.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag73== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         com.fedex.framework.taglib.MenuItemTag __tag74 = null ;
        int __result__tag74 = 0 ;

        if (__tag74 == null ){
            __tag74 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag74);
        }
        __tag74.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag74, parent);
        __tag74.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${shipmentProfilesMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag74;
        __result__tag74 = __tag74.doStartTag();

        if (__result__tag74!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag74== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag74.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
         com.fedex.framework.taglib.MenuItemTag __tag75 = null ;
        int __result__tag75 = 0 ;

        if (__tag75 == null ){
            __tag75 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag75);
        }
        __tag75.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag75, parent);
        __tag75.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${dimensionsMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag75;
        __result__tag75 = __tag75.doStartTag();

        if (__result__tag75!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag75== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block80Bytes, _wl_block80);
            } while (__tag75.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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
         org.apache.struts2.views.jsp.IfTag __tag76 = null ;
        int __result__tag76 = 0 ;

        if (__tag76 == null ){
            __tag76 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag76);
        }
        __tag76.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag76, parent);
        __tag76.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightNavigationView.freightTabAllowed}", java.lang.String.class,"test"));
        _activeTag=__tag76;
        __result__tag76 = __tag76.doStartTag();

        if (__result__tag76!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag76== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag76.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag76.doInitBody();
                }
                do {
                    _bw.write(_wl_block82Bytes, _wl_block82);

                    if (_jsp__tag77(request, response, pageContext, _activeTag, __tag76))
                     return true;
                    _bw.write(_wl_block93Bytes, _wl_block93);
                } while (__tag76.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag76== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         com.fedex.framework.taglib.MenuItemTag __tag77 = null ;
        int __result__tag77 = 0 ;

        if (__tag77 == null ){
            __tag77 = new  com.fedex.framework.taglib.MenuItemTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag77);
        }
        __tag77.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag77, parent);
        __tag77.setMenuItem(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${bolLineItemProfilesMenu}",java.lang.String.class,pageContext,_jspx_fnmap));
        _activeTag=__tag77;
        __result__tag77 = __tag77.doStartTag();

        if (__result__tag77!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag77== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.MenuItemTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block82Bytes, _wl_block82);
            } while (__tag77.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jsp__tag82(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag82 = null ;
        int __result__tag82 = 0 ;

        if (__tag82 == null ){
            __tag82 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag82);
        }
        __tag82.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag82, parent);
        __tag82.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{contactAdminButtonApplicable}", java.lang.String.class,"test"));
        _activeTag=__tag82;
        __result__tag82 = __tag82.doStartTag();

        if (__result__tag82!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag82== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag82.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag82.doInitBody();
                }
                do {
                    _bw.write(_wl_block105Bytes, _wl_block105);

                    if (_jsp__tag83(request, response, pageContext, _activeTag, __tag82))
                     return true;
                    _bw.write(_wl_block106Bytes, _wl_block106);

                    if (_jsp__tag84(request, response, pageContext, _activeTag, __tag82))
                     return true;
                    _bw.write(_wl_block107Bytes, _wl_block107);
                } while (__tag82.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag82== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         org.apache.struts.taglib.bean.MessageTag __tag83 = null ;
        int __result__tag83 = 0 ;

        if (__tag83 == null ){
            __tag83 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag83);
        }
        __tag83.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag83, parent);
        __tag83.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.passkey.contactAdmin", java.lang.String.class,"key"));
        _activeTag=__tag83;
        __result__tag83 = __tag83.doStartTag();

        if (__result__tag83!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag83== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
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

    private boolean _jsp__tag84(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag84 = null ;
        int __result__tag84 = 0 ;

        if (__tag84 == null ){
            __tag84 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag84);
        }
        __tag84.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag84, parent);
        __tag84.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("ada.administrator", java.lang.String.class,"key"));
        _activeTag=__tag84;
        __result__tag84 = __tag84.doStartTag();

        if (__result__tag84!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag84== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag84.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag84);
            return true;
        }
        _activeTag=__tag84.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag84);
        __tag84.release();
        return false;
    }

    private boolean _jsp__tag85(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.IfTag __tag85 = null ;
        int __result__tag85 = 0 ;

        if (__tag85 == null ){
            __tag85 = new  org.apache.struts2.views.jsp.IfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag85);
        }
        __tag85.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag85, parent);
        __tag85.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightMessage == \'regUserNoAccount\'}", java.lang.String.class,"test"));
        _activeTag=__tag85;
        __result__tag85 = __tag85.doStartTag();

        if (__result__tag85!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag85== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag85.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag85.doInitBody();
                }
                do {
                    _bw.write(_wl_block109Bytes, _wl_block109);

                    if (_jsp__tag86(request, response, pageContext, _activeTag, __tag85))
                     return true;

                    if (_jsp__tag87(request, response, pageContext, _activeTag, __tag85))
                     return true;
                    _bw.write(_wl_block110Bytes, _wl_block110);

                    if (_jsp__tag88(request, response, pageContext, _activeTag, __tag85))
                     return true;
                    _bw.write(_wl_block111Bytes, _wl_block111);
                } while (__tag85.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag85== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag85.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag85);
            return true;
        }
        _activeTag=__tag85.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag85);
        __tag85.release();
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
        __tag86.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
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
         org.apache.struts2.views.jsp.TextTag __tag87 = null ;
        int __result__tag87 = 0 ;

        if (__tag87 == null ){
            __tag87 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag87);
        }
        __tag87.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag87, parent);
        __tag87.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.regular.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag87;
        __result__tag87 = __tag87.doStartTag();

        if (__result__tag87!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag87== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts2.views.jsp.TextTag __tag88 = null ;
        int __result__tag88 = 0 ;

        if (__tag88 == null ){
            __tag88 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag88);
        }
        __tag88.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag88, parent);
        __tag88.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'accountModule.addAccountLink\')", java.lang.String.class,"name"));
        _activeTag=__tag88;
        __result__tag88 = __tag88.doStartTag();

        if (__result__tag88!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag88== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts2.views.jsp.ElseIfTag __tag89 = null ;
        int __result__tag89 = 0 ;

        if (__tag89 == null ){
            __tag89 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag89);
        }
        __tag89.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag89, parent);
        __tag89.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightMessage == \'ipassUserNoAccount\' }", java.lang.String.class,"test"));
        _activeTag=__tag89;
        __result__tag89 = __tag89.doStartTag();

        if (__result__tag89!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag89== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag89.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag89.doInitBody();
                }
                do {
                    _bw.write(_wl_block113Bytes, _wl_block113);

                    if (_jsp__tag90(request, response, pageContext, _activeTag, __tag89))
                     return true;
                    _bw.write(_wl_block114Bytes, _wl_block114);

                    if (_jsp__tag91(request, response, pageContext, _activeTag, __tag89))
                     return true;
                    _bw.write(_wl_block115Bytes, _wl_block115);
                } while (__tag89.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag89== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         org.apache.struts2.views.jsp.TextTag __tag90 = null ;
        int __result__tag90 = 0 ;

        if (__tag90 == null ){
            __tag90 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag90);
        }
        __tag90.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag90, parent);
        __tag90.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag90;
        __result__tag90 = __tag90.doStartTag();

        if (__result__tag90!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag90== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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
         org.apache.struts2.views.jsp.TextTag __tag91 = null ;
        int __result__tag91 = 0 ;

        if (__tag91 == null ){
            __tag91 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag91);
        }
        __tag91.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag91, parent);
        __tag91.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.ipass.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag91;
        __result__tag91 = __tag91.doStartTag();

        if (__result__tag91!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag91== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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
         org.apache.struts2.views.jsp.ElseIfTag __tag92 = null ;
        int __result__tag92 = 0 ;

        if (__tag92 == null ){
            __tag92 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag92);
        }
        __tag92.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag92, parent);
        __tag92.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightMessage == \'adminNoAccount\'}", java.lang.String.class,"test"));
        _activeTag=__tag92;
        __result__tag92 = __tag92.doStartTag();

        if (__result__tag92!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag92== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag92.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag92.doInitBody();
                }
                do {
                    _bw.write(_wl_block113Bytes, _wl_block113);

                    if (_jsp__tag93(request, response, pageContext, _activeTag, __tag92))
                     return true;
                    _bw.write(_wl_block114Bytes, _wl_block114);

                    if (_jsp__tag94(request, response, pageContext, _activeTag, __tag92))
                     return true;
                    _bw.write(_wl_block115Bytes, _wl_block115);
                } while (__tag92.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag92== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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

    private boolean _jsp__tag93(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag93 = null ;
        int __result__tag93 = 0 ;

        if (__tag93 == null ){
            __tag93 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag93);
        }
        __tag93.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag93, parent);
        __tag93.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag93;
        __result__tag93 = __tag93.doStartTag();

        if (__result__tag93!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag93== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag93.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag93);
            return true;
        }
        _activeTag=__tag93.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag93);
        __tag93.release();
        return false;
    }

    private boolean _jsp__tag94(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag94 = null ;
        int __result__tag94 = 0 ;

        if (__tag94 == null ){
            __tag94 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag94);
        }
        __tag94.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag94, parent);
        __tag94.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.admin.noaccount\')", java.lang.String.class,"name"));
        _activeTag=__tag94;
        __result__tag94 = __tag94.doStartTag();

        if (__result__tag94!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag94== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
        }
        if (__tag94.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag94);
            return true;
        }
        _activeTag=__tag94.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag94);
        __tag94.release();
        return false;
    }

    private boolean _jsp__tag95(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.ElseIfTag __tag95 = null ;
        int __result__tag95 = 0 ;

        if (__tag95 == null ){
            __tag95 = new  org.apache.struts2.views.jsp.ElseIfTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag95);
        }
        __tag95.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag95, parent);
        __tag95.setTest(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("%{freightMessage == \'noServicePrivilege\'}", java.lang.String.class,"test"));
        _activeTag=__tag95;
        __result__tag95 = __tag95.doStartTag();

        if (__result__tag95!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag95== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag95.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag95.doInitBody();
                }
                do {
                    _bw.write(_wl_block113Bytes, _wl_block113);

                    if (_jsp__tag96(request, response, pageContext, _activeTag, __tag95))
                     return true;
                    _bw.write(_wl_block114Bytes, _wl_block114);

                    if (_jsp__tag97(request, response, pageContext, _activeTag, __tag95))
                     return true;
                    _bw.write(_wl_block115Bytes, _wl_block115);
                } while (__tag95.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag95== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
            }
        }
        if (__tag95.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag95);
            return true;
        }
        _activeTag=__tag95.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag95);
        __tag95.release();
        return false;
    }

    private boolean _jsp__tag96(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts2.views.jsp.TextTag __tag96 = null ;
        int __result__tag96 = 0 ;

        if (__tag96 == null ){
            __tag96 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag96);
        }
        __tag96.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag96, parent);
        __tag96.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.alertWithColon\')", java.lang.String.class,"name"));
        _activeTag=__tag96;
        __result__tag96 = __tag96.doStartTag();

        if (__result__tag96!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag96== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
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
         org.apache.struts2.views.jsp.TextTag __tag97 = null ;
        int __result__tag97 = 0 ;

        if (__tag97 == null ){
            __tag97 = new  org.apache.struts2.views.jsp.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag97);
        }
        __tag97.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag97, parent);
        __tag97.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("getText(\'text.ipass.noServicePrivileges\')", java.lang.String.class,"name"));
        _activeTag=__tag97;
        __result__tag97 = __tag97.doStartTag();

        if (__result__tag97!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag97== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
            }
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
}
