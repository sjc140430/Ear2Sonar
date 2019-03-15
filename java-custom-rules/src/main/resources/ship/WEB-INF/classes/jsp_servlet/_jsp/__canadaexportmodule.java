package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.vo.LabelValueVO;
import org.apache.struts.Globals;
import org.apache.struts.util.MessageResources;
import com.fedex.fsm.ship.web.util.WebUtils;
import com.fedex.fsm.ship.web.outbound.*;
import com.fedex.fsm.ship.web.modules.completeShip.*;
import com.fedex.fsm.ship.web.modules.specialServices.*;
import com.fedex.fsm.ship.web.modules.psd.*;
import com.fedex.fsm.ship.web.util.*;
import com.fedex.fsm.ship.web.util.ajax.JSONSimulator;
import com.fedex.fsm.ship.web.modules.ContactData;
import com.fedex.fsm.ship.web.decouple.DecoupleState;
import com.fedex.fsm.ship.common.vo.user.prefs.pkg.PackagePreferencesVO;
import com.fedex.fsm.ship.common.vo.user.privileges.pkg.SpecialServicesPrivilegesVO;
import com.fedex.fsm.ship.common.vo.user.PackageReferencePreferencesVO;
import com.fedex.fsm.ship.common.vo.CustomsDocumentType;
import java.util.*;
import com.fedex.fsm.ship.web.entryExit.*;
import com.fedex.fsm.ship.web.returns.ReturnsFlowContext;
import com.fedex.fsm.ship.web.component.country.CountryUtils;
import com.fedex.fsm.ship.web.displayRules.DisplayRules;
import com.fedex.fsm.ship.web.component.country.Country;
import com.fedex.fsm.ship.web.modules.pickupDropoff.PickupDropoffUtil;
import com.fedex.fsm.ship.common.vo.user.AccountVO;
import com.fedex.fsm.ship.web.modules.billing.BillingAccountInfo;
import com.fedex.framework.encode.commonslang.HTMLEncoder;
import com.fedex.fsm.ship.common.vo.NotificationType;

public final class __canadaexportmodule extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/CanadaExportModule.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
        if (sci.isResourceStale("/jsp/ModuleCommonInclude.jsp", 1550053016000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 ="\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 =" \r\n";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 =" \r\n\r\n";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 =" \r\n\r\n\r\n";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n<script type=\"text/javascript\" charset=\"utf-8\">\r\n\r\n\t\r\n\tvar _isSPEnabled = ";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 =";\r\n\tvar _isReturnsSPEnabled = ";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 =";\r\n\tvar isRegionalServiceTypes = ";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 =";\r\n\tvar isRegionalPackageTypes = ";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 =";\r\n\tvar _isDomestic = ";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

    private static java.lang.String  _wl_block10 =";\r\n\tvar _isDomesticAllowed = ";
    private final static byte[]  _wl_block10Bytes = _getBytes( _wl_block10 );

    private static java.lang.String  _wl_block11 =";\r\n\tvar _isDomesticReturnsSupported = ";
    private final static byte[]  _wl_block11Bytes = _getBytes( _wl_block11 );

    private static java.lang.String  _wl_block12 =";\r\n\tvar _isDomesticShippingSupported = ";
    private final static byte[]  _wl_block12Bytes = _getBytes( _wl_block12 );

    private static java.lang.String  _wl_block13 =";\t\r\n\tvar _isSameCategoryPackageRefreshNeeded = ";
    private final static byte[]  _wl_block13Bytes = _getBytes( _wl_block13 );

    private static java.lang.String  _wl_block14 =";\t\r\n\tvar _isShowAlcoholService = ";
    private final static byte[]  _wl_block14Bytes = _getBytes( _wl_block14 );

    private static java.lang.String  _wl_block15 =";\r\n\tvar _localeURL = \"";
    private final static byte[]  _wl_block15Bytes = _getBytes( _wl_block15 );

    private static java.lang.String  _wl_block16 ="\";\r\n\tvar _isPackageContentsAvailable=";
    private final static byte[]  _wl_block16Bytes = _getBytes( _wl_block16 );

    private static java.lang.String  _wl_block17 =";\r\n\tvar _isReturnOnly = ";
    private final static byte[]  _wl_block17Bytes = _getBytes( _wl_block17 );

    private static java.lang.String  _wl_block18 =";\r\n\tvar _isFromEMEA = \"";
    private final static byte[]  _wl_block18Bytes = _getBytes( _wl_block18 );

    private static java.lang.String  _wl_block19 ="\";\r\n\tvar _originCountryCd = \"";
    private final static byte[]  _wl_block19Bytes = _getBytes( _wl_block19 );

    private static java.lang.String  _wl_block20 ="\";\r\n\tvar fromCountryCode = \"";
    private final static byte[]  _wl_block20Bytes = _getBytes( _wl_block20 );

    private static java.lang.String  _wl_block21 ="\";\r\n\tvar debugStatements = \"\"; ";
    private final static byte[]  _wl_block21Bytes = _getBytes( _wl_block21 );

    private static java.lang.String  _wl_block22 ="\t\r\n//\tvar i18n_select = \"";
    private final static byte[]  _wl_block22Bytes = _getBytes( _wl_block22 );

    private static java.lang.String  _wl_block23 ="\";\r\n//\tvar i18n_addressResults = \"";
    private final static byte[]  _wl_block23Bytes = _getBytes( _wl_block23 );

    private static java.lang.String  _wl_block24 ="\";\r\n//\tvar i18n_commercial = \"";
    private final static byte[]  _wl_block24Bytes = _getBytes( _wl_block24 );

    private static java.lang.String  _wl_block25 ="\";\r\n//\tvar i18n_residential = \"";
    private final static byte[]  _wl_block25Bytes = _getBytes( _wl_block25 );

    private static java.lang.String  _wl_block26 ="\";\r\n//\tvar i18n_useAddressEntered = \"";
    private final static byte[]  _wl_block26Bytes = _getBytes( _wl_block26 );

    private static java.lang.String  _wl_block27 ="\";\r\n//\tvar enteredAddressRolloverHelp = \"";
    private final static byte[]  _wl_block27Bytes = _getBytes( _wl_block27 );

    private static java.lang.String  _wl_block28 ="\";\r\n\tvar isReturnEnabled = ";
    private final static byte[]  _wl_block28Bytes = _getBytes( _wl_block28 );

    private static java.lang.String  _wl_block29 =";\r\n\tvar isSaveAsDefaultDiaChbxChecked = ";
    private final static byte[]  _wl_block29Bytes = _getBytes( _wl_block29 );

    private static java.lang.String  _wl_block30 =";\r\n\tvar isSaveAsDefaultCodChbxChecked = ";
    private final static byte[]  _wl_block30Bytes = _getBytes( _wl_block30 );

    private static java.lang.String  _wl_block31 =";\r\n\r\n\tvar i18n_select = \"";
    private final static byte[]  _wl_block31Bytes = _getBytes( _wl_block31 );

    private static java.lang.String  _wl_block32 ="\";\r\n\tvar i18n_addressResults=\"";
    private final static byte[]  _wl_block32Bytes = _getBytes( _wl_block32 );

    private static java.lang.String  _wl_block33 ="\";\r\n\tvar i18n_useAddressEntered =\"";
    private final static byte[]  _wl_block33Bytes = _getBytes( _wl_block33 );

    private static java.lang.String  _wl_block34 ="\";\r\n\tvar i18n_commercial =\"";
    private final static byte[]  _wl_block34Bytes = _getBytes( _wl_block34 );

    private static java.lang.String  _wl_block35 ="\";\r\n\tvar i18n_residential =\"";
    private final static byte[]  _wl_block35Bytes = _getBytes( _wl_block35 );

    private static java.lang.String  _wl_block36 ="\";\r\n\tvar enteredAddressRolloverHelp =\"";
    private final static byte[]  _wl_block36Bytes = _getBytes( _wl_block36 );

    private static java.lang.String  _wl_block37 ="\";\r\n\r\n\r\n\t//DTD3300: GDE3 Code Added\r\n\tvar globalDisplayRules={};\r\n\tglobalDisplayRules.isCustomsModuleAvailable=";
    private final static byte[]  _wl_block37Bytes = _getBytes( _wl_block37 );

    private static java.lang.String  _wl_block38 =";\r\n\tglobalDisplayRules.isPackageContentsAvailable=";
    private final static byte[]  _wl_block38Bytes = _getBytes( _wl_block38 );

    private static java.lang.String  _wl_block39 =";\r\n\r\n\tglobalDisplayRules.isUSDomestic = ";
    private final static byte[]  _wl_block39Bytes = _getBytes( _wl_block39 );

    private static java.lang.String  _wl_block40 =";\r\n\tglobalDisplayRules.isCADomestic = ";
    private final static byte[]  _wl_block40Bytes = _getBytes( _wl_block40 );

    private static java.lang.String  _wl_block41 =";\r\n\tglobalDisplayRules.isIndiaDomestic = ";
    private final static byte[]  _wl_block41Bytes = _getBytes( _wl_block41 );

    private static java.lang.String  _wl_block42 =";\r\n\tglobalDisplayRules.isUAEDomestic = ";
    private final static byte[]  _wl_block42Bytes = _getBytes( _wl_block42 );

    private static java.lang.String  _wl_block43 =";\r\n    globalDisplayRules.isDomestic = ";
    private final static byte[]  _wl_block43Bytes = _getBytes( _wl_block43 );

    private static java.lang.String  _wl_block44 =";\r\n    globalDisplayRules.isUKDomestic = ";
    private final static byte[]  _wl_block44Bytes = _getBytes( _wl_block44 );

    private static java.lang.String  _wl_block45 =";\r\n    globalDisplayRules.isDomesticAllowed = ";
    private final static byte[]  _wl_block45Bytes = _getBytes( _wl_block45 );

    private static java.lang.String  _wl_block46 =";\r\n\r\n//\tvar txtGroundSpecificSS = \"";
    private final static byte[]  _wl_block46Bytes = _getBytes( _wl_block46 );

    private static java.lang.String  _wl_block47 ="\";\r\n//\tvar txtGroundSpecificSSRollOverHelp = \"";
    private final static byte[]  _wl_block47Bytes = _getBytes( _wl_block47 );

    private static java.lang.String  _wl_block48 ="\";\r\n//\tvar txtHomeDeliverySpecificSS = \"";
    private final static byte[]  _wl_block48Bytes = _getBytes( _wl_block48 );

    private static java.lang.String  _wl_block49 ="\";\r\n//\tvar txtHomeDeliverySpecificSSRolloverHelp = \"";
    private final static byte[]  _wl_block49Bytes = _getBytes( _wl_block49 );

    private static java.lang.String  _wl_block50 ="\";\r\n\tvar txtGroundSpecificSS =\"";
    private final static byte[]  _wl_block50Bytes = _getBytes( _wl_block50 );

    private static java.lang.String  _wl_block51 ="\";\r\n\tvar txtGroundSpecificSSRollOverHelp =\"";
    private final static byte[]  _wl_block51Bytes = _getBytes( _wl_block51 );

    private static java.lang.String  _wl_block52 ="\";\r\n\tvar txtHomeDeliverySpecificSS =\"";
    private final static byte[]  _wl_block52Bytes = _getBytes( _wl_block52 );

    private static java.lang.String  _wl_block53 ="\";\r\n\tvar txtHomeDeliverySpecificSSRolloverHelp =\"";
    private final static byte[]  _wl_block53Bytes = _getBytes( _wl_block53 );

    private static java.lang.String  _wl_block54 ="\";\r\n\r\n\tvar isPostalCheckEnabled = ";
    private final static byte[]  _wl_block54Bytes = _getBytes( _wl_block54 );

    private static java.lang.String  _wl_block55 =" ;\r\n\tvar isAddressCheckEnabled = ";
    private final static byte[]  _wl_block55Bytes = _getBytes( _wl_block55 );

    private static java.lang.String  _wl_block56 =" ;\r\n\tvar isMandatoryAddressCheckEnabled = ";
    private final static byte[]  _wl_block56Bytes = _getBytes( _wl_block56 );

    private static java.lang.String  _wl_block57 =" ;\r\n\t\r\n\t// ITG # 163023 - File:inetAppConfig.properties, Key:LACANSplitEnabled\r\n\t// As part of cleanup isLACANSplitEnabled() is no longer exists in DecoupleState.java\r\n\tvar meterNumber = \"";
    private final static byte[]  _wl_block57Bytes = _getBytes( _wl_block57 );

    private static java.lang.String  _wl_block58 ="\";\r\n\tvar gticSuggestedDocumentsURL = \"";
    private final static byte[]  _wl_block58Bytes = _getBytes( _wl_block58 );

    private static java.lang.String  _wl_block59 ="\";\r\n\tvar isIRDEmailLableShipmentAllowed = \"";
    private final static byte[]  _wl_block59Bytes = _getBytes( _wl_block59 );

    private static java.lang.String  _wl_block60 ="\";\t\r\n\r\n\tvar isImportShipmentAllowed = \"";
    private final static byte[]  _wl_block60Bytes = _getBytes( _wl_block60 );

    private static java.lang.String  _wl_block61 ="\";\r\n\t\r\n\t//ITG 149885, LAC Columbia\r\n\tvar isAvailableCityListRefreshEnabled = ";
    private final static byte[]  _wl_block61Bytes = _getBytes( _wl_block61 );

    private static java.lang.String  _wl_block62 =";\r\n\tvar _isGDE4UKEnabled = ";
    private final static byte[]  _wl_block62Bytes = _getBytes( _wl_block62 );

    private static java.lang.String  _wl_block63 =";\r\n\tvar _isSMARRTZEnabled = ";
    private final static byte[]  _wl_block63Bytes = _getBytes( _wl_block63 );

    private static java.lang.String  _wl_block64 =";\r\n\tvar _isSMARRTZAlertEnabled = ";
    private final static byte[]  _wl_block64Bytes = _getBytes( _wl_block64 );

    private static java.lang.String  _wl_block65 =";\r\n\tvar _isNIAGARAEnabled = ";
    private final static byte[]  _wl_block65Bytes = _getBytes( _wl_block65 );

    private static java.lang.String  _wl_block66 =";\r\n\tvar isColumbiaPostalCodeMockEnabled = ";
    private final static byte[]  _wl_block66Bytes = _getBytes( _wl_block66 );

    private static java.lang.String  _wl_block67 =";\r\n\tvar _isIrdApacEnabled = ";
    private final static byte[]  _wl_block67Bytes = _getBytes( _wl_block67 );

    private static java.lang.String  _wl_block68 =";\r\n\t// Jan 2016 CL - ITG-169590 and ID-1485584\r\n    var _isEDNForSmartPostEnabled=";
    private final static byte[]  _wl_block68Bytes = _getBytes( _wl_block68 );

    private static java.lang.String  _wl_block69 =";\r\n\t// Jan 2015 CL, ITG 155652 and ID 1340471\r\n\t//  To validate eventId when adding/updating the commodity\r\n\tvar commodityEventId = \"\"; \r\n\t//  To save existing commodities data for temporary usage\r\n\tvar productsAsStringTemp = \"\";\r\n\t//  To get number of product prohibits\r\n\tvar numberOfProductProhibits = 0;\t\r\n\t\r\n\t//Fix for defect#319288, to validate prohibits\r\n\tvar isProhibit = false;\r\n\tvar _isLACSouthMiamiEnabled=";
    private final static byte[]  _wl_block69Bytes = _getBytes( _wl_block69 );

    private static java.lang.String  _wl_block70 =";\r\n\t//Jul 2016 CL - ITG 159201 ETD Enhancements - ID 1485809\r\n\tvar _isETDDGHazmatEnabled = ";
    private final static byte[]  _wl_block70Bytes = _getBytes( _wl_block70 );

    private static java.lang.String  _wl_block71 =";\r\n\tvar _isETDEnhancementEnabled = ";
    private final static byte[]  _wl_block71Bytes = _getBytes( _wl_block71 );

    private static java.lang.String  _wl_block72 =";\r\n\t// Jul 2018 CL - ITG-180129 OnSite2.3 - ID:112428\r\n\tvar _isOnsitePackageHandlingRestrictionEnabled = ";
    private final static byte[]  _wl_block72Bytes = _getBytes( _wl_block72 );

    private static java.lang.String  _wl_block73 =";\r\n\t//Jan 2017 CL - 177016 Sec II Lithium Battery Identification 1529522\r\n\tvar _isExpLitBatCellsAllowed = ";
    private final static byte[]  _wl_block73Bytes = _getBytes( _wl_block73 );

    private static java.lang.String  _wl_block74 =";\r\n\t\r\n\t// JUL17CL - ITG 176640 - Niagara 2.0 Phase 2\r\n\tvar _isBrokerSelect = ";
    private final static byte[]  _wl_block74Bytes = _getBytes( _wl_block74 );

    private static java.lang.String  _wl_block75 =";\r\n\tvar _isIGCAccountEnabled= ";
    private final static byte[]  _wl_block75Bytes = _getBytes( _wl_block75 );

    private static java.lang.String  _wl_block76 =";\r\n\tvar _isExcludeFromConsolidationChecked= ";
    private final static byte[]  _wl_block76Bytes = _getBytes( _wl_block76 );

    private static java.lang.String  _wl_block77 =";\r\n\tvar _isNIAGARAPhase2Enabled = ";
    private final static byte[]  _wl_block77Bytes = _getBytes( _wl_block77 );

    private static java.lang.String  _wl_block78 =";\r\n\tvar _isNonETDLabelAndIntraEUEnabled = ";
    private final static byte[]  _wl_block78Bytes = _getBytes( _wl_block78 );

    private static java.lang.String  _wl_block79 =";\r\n\tvar psdDispObj = ";
    private final static byte[]  _wl_block79Bytes = _getBytes( _wl_block79 );

    private static java.lang.String  _wl_block80 =";\r\n\t// Jan18CL - ITG 163016 Freight 2020\r\n\tvar _isFreight2020Enabled = ";
    private final static byte[]  _wl_block80Bytes = _getBytes( _wl_block80 );

    private static java.lang.String  _wl_block81 =";\r\n\tvar _freight2020MaxTotalHandlingUnits= ";
    private final static byte[]  _wl_block81Bytes = _getBytes( _wl_block81 );

    private static java.lang.String  _wl_block82 =";\r\n\r\n\t// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book\r\n\tvar _isAddressBookRestricted = ";
    private final static byte[]  _wl_block82Bytes = _getBytes( _wl_block82 );

    private static java.lang.String  _wl_block83 =";\r\n\tconsole.log(_isAddressBookRestricted);\r\n\tvar clearAllFields = ";
    private final static byte[]  _wl_block83Bytes = _getBytes( _wl_block83 );

    private static java.lang.String  _wl_block84 =";\r\n\tvar _cabOutboundFlag = ";
    private final static byte[]  _wl_block84Bytes = _getBytes( _wl_block84 );

    private static java.lang.String  _wl_block85 =";\r\n\tvar _cabReturnFlag = ";
    private final static byte[]  _wl_block85Bytes = _getBytes( _wl_block85 );

    private static java.lang.String  _wl_block86 =";\r\n\tvar _isReturnImport= ";
    private final static byte[]  _wl_block86Bytes = _getBytes( _wl_block86 );

    private static java.lang.String  _wl_block87 =";\r\n\t\r\n\t// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change\r\n\tvar _isBillToRestrictedFlag = ";
    private final static byte[]  _wl_block87Bytes = _getBytes( _wl_block87 );

    private static java.lang.String  _wl_block88 =";\r\n\tconsole.log(_isBillToRestrictedFlag);\r\n\tvar _isDutyBillToRestrictedFlag = ";
    private final static byte[]  _wl_block88Bytes = _getBytes( _wl_block88 );

    private static java.lang.String  _wl_block89 =";\r\n\tconsole.log(_isDutyBillToRestrictedFlag);\r\n\tvar _billingRestrictedFlag = ";
    private final static byte[]  _wl_block89Bytes = _getBytes( _wl_block89 );

    private static java.lang.String  _wl_block90 =";\r\n\tvar _isSafariOnMAC = ";
    private final static byte[]  _wl_block90Bytes = _getBytes( _wl_block90 );

    private static java.lang.String  _wl_block91 =";\r\n\t\r\n\t//\r\n</script>\r\n\r\n\r\n\r\n";
    private final static byte[]  _wl_block91Bytes = _getBytes( _wl_block91 );

    private static java.lang.String  _wl_block92 ="\r\n\r\n<script language=\"JavaScript\">\r\nvar _CAExportText = \'";
    private final static byte[]  _wl_block92Bytes = _getBytes( _wl_block92 );

    private static java.lang.String  _wl_block93 ="\';\r\nvar _b13aOption = \"";
    private final static byte[]  _wl_block93Bytes = _getBytes( _wl_block93 );

    private static java.lang.String  _wl_block94 ="\";\r\nvar _b13aExemptionNumber = \"";
    private final static byte[]  _wl_block94Bytes = _getBytes( _wl_block94 );

    private static java.lang.String  _wl_block95 ="\";\r\nif(_b13aExemptionNumber == null){\r\n\t_b13aExemptionNumber = \'\';\r\n} \r\n//Added on 02-27-2012 by 838334 to display save for future shipments checkbox\r\nvar _defaultB13AOption =\'";
    private final static byte[]  _wl_block95Bytes = _getBytes( _wl_block95 );

    private static java.lang.String  _wl_block96 ="\';\r\n\r\nvar isGroupShip =\"";
    private final static byte[]  _wl_block96Bytes = _getBytes( _wl_block96 );

    private static java.lang.String  _wl_block97 ="\";\r\nvar isReturnShipment = ";
    private final static byte[]  _wl_block97Bytes = _getBytes( _wl_block97 );

    private static java.lang.String  _wl_block98 =";\r\nvar returnOptionsDataObj = ";
    private final static byte[]  _wl_block98Bytes = _getBytes( _wl_block98 );

    private static java.lang.String  _wl_block99 =";\r\nvar b13AMoreInfoLink = helpPageUrl + \"";
    private final static byte[]  _wl_block99Bytes = _getBytes( _wl_block99 );

    private static java.lang.String  _wl_block100 ="\";\r\n\r\n</script>\r\n<div id=\"caExport.main.module\" style=\"display:none\">\r\n";
    private final static byte[]  _wl_block100Bytes = _getBytes( _wl_block100 );

    private static java.lang.String  _wl_block101 ="\r\n\r\n\t";
    private final static byte[]  _wl_block101Bytes = _getBytes( _wl_block101 );

    private static java.lang.String  _wl_block102 ="\r\n\t\t";
    private final static byte[]  _wl_block102Bytes = _getBytes( _wl_block102 );

    private static java.lang.String  _wl_block103 ="\r\n\t";
    private final static byte[]  _wl_block103Bytes = _getBytes( _wl_block103 );

    private static java.lang.String  _wl_block104 ="\r\n\t\r\n\t\t";
    private final static byte[]  _wl_block104Bytes = _getBytes( _wl_block104 );

    private static java.lang.String  _wl_block105 ="\r\n\t\t<div id=\"caExport.exportPermit.section\">\r\n\t\t\t<div id=\"caExport.exportPermit.label\" class=\"fsmContentLeft\">\r\n\t\t\t\t<label for=\"caExportData.exportPermitNumber\">";
    private final static byte[]  _wl_block105Bytes = _getBytes( _wl_block105 );

    private static java.lang.String  _wl_block106 ="</label>\r\n\t\t\t</div>\r\n\t\t\t<div id=\"caExport.exportPermit.field\" class=\"fsmContentRight\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block106Bytes = _getBytes( _wl_block106 );

    private static java.lang.String  _wl_block107 ="\r\n\t\t\t</div>\r\n\t\t\t<div class=\"fsmContentLeft\">\r\n\t\t\t\t&nbsp;\r\n\t\t\t</div>\r\n\t\t\t<div class=\"fsmContentRight\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block107Bytes = _getBytes( _wl_block107 );

    private static java.lang.String  _wl_block108 ="\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t\r\n\t\t";
    private final static byte[]  _wl_block108Bytes = _getBytes( _wl_block108 );

    private static java.lang.String  _wl_block109 ="\t\r\n\t\t<div class=\"fsmContentFull\">\r\n\t\t\t<div class=\"alrtLeft\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block109Bytes = _getBytes( _wl_block109 );

    private static java.lang.String  _wl_block110 ="&nbsp;\r\n\t\t\t</div>\r\n\t\t\t<div class=\"alertText\">\r\n\t\r\n\t\t\t\t";
    private final static byte[]  _wl_block110Bytes = _getBytes( _wl_block110 );

    private static java.lang.String  _wl_block111 ="\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block111Bytes = _getBytes( _wl_block111 );

    private static java.lang.String  _wl_block112 ="\r\n\t\t\t\t";
    private final static byte[]  _wl_block112Bytes = _getBytes( _wl_block112 );

    private static java.lang.String  _wl_block113 ="\r\n\t\t\t</div>\r\n\t\t\t<div id=\"caExport.exportInformation.section\" class=\"fsmContentFull\">\r\n\t\t\t\t<div class=\"alrtLeft\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block113Bytes = _getBytes( _wl_block113 );

    private static java.lang.String  _wl_block114 ="&nbsp;\r\n\t\t\t\t</div>\r\n\t\t\t\t<div class=\"alertText\">\t\r\n\t\t\t\t\t";
    private final static byte[]  _wl_block114Bytes = _getBytes( _wl_block114 );

    private static java.lang.String  _wl_block115 ="\r\n\t\t\t\t</div>\r\n\t\t\t</div>\r\n\t\t\t<br>\r\n\t\t\t";
    private final static byte[]  _wl_block115Bytes = _getBytes( _wl_block115 );

    private static java.lang.String  _wl_block116 ="\r\n\t\t</div>\r\n\t\t<div class=\"fsmContentFull\">\r\n\t\t\t";
    private final static byte[]  _wl_block116Bytes = _getBytes( _wl_block116 );

    private static java.lang.String  _wl_block117 ="\r\n\t\t</div>\r\n\t\t\r\n\t\t";
    private final static byte[]  _wl_block117Bytes = _getBytes( _wl_block117 );

    private static java.lang.String  _wl_block118 ="\r\n\t\t<div id=\"caExport.b13AOption.label\" class=\"fsmContentLeft requiredIcon\">\r\n\t\t\t<label for=\"caExportData.b13AOption\"><span class=\"ui-hidden-accessible\">*</span>";
    private final static byte[]  _wl_block118Bytes = _getBytes( _wl_block118 );

    private static java.lang.String  _wl_block119 ="</label>\r\n\t\t</div>\r\n\t\t<div id=\"caExport.b13AOption.field\" class=\"fsmContentRight\">\r\n\t\t\t";
    private final static byte[]  _wl_block119Bytes = _getBytes( _wl_block119 );

    private static java.lang.String  _wl_block120 ="\r\n\t\t\t";
    private final static byte[]  _wl_block120Bytes = _getBytes( _wl_block120 );

    private static java.lang.String  _wl_block121 ="\r\n\t\t</div>\r\n\t\t";
    private final static byte[]  _wl_block121Bytes = _getBytes( _wl_block121 );

    private static java.lang.String  _wl_block122 ="\r\n\t\t<div id=\"caExport.saveB13A.section\" style=\"display: none\">\r\n\t\t\t<div class=\"fsmContentFull\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block122Bytes = _getBytes( _wl_block122 );

    private static java.lang.String  _wl_block123 ="<label for=\"caExport.saveB13A.checkbox\">";
    private final static byte[]  _wl_block123Bytes = _getBytes( _wl_block123 );

    private static java.lang.String  _wl_block124 ="</label>";
    private final static byte[]  _wl_block124Bytes = _getBytes( _wl_block124 );

    private static java.lang.String  _wl_block125 ="\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t";
    private final static byte[]  _wl_block125Bytes = _getBytes( _wl_block125 );

    private static java.lang.String  _wl_block126 ="\r\n\r\n\t\t";
    private final static byte[]  _wl_block126Bytes = _getBytes( _wl_block126 );

    private static java.lang.String  _wl_block127 ="\r\n\t\t<div id=\"caExport.exemptNumber.section\" style=\"display:none\">\r\n\t\t\t<div id=\"caExport.exemptNumber.label\" class=\"fsmContentLeft\">\r\n\t\t\t\t<label for=\"caExportData.b13AExemptionNumber\">";
    private final static byte[]  _wl_block127Bytes = _getBytes( _wl_block127 );

    private static java.lang.String  _wl_block128 ="</label>\r\n\t\t\t</div>\r\n\t\t\t<div id=\"caExport.exemptNumber.field\" class=\"fsmContentRight\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block128Bytes = _getBytes( _wl_block128 );

    private static java.lang.String  _wl_block129 ="\r\n\t\t\t</div>\r\n\t\t\t<div class=\"fsmContentFull\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block129Bytes = _getBytes( _wl_block129 );

    private static java.lang.String  _wl_block130 ="\r\n\t\t\t</div>\r\n\t\t</div>\r\n\r\n\t\t";
    private final static byte[]  _wl_block130Bytes = _getBytes( _wl_block130 );

    private static java.lang.String  _wl_block131 ="\r\n\t\t<div id=\"caExport.stampedManualAttached.section\" style=\"display:none\">\r\n\t\t\t<div class=\"fsmContentFull\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block131Bytes = _getBytes( _wl_block131 );

    private static java.lang.String  _wl_block132 ="\t\r\n\t\t<div id=\"caExport.filedElectronically.section\" style=\"display:none\">\r\n\t\t\t<div id=\"caExport.authorizationCode.label\" class=\"fsmContentLeft requiredIcon\">\r\n\t\t\t\t<label for=\"caExportData.b13AAuthorizationCodeNumber\"><span class=\"ui-hidden-accessible\">*</span>";
    private final static byte[]  _wl_block132Bytes = _getBytes( _wl_block132 );

    private static java.lang.String  _wl_block133 ="</label>\r\n\t\t\t</div>\r\n\t\t\t<div id=\"caExport.authorizationCode.field\" class=\"fsmContentRight\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block133Bytes = _getBytes( _wl_block133 );

    private static java.lang.String  _wl_block134 ="\r\n\t\t<div id=\"caExport.summaryReporting.section\" style=\"display:none\">\r\n\t\t\t<div id=\"caExport.summaryIDNumber.label\" class=\"fsmContentLeft requiredIcon\">\r\n\t\t\t\t<label for=\"caExportData.b13ASummaryIDNumber\"><span class=\"ui-hidden-accessible\">*</span>";
    private final static byte[]  _wl_block134Bytes = _getBytes( _wl_block134 );

    private static java.lang.String  _wl_block135 ="</label>\r\n\t\t\t</div>\r\n\t\t\t<div id=\"caExport.summaryIDNumber.field\" class=\"fsmContentRight\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block135Bytes = _getBytes( _wl_block135 );

    private static java.lang.String  _wl_block136 ="\r\n\t\t<div id=\"caExport.ManualAttachedFedExtoStamp.section\" style=\"display:none\">\r\n\t\t\t<div class=\"fsmContentFull\">\r\n\t\t\t\t";
    private final static byte[]  _wl_block136Bytes = _getBytes( _wl_block136 );

    private static java.lang.String  _wl_block137 ="\r\n\t\t\t</div>\r\n\t\t</div>\r\n\t\t\r\n\t";
    private final static byte[]  _wl_block137Bytes = _getBytes( _wl_block137 );

    private static java.lang.String  _wl_block138 ="\r\n</div>\r\n";
    private final static byte[]  _wl_block138Bytes = _getBytes( _wl_block138 );

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
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block0Bytes, _wl_block0);

	MessageResources resources = (MessageResources) application.getAttribute(Globals.MESSAGES_KEY);
	MessageResources references = (MessageResources) application.getAttribute("ref");
	WebShipEnvironment webShipEnvironment = WebUtils.getWebShipEnvironment(request);
	Locale locale = webShipEnvironment.getLocale();
	String localLanguage = locale.getLanguage();
	String helpText = resources.getMessage(locale, "text.help");
	String editText = resources.getMessage(locale, "text.edit");
	String hideText = resources.getMessage(locale, "text.hide");
	String closeText = resources.getMessage(locale, "text.close");
	String enterOrSelectText = resources.getMessage(locale, "text.enterOrSelect");
	String selectText = resources.getMessage(locale, "text.pleaseSelect");
	String originCountryCd = webShipEnvironment.getOriginCountry();
	boolean isSPEnabled = webShipEnvironment.isSmartPostAllowedForShipping();
	boolean isReturnsSPEnabled = webShipEnvironment.isSmartPostAllowedForReturns();
	ShipActionForm form = (ShipActionForm) request.getAttribute("shipActionForm");
	if(form.getBillingData()!=null && form.getBillingData().getTransportationChargesBillingAccountInfo()!=null){
		form.getBillingData().getTransportationChargesBillingAccountInfo().truncateAccountNumber();
	}
	if(form.getBillingData()!=null && form.getBillingData().getDutiesAndTaxesBillingAccountInfo()!=null){
		form.getBillingData().getDutiesAndTaxesBillingAccountInfo().truncateAccountNumber();
	}
	//create flow context - cast it as appropriate in page jsps (returns.jsp, outboundship.jsp etc)	
	ShipPageType currentShipPageType = (ShipPageType) request.getAttribute(WebConstants.CURRENT_PAGE_TYPE);
	ShipFlowContext flowContext = null;
	ShipActionForm outboundForm = (ShipActionForm)request.getAttribute(CompressDecompressFilter.DECOMPRESSED_OUTBOUND_SHIP_ACTION_FORM);
	if(ShipPageType.RETURNS_PAGE == currentShipPageType || ShipPageType.RETURNS_PRODUCTS_PAGE == currentShipPageType || (ShipPageType.FREIGHT_SHIPMENT_DETAILS ==  currentShipPageType && form.isReturnShipmentBoolean())) {
	flowContext = new ReturnsFlowContext(outboundForm, form, request, response, resources, currentShipPageType);
	} else {
	flowContext = new ShipFlowContext(form, request, response, resources, currentShipPageType);
	flowContext.setOutboundActionForm(outboundForm);
	}
	DisplayRules displayRules = flowContext.getDisplayRules();
	boolean isInternational = displayRules.isInternationalShipment();
	
	boolean isImportShipment = form.isImportShipmentBoolean();
	
	boolean isReturnShipment = form.isReturnShipmentBoolean();
	boolean isReturnShipmentAllowed = flowContext.isReturnShipmentAllowed();
	boolean isReturnOnly = form.isReturnOnlyBoolean();
	boolean isReturnsEnabled = displayRules.isReturnsEnabled(isReturnShipmentAllowed);
	boolean isReturnEnabled = WebUtils.getUserProfileAdapter(request).isReturnPrivilegeEnabled();
	boolean isReturnOnlyPrivilegeEnabled = WebUtils.getUserProfileAdapter(request).isReturnOnlyPrivilegeEnabled();
	
	// Jan19CL - ITG 171804 - Allow an Admin to restrict shipping to the Central Address Book
	// Revering ITG-hardcoding flags to false

	boolean isAddressBookRestricted = false;
	boolean isClearAllFields = form.getToData().isClearAllFields();
	boolean isFromCabRecordSelected = form.getFromData().isCabRecordSelected();
	boolean isToCabRecordSelected = form.getToData().isCabRecordSelected();
	boolean cabOutboundFlag = isAddressBookRestricted && isToCabRecordSelected 
							&& !isClearAllFields && !(isReturnShipment || isImportShipment);
	boolean cabReturnFlag = isAddressBookRestricted && isFromCabRecordSelected 
							&& !isClearAllFields && (isReturnShipment || isImportShipment);
	
	// Jan19CL - ITG 171800 - Allow Option for Billing Defaults not to change
	// Jan19CL - ITG 171800 - Reverting ITG- hardcoding flags to false

	boolean isBillToRestrictedFlag = false;
	boolean isDutyBillToRestrictedFlag = false;
			
	boolean billingRestrictedFlag = isBillToRestrictedFlag || isDutyBillToRestrictedFlag;
	
	SpecialServicesPrivilegesVO splServicesPrivilege = webShipEnvironment.getPrivileges().getSpecialServicesPrivileges(isImportShipment?false:isReturnShipment);
	CompleteShipData completeShipData = form.getCompleteShipData();
	String dynamicModuleNumber = completeShipData.getDynamicModuleNumber();
	boolean isPackageContentsAvailable = displayRules.isPackageContentsAvailable();
	SSData ssData = form.getSsData();
	PSDData psdData = form.getPsdData();
	String fromCountryCode = form.getFromData().getAddressData().getCountryCode();
	Boolean displaySmartPostAccountAlert = form.getPsdDisplay().getDisplaySmartPostAlert(); 
	boolean displaySmartPostAccAlert = displaySmartPostAccountAlert.booleanValue();
	String toCountryCode = form.getToData().getAddressData().getCountryCode();
	String pickupOption = form.getPickupDropoffData().getPickupTypeCode();
	if (fromCountryCode != null)
		fromCountryCode = fromCountryCode.trim();
	if (toCountryCode != null)
		toCountryCode = toCountryCode.trim();
	ContactData toData = form.getToData();
	String toCountryName = form.getToDisplay().getCountryName();
	String fromCountryName = form.getFromDisplay().getCountryName();
	String psdServiceType = psdData.getServiceType();
	String totalWeight = psdData.getTotalWeight();
	boolean isIntraEUShipment = CountryUtils.isIntraEuropeanUnion(fromCountryCode,toCountryCode);
	boolean arePackagesIdentical = psdData.arePackagesIdenticalBoolean(); 
	int numOfPkgs;
	try {
		numOfPkgs = Integer.parseInt(psdData.getNumberOfPackages());
	} catch (NumberFormatException e) {
		numOfPkgs = 0;
	} 
	String numberOfPkgs = psdData.getNumberOfPackages();
	if (numberOfPkgs == null || numberOfPkgs.isEmpty() || numberOfPkgs.equals("0") || numberOfPkgs.equals("1")) {
		totalWeight = psdData.getMpsRowDataList(0).getWeight();
	}
	String totalCarriageValue = psdData.getTotalCarriageValue();

	boolean isUSDomestic = displayRules.isUSDomesticShipment();
	boolean isCADomestic = displayRules.isCanadaDomesticShipment();
	boolean isUAEDomestic = displayRules.isUAEDomesticShipment();
	boolean isIndiaDomestic = displayRules.isIndiaDomesticShipment();
    boolean isDomestic = displayRules.isDomesticShipment();
    boolean isUKDomestic = displayRules.isUKDomesticShipment();
    boolean isDomesticAllowed = displayRules.isDomesticAllowed();
    boolean isDomesticReturnsSupported = displayRules.isReturnsDomesticAllowed(fromCountryCode, isReturnShipmentAllowed, WebUtils.getUserProfileAdapter(request).getActiveAccount());
    boolean isDomesticShippingSupported = displayRules.isDomesticShippingSupported(fromCountryCode, WebUtils.getUserProfileAdapter(request).getActiveAccount());
    boolean isSameServiceCategoryPackageRefreshNeeded = displayRules.isSameServiceCategoryPackageRefreshRequired();//Mostly for GDE countries 
    
	boolean isProducts = false;
	if (!form.getCommodityData().isDocumentShippingBoolean())
		isProducts = true;
	// Consult the master copy billing account off of the user profile to avoid any modificataion (account number truncation)
	// of the one off of the ShipActionForm that would prevent the user profile adapter from being unable to link the selected
	// account to an AccountVO
	boolean isShowAlcoholService = false;
	if(!WebUtils.isNumber(form.getBillingData().getSelectedBillTransportationIndex())) {
		isShowAlcoholService = displayRules.isShowAlcoholService(WebUtils.getUserProfileAdapter(request), 
				((BillingAccountInfo) WebUtils.getUserProfileAdapter(request).getBillingAccountInfoList().get(0)),
				flowContext.isImportShipment()?false:flowContext.isReturnShipment()); // default account
	}else {
		isShowAlcoholService = displayRules.isShowAlcoholService(WebUtils.getUserProfileAdapter(request), 
				((BillingAccountInfo) WebUtils.getUserProfileAdapter(request).getBillingAccountInfoList().get(Integer.parseInt(form.getBillingData().getSelectedBillTransportationIndex())-1)),
				flowContext.isImportShipment()?false:flowContext.isReturnShipment());
	}
	
	boolean saturdayDelivery = ssData.isSaturdayDeliveryBoolean();
	boolean cod = ssData.isCODBoolean();	
	boolean dia = ssData.isDIABoolean();
	boolean isHal = ssData.isHALBoolean();
	boolean isAlcohol = ssData.getAlcohol().booleanValue();
	String nonStandardPack = psdData.getNonStandardPack();
	String signatureType = ssData.getSignatureType();
	boolean isResidential = toData.getAddressData().isResidentialBoolean();
	boolean dangerousGoods = ssData.isDangerousGoodsBoolean();
	boolean isOrmd = ssData.isORMDBoolean();
	boolean isSqe = ssData.isSmallQuantityExceptionBoolean();
	boolean isLiBattery = ssData.isLithiumBatteryBoolean();
	boolean isGdryIce = ssData.isGDryIceBoolean();
	boolean isHazmat = ssData.isHazMatBoolean();
	boolean isInsidePickup = ssData.isInsidePickup();
	boolean isInsideDelivery = ssData.isInsideDelivery();
	boolean holidayDelivery = ssData.isHolidayDeliveryBoolean();
	boolean specialDelivery = ssData.isSpecialDeliveryBoolean();
	boolean sundayDelivery = ssData.isSundayDeliveryBoolean();
	String wtUnitOfMeasure = psdData.getWeightUnitOfMeasure();
	boolean isFice = ssData.isFice();
	boolean isItar = ssData.isItar();
	String itarExemptionNumber = ssData.getItarExemptionNumber();
	boolean isICE = ssData.isDryIceBoolean();
	boolean isBrokerSelect = ssData.isBrokerSelect();
	boolean isEveningHomeDelivery = ssData.isEveningHomeDelivery();
	boolean isDateCertainHomeDelivery = ssData.isDateCertainHomeDelivery();
	boolean isAppointmentHomeDelivery = ssData.isAppointmentHomeDelivery(); 
	boolean isSaveAsDefaultDiaChbxChecked = ssData.getDiaData().isSaveDefaultDiaAddressCheckboxBoolean();
	boolean isSaveAsDefaultCodChbxChecked =  ssData.getCodData().isSaveDefaultCodAddressCheckboxBoolean();
	String dangerousGoodsType="";
	List mpsRDL = psdData.getMpsRowDataList();
	if (mpsRDL!=null) {
		MPSRowData rowData = null;
		for (Iterator iter=mpsRDL.iterator(); iter.hasNext();) { 
	rowData = (MPSRowData) iter.next();
	if (rowData != null && !WebUtils.isEmptyString(rowData.getDangerousGoodsType()) ) {
		dangerousGoodsType = rowData.getDangerousGoodsType();
		break;
	}
		}
	}
	PackagePreferencesVO preferencesVO = webShipEnvironment.getPreferences();
	//Temp
	boolean documentProfileEnabled = preferencesVO.isDocumentProfileDisplayEnabled();
	PackageReferencePreferencesVO refPref = preferencesVO.getReferencePreferences();
	boolean isYourReferenceReminderEnabled = refPref.getYourReference().isReminder();
	boolean isPoEnabled = refPref.getPurchaseOrder().isReminder();
	boolean isInvoiceEnabled = refPref.getInvoiceNumber().isReminder();
	boolean isDeptEnabled = refPref.getDepartmentNumber().isReminder();
	boolean isAlwaysDisplayAdditionalCustomsDoc = preferencesVO.isAlwaysDisplayAdditionalCustomsDoc();
	boolean defaultNotificationMode = webShipEnvironment.getPreferences().isAlwaysShowFusionExpanded();
	boolean isAlwaysShowAdditionalRecipients = preferencesVO.isAlwaysShowAdditionalRecipents();
	boolean isAlwaysShowFusionMessage = preferencesVO.isAlwaysShowFusionMessage();
	String carriageCurrencyCode = psdData.getDeclaredValueCurrencyCode();
	String weightUnitOfMeasure = psdData.getWeightUnitOfMeasure();
	String weightUnitOfMeasureDescription = (weightUnitOfMeasure.equals("LBS")) ? resources.getMessage(locale,
	        "text.lbs") : resources.getMessage(locale, "text.kgs");
	boolean isSedAllowed = form.getSedDisplay().isSedAllowedBoolean();
	boolean isCAExportAllowed = form.getCaExportDisplay().isCAExportAllowedBoolean();
	boolean isAlwaysShowSpecialServicesExpanded = preferencesVO.isAlwaysShowSpecialServicesExpanded();
	//boolean isSaturdayDeliveryOptionsReminder = preferencesVO.isSaturdayDeliveryOptionsReminder();
	boolean isAllowSaturdayReturnDelivery = preferencesVO.isAllowSaturdayReturnDelivery(); //July '14
	boolean isGround = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isGround();
	boolean isFreight = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isFreight();
	boolean isSmartPost = ServiceTypeAdapter.getServiceTypeAdapter(psdServiceType).isSmartPost();
	boolean isLargeSmartPostShipper = webShipEnvironment.isLargeSmartPostShipper();
	boolean isDeliveryConfirmationRequired = webShipEnvironment.isDeliveryConfirmationRequired(); 
	boolean isShipmentFromWSED = form.isShipmentFromWSEDBoolean();
	boolean isDisplayInsightOptions = preferencesVO.isDisplayInsightOptions();
	String b13aOption = preferencesVO.getDefaultB13ADeclarationTypeCode();
	String b13aExemptionNumber = preferencesVO.getB13AExemptionNumber();
	//Defect #53577: Replacing - boolean isGroupShip = form.getToDisplay().isGroupShip();
	Boolean bObject = Boolean.valueOf(form.getGroupShip());
	boolean isGroupShip = bObject.booleanValue();
	
	// to determine if the from country code is EMEA country code
	boolean isFromEMEA = CountryUtils.isEmea(fromCountryCode);
	
	String purchaseOrderValidationTypeCode = form.getBillingData().getReferenceData().getPurchaseOrderValidationTypeCode();
	String departmentNumberPasskeyValidationTypeCode = form.getBillingData().getReferenceData().getDepartmentNumberValidationTypeCode();	         
	String invoiceNumberPasskeyValidationTypeCode = form.getBillingData().getReferenceData().getInvoiceNumberValidationTypeCode();
	String YourReferencePasskeyValidationTypeCode = form.getBillingData().getReferenceData().getYourReferenceValidationTypeCode();
	boolean isSenderPickup = preferencesVO.getDefaultSenderFusionNotificationVO().isPickupNotification();
	boolean isOther1Pickup = preferencesVO.getDefaultOther1FusionNotificationVO().isPickupNotification();
	boolean isOther2Pickup = preferencesVO.getDefaultOther2FusionNotificationVO().isPickupNotification();
	
	String createCommercialInvoiceProforma = "";
	if (CustomsDocumentType.GENERIC_COMMERCIAL_INVOICE.equals(preferencesVO.getDefaultDocumentCreationType())) {
		createCommercialInvoiceProforma = WebConstants.COMMERCIAL_INVOICE;
	} else if (CustomsDocumentType.GENERIC_PROFORMA_INVOICE.equals(preferencesVO.getDefaultDocumentCreationType())) {
		createCommercialInvoiceProforma = WebConstants.PROFORMA_INVOICE;
	}
 	
	boolean isSenderShip = preferencesVO.getDefaultSenderFusionNotificationVO().isShipmentNotification();
	boolean isSenderException = preferencesVO.getDefaultSenderFusionNotificationVO().isExceptionNotification();
	boolean isSenderDelivery = preferencesVO.getDefaultSenderFusionNotificationVO().isDeliveryNotification();
	boolean isSenderEstimatedDelivery = preferencesVO.getDefaultSenderFusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isOther1Ship = preferencesVO.getDefaultOther1FusionNotificationVO().isShipmentNotification();
	boolean isOther1Exception = preferencesVO.getDefaultOther1FusionNotificationVO().isExceptionNotification();
	boolean isOther1Delivery = preferencesVO.getDefaultOther1FusionNotificationVO().isDeliveryNotification();
	boolean isOther1EstimatedDelivery = preferencesVO.getDefaultOther1FusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isOther2Ship = preferencesVO.getDefaultOther2FusionNotificationVO().isShipmentNotification();
	boolean isOther2Exception = preferencesVO.getDefaultOther2FusionNotificationVO().isExceptionNotification();
	boolean isOther2Delivery = preferencesVO.getDefaultOther2FusionNotificationVO().isDeliveryNotification();
	boolean isOther2EstimatedDelivery = preferencesVO.getDefaultOther2FusionNotificationVO().isEstimatedDeliveryNotification();
	boolean isNRIBIEnabled = webShipEnvironment.isNRIBIEnabled();
	boolean isNRIBIMarkedAsDisabled = webShipEnvironment.isNRIBIMarkedAsDisabled();
	String nRIBIFlag = webShipEnvironment.getNRIBIFlag();
	boolean isBrokerChecked = preferencesVO.isAlwaysUseBrokerSelectOption();
	
	NotificationType nt = preferencesVO.getDefaultSenderFusionNotificationVO().getFormatType();
	String formatType = "";
	if(nt!=null){ 
		 formatType = nt.getCode();
	}
	
	String senderLanguage = preferencesVO.getDefaultSenderFusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();
	String other1Language = preferencesVO.getDefaultOther1FusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();
	String other2Language = preferencesVO.getDefaultOther2FusionNotificationVO()
	        .getFusionNotificationLanguageCountryCode();

	boolean isNonLoggedInUser = webShipEnvironment.getUserIdentity().isNonLoggedInUser();
	boolean isPasskeyUser = webShipEnvironment.getUserIdentity().isPasskeyUser();
	boolean isFclUser = webShipEnvironment.isFclUser();
	boolean isCompanyLetterheadImage = preferencesVO.getApplicationPreferences().isCompanyLetterheadUsed();
	boolean isSignatureImage = preferencesVO.getApplicationPreferences().isUploadedSignatureUsed();
	String extraNbrCopies = "" + preferencesVO.getNumberOfExtraCopies();
	String shipFromProfile = form.getCompleteShipData().getShipFromShipmentProfile();
	String shipFromPending = form.getCompleteShipData().getShipFromPendingShipment();
	String dataFromDatabase = ((WebConstants.Y.equals(shipFromProfile) || WebConstants.Y.equals(shipFromPending)) ? WebConstants.Y : WebConstants.N);

	boolean isUSOrCAOrigin = false;
	if(CountryUtils.isUSOrigin(webShipEnvironment.getOriginCountry()) || CountryUtils.isCAOrigin(webShipEnvironment.getOriginCountry()))
		isUSOrCAOrigin = true;	
	String defaultPTCode = PickupDropoffUtil.getDefaultPickupType(preferencesVO).getCode();
	
	String browserType = request.getHeader ( "User-Agent" );
	boolean isSafari = false;
	boolean isOpera = false;
	boolean isFirefox = false;
	boolean isChrome = false;
	boolean isIE = false;
	boolean isSafariOnMAC = false;
	int OSIndex = 0;
	int browserIndex = 0;
	if (browserType != null){
	    browserIndex = browserType.indexOf("Safari");
	    if (browserIndex >= 0){
	    	isSafari = true;
	    }
	    browserIndex = browserType.indexOf("Opera");
	    if (browserIndex >= 0) {
	        isOpera = true;
	    }
	    browserIndex = browserType.indexOf("Firefox");
	    if (browserIndex >= 0) {
	        isFirefox = true;
	    }
	    browserIndex = browserType.indexOf("Chrome");
	    if (browserIndex >= 0) {
	        isChrome = true;
	    }
	    browserIndex = browserType.indexOf("MSIE");
	    if (browserIndex >= 0) {
	        isIE = true;
	    }
	    OSIndex = browserType.indexOf("Mac");
	    if(isSafari && (OSIndex > 0) && (!(browserType.indexOf("Chrome") > 0))){
	    	isSafariOnMAC = true;
	    }
	}
	boolean postalCheckEnabledForUSandCA = displayRules.isCust03PostalCheckEnabledForUSandCA();
	boolean postalCheckEnabledForROW = displayRules.isCust03PostalCheckEnabledForROW();
		
	boolean isPostalCheckEnabled = false;
	if((postalCheckEnabledForUSandCA && ( toCountryCode.equalsIgnoreCase("US") || toCountryCode.equalsIgnoreCase("CA") ))  ||
				(postalCheckEnabledForROW &&  !( toCountryCode.equalsIgnoreCase("US") || toCountryCode.equalsIgnoreCase("CA")))){
				isPostalCheckEnabled = true;
	}
	
	//To Show TOggler or Not - MANUAL Address Checking
	boolean isAddressCheckEnabled =  displayRules.isCust03AddressCheckEnabled(toCountryCode);
	
	//To Do AUTO Address Checking 
	boolean isMandatoryAddressCheckEnabled = displayRules.isCust03MandatoryAddressCheckEnabled(fromCountryCode,toCountryCode);
	boolean isPickupDropOffSuppressed = ( form.isReturnShipmentBoolean() && isInternational ) && !( isLargeSmartPostShipper && isSmartPost);
	
	String meterNumber = WebUtils.getUserProfileAdapter(request).getMeterNumber();

	String gticSuggestedDocumentsURL  = ApplicationPropertyLoader.getInstance().getProperty("GTIC_SUGGESTED_DOCS_URL");
	boolean isIRDEmailLableShipmentAllowed = displayRules.isIRDEmailLableShipmentAllowed();
	
	boolean isImportShipmentAllowed = displayRules.isImportShipmentAllowed();

	// ITG 149885: LAC Columbia Postal Code Project, July '14
	boolean isAvailableCityListRefreshEnabled = DecoupleState.INSTANCE.isAvailableCityListRefreshEnabled();
	boolean isColumbiaPostalCodeMockEnabled = DecoupleState.INSTANCE.isColumbiaPostalCodeMockEnabled();
	boolean isReasonForReturn = preferencesVO.isDisplayReturnReason(); 
	//boolean isReasonForReturn =true;
	
	HTMLEncoder htmlEncoderAltNames = new HTMLEncoder();
	
	// Jan 2015 CL - ITG-155772 and ID-1257810
	String yourReferenceLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getYourReferenceLabel());
	String poNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getPoNumberLabel());
	String invoiceNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getInvoiceNumberLabel());
	String deptNumberLabel = htmlEncoderAltNames.encode(WebUtils.getRenameReferencesObject(request,resources).getDeptNumberLabel());
	boolean isGDE4UKEnabled = DecoupleState.INSTANCE.isGDE4UKEnabled();
	boolean isSMARRTZEnabled = DecoupleState.INSTANCE.isSMARRTZEnabled();
	boolean isSMARRTZAlertEnabled = DecoupleState.INSTANCE.isSMARRTZAlertEnabled();
	boolean isLACSouthMiamiEnabled= DecoupleState.INSTANCE.isLACSouthMiamiEnabled();
	boolean isNIAGARAEnabled = DecoupleState.INSTANCE.isNIAGARAEnabled();
	// Jan 2016 CL - ITG-169590 and ID-1485584
	boolean isEDNForSmartPostEnabled = DecoupleState.INSTANCE
	        .isEDNForSmartPostEnabled();
	//Jul 2016 CL - ITG 159201 ETD Enhancements - ID 1485809
	boolean isETDDGHazmatEnabled = DecoupleState.INSTANCE.isETDDGHazmatEnabled();
	boolean isETDEnhancementEnabled = DecoupleState.INSTANCE.isETDEnhancementEnabled();
	// Jul 2018 CL - ITG-180129 OnSite2.3 - ID:112428
	boolean isOnsitePackageHandlingRestrictionEnabled = DecoupleState.INSTANCE.isPackageHandlingRestrictionEnabled();
	//Jan 2017 CL - 177016 Sec II Lithium Battery Identification - 1537132
	//Jan 2017 CL - 177016 Sec II Lithium Battery Identification - 1537132
	boolean isExpressLithiumBatteryAllowed=DecoupleState.INSTANCE.isExpressLithiumBatteryAllowed();
	// JUL17CL - ITG 176640 - Niagara 2.0 Phase 2
    boolean isNIAGARAPhase2Enabled = DecoupleState.INSTANCE.isNIAGARAPhase2Enabled();
    boolean isNonETDLabelAndIntraEUEnabled = DecoupleState.INSTANCE.isNonETDLabelAndIntraEUEnabled();
    // Jan18CL - ITG 163016 Freight 2020
	boolean isFreight2020Enabled=DecoupleState.INSTANCE.isFreight2020Enabled();
  	String freight2020MaxTotalHandlingUnits = DecoupleState.INSTANCE.getMaxTotalHandlingUnits();

            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block3Bytes, _wl_block3);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block2Bytes, _wl_block2);
            _bw.write(_wl_block4Bytes, _wl_block4);
            _bw.write(_wl_block5Bytes, _wl_block5);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block6Bytes, _wl_block6);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( isReturnsSPEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block7Bytes, _wl_block7);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalServiceTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block8Bytes, _wl_block8);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf( displayRules.isRegionalPackageTypes() ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block9Bytes, _wl_block9);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomestic), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block10Bytes, _wl_block10);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block11Bytes, _wl_block11);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticReturnsSupported ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block12Bytes, _wl_block12);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDomesticShippingSupported), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block13Bytes, _wl_block13);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSameServiceCategoryPackageRefreshNeeded), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block14Bytes, _wl_block14);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isShowAlcoholService ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block15Bytes, _wl_block15);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(locale.toString()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block16Bytes, _wl_block16);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPackageContentsAvailable ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block17Bytes, _wl_block17);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnOnly ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block18Bytes, _wl_block18);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFromEMEA), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block19Bytes, _wl_block19);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(originCountryCd), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block20Bytes, _wl_block20);
             com.fedex.framework.taglib.encode.JavascriptTag __tag0 = null ;
            int __result__tag0 = 0 ;

            if (__tag0 == null ){
                __tag0 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag0);
            }
            __tag0.setPageContext(pageContext);
            __tag0.setParent(null);
            __tag0.setValue(fromCountryCode
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
            _bw.write(_wl_block21Bytes, _wl_block21);
            _bw.write(_wl_block22Bytes, _wl_block22);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtSelect}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block23Bytes, _wl_block23);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtAddressResults}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block24Bytes, _wl_block24);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtCommercial}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block25Bytes, _wl_block25);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtResidential}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block26Bytes, _wl_block26);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtUseAddressEntered}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block27Bytes, _wl_block27);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${enteredAddressRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block28Bytes, _wl_block28);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block29Bytes, _wl_block29);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultDiaChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block30Bytes, _wl_block30);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSaveAsDefaultCodChbxChecked), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block31Bytes, _wl_block31);

            if (_jsp__tag1(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block32Bytes, _wl_block32);

            if (_jsp__tag2(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block33Bytes, _wl_block33);

            if (_jsp__tag3(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block34Bytes, _wl_block34);

            if (_jsp__tag4(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block35Bytes, _wl_block35);

            if (_jsp__tag5(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block36Bytes, _wl_block36);

            if (_jsp__tag6(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block37Bytes, _wl_block37);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCustomsModuleAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block38Bytes, _wl_block38);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isPackageContentsAvailable()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block39Bytes, _wl_block39);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUSDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block40Bytes, _wl_block40);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isCanadaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block41Bytes, _wl_block41);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isIndiaDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block42Bytes, _wl_block42);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUAEDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block43Bytes, _wl_block43);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block44Bytes, _wl_block44);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isUKDomesticShipment()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block45Bytes, _wl_block45);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(displayRules.isDomesticAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block46Bytes, _wl_block46);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block47Bytes, _wl_block47);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtGroundSpecificSSRollOverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block48Bytes, _wl_block48);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSS}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block49Bytes, _wl_block49);
            out.write(_jsp_expressionInterceptor.intercept(( java.lang.String ) weblogic.servlet.jsp.ELHelper.evaluate("${txtHomeDeliverySpecificSSRolloverHelp}",java.lang.String.class,pageContext, null ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.EL));
            _bw.write(_wl_block50Bytes, _wl_block50);

            if (_jsp__tag7(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block51Bytes, _wl_block51);

            if (_jsp__tag8(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block52Bytes, _wl_block52);

            if (_jsp__tag9(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block53Bytes, _wl_block53);

            if (_jsp__tag10(request, response, pageContext, _activeTag, null))
             return;
            _bw.write(_wl_block54Bytes, _wl_block54);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isPostalCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block55Bytes, _wl_block55);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block56Bytes, _wl_block56);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isMandatoryAddressCheckEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block57Bytes, _wl_block57);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(meterNumber), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block58Bytes, _wl_block58);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(gticSuggestedDocumentsURL), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block59Bytes, _wl_block59);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isIRDEmailLableShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block60Bytes, _wl_block60);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isImportShipmentAllowed), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block61Bytes, _wl_block61);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAvailableCityListRefreshEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block62Bytes, _wl_block62);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isGDE4UKEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block63Bytes, _wl_block63);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block64Bytes, _wl_block64);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSMARRTZAlertEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block65Bytes, _wl_block65);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block66Bytes, _wl_block66);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isColumbiaPostalCodeMockEnabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block67Bytes, _wl_block67);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(DecoupleState.INSTANCE.isIRDAPACShippingAllowed()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block68Bytes, _wl_block68);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isEDNForSmartPostEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block69Bytes, _wl_block69);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isLACSouthMiamiEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block70Bytes, _wl_block70);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDDGHazmatEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block71Bytes, _wl_block71);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isETDEnhancementEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block72Bytes, _wl_block72);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isOnsitePackageHandlingRestrictionEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block73Bytes, _wl_block73);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isExpressLithiumBatteryAllowed ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block74Bytes, _wl_block74);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBrokerSelect), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block75Bytes, _wl_block75);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isIntlGrdConsolidationAcctBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block76Bytes, _wl_block76);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(form.getSsData().isExcludeFromConsolidationBoolean()), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block77Bytes, _wl_block77);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNIAGARAPhase2Enabled ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block78Bytes, _wl_block78);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isNonETDLabelAndIntraEUEnabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block79Bytes, _wl_block79);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(JSONSimulator.toJSONString(form.getPsdDisplay())), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block80Bytes, _wl_block80);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isFreight2020Enabled), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block81Bytes, _wl_block81);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(freight2020MaxTotalHandlingUnits), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block82Bytes, _wl_block82);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isAddressBookRestricted), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block83Bytes, _wl_block83);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isClearAllFields), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block84Bytes, _wl_block84);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabOutboundFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block85Bytes, _wl_block85);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(cabReturnFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block86Bytes, _wl_block86);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipment || isImportShipment ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block87Bytes, _wl_block87);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block88Bytes, _wl_block88);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isDutyBillToRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block89Bytes, _wl_block89);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(billingRestrictedFlag), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block90Bytes, _wl_block90);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isSafariOnMAC), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block91Bytes, _wl_block91);
            _bw.write(_wl_block0Bytes, _wl_block0);


String b13AMoreInfo = references.getMessage(locale, "b13A.info.help");

String CAExportText = resources.getMessage(locale, "text.title.CAExport"); 
boolean isUSPRVI = form.getCaExportDisplay().isCAExportToUSPRVIBoolean();
// Added on 02-27-2012 by 838334 to display save for future shipments checkbox
String defaultB13AOption = form.getCaExportData().getDefaultB13AOption();

String defaultState = "collapsed";
if (!isUSPRVI) {
	defaultState = "expanded";
}
//String contextPath = request.getContextPath();

            _bw.write(_wl_block92Bytes, _wl_block92);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(CAExportText), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block93Bytes, _wl_block93);
             com.fedex.framework.taglib.encode.JavascriptTag __tag11 = null ;
            int __result__tag11 = 0 ;

            if (__tag11 == null ){
                __tag11 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag11);
            }
            __tag11.setPageContext(pageContext);
            __tag11.setParent(null);
            __tag11.setValue( b13aOption
);
            _activeTag=__tag11;
            __result__tag11 = __tag11.doStartTag();

            if (__result__tag11!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag11== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
            _bw.write(_wl_block94Bytes, _wl_block94);
             com.fedex.framework.taglib.encode.JavascriptTag __tag12 = null ;
            int __result__tag12 = 0 ;

            if (__tag12 == null ){
                __tag12 = new  com.fedex.framework.taglib.encode.JavascriptTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag12);
            }
            __tag12.setPageContext(pageContext);
            __tag12.setParent(null);
            __tag12.setValue( b13aExemptionNumber
);
            _activeTag=__tag12;
            __result__tag12 = __tag12.doStartTag();

            if (__result__tag12!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag12== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.encode.JavascriptTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
            }
            if (__tag12.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                _activeTag = null;
                _releaseTags(pageContext, __tag12);
                return;
            }
            _activeTag=__tag12.getParent();
            weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag12);
            __tag12.release();
            _bw.write(_wl_block95Bytes, _wl_block95);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(defaultB13AOption), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block96Bytes, _wl_block96);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isGroupShip), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block97Bytes, _wl_block97);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(isReturnShipment), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block98Bytes, _wl_block98);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(JSONSimulator.toJSONString(form.getReturnOptionsData())), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block99Bytes, _wl_block99);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(b13AMoreInfo), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block100Bytes, _wl_block100);
             com.fedex.framework.taglib.ModuleTag __tag13 = null ;
            int __result__tag13 = 0 ;

            if (__tag13 == null ){
                __tag13 = new  com.fedex.framework.taglib.ModuleTag ();
                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag13);
            }
            __tag13.setPageContext(pageContext);
            __tag13.setParent(null);
            __tag13.setId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("module.caExport", java.lang.String.class,"id"));
            __tag13.setType(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("required", java.lang.String.class,"type"));
            __tag13.setTitle( CAExportText 
);
            __tag13.setDefaultMode(defaultState 
);
            __tag13.setHelpText(helpText 
);
            __tag13.setEditText(editText 
);
            __tag13.setHideText(hideText 
);
            _activeTag=__tag13;
            __result__tag13 = __tag13.doStartTag();

            if (__result__tag13!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                if (__result__tag13== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                     throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                }
                do {
                    _bw.write(_wl_block101Bytes, _wl_block101);

                    if (_jsp__tag14(request, response, pageContext, _activeTag, __tag13))
                     return;
                    _bw.write(_wl_block103Bytes, _wl_block103);
                     com.fedex.framework.taglib.ModuleExpandedTag __tag15 = null ;
                    int __result__tag15 = 0 ;

                    if (__tag15 == null ){
                        __tag15 = new  com.fedex.framework.taglib.ModuleExpandedTag ();
                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag15);
                    }
                    __tag15.setPageContext(pageContext);
                    __tag15.setParent(__tag13);
                    _activeTag=__tag15;
                    __result__tag15 = __tag15.doStartTag();

                    if (__result__tag15!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                        if (__result__tag15== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                             throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleExpandedTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
                        }
                        do {
                            _bw.write(_wl_block104Bytes, _wl_block104);
                            _bw.write(_wl_block105Bytes, _wl_block105);

                            if (_jsp__tag16(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block106Bytes, _wl_block106);

                            if (_jsp__tag17(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block107Bytes, _wl_block107);

                            if (_jsp__tag18(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block108Bytes, _wl_block108);
                            _bw.write(_wl_block102Bytes, _wl_block102);
 if (!isUSPRVI) { 
                            _bw.write(_wl_block109Bytes, _wl_block109);

                            if (_jsp__tag19(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block110Bytes, _wl_block110);
 if (isGroupShip) { 
                            _bw.write(_wl_block111Bytes, _wl_block111);

                            if (_jsp__tag20(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block112Bytes, _wl_block112);
 } else { 
                            _bw.write(_wl_block111Bytes, _wl_block111);

                            if (_jsp__tag21(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block112Bytes, _wl_block112);
 } 
                            _bw.write(_wl_block113Bytes, _wl_block113);

                            if (_jsp__tag22(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block114Bytes, _wl_block114);

                            if (_jsp__tag23(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block115Bytes, _wl_block115);

                            if (_jsp__tag24(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block116Bytes, _wl_block116);

                            if (_jsp__tag25(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block117Bytes, _wl_block117);
                            _bw.write(_wl_block118Bytes, _wl_block118);

                            if (_jsp__tag26(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block119Bytes, _wl_block119);
                             org.apache.struts.taglib.html.SelectTag __tag27 = null ;
                            int __result__tag27 = 0 ;

                            if (__tag27 == null ){
                                __tag27 = new  org.apache.struts.taglib.html.SelectTag ();
                                weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag27);
                            }
                            __tag27.setPageContext(pageContext);
                            __tag27.setParent(__tag15);
                            __tag27.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AOption", java.lang.String.class,"property"));
                            __tag27.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AOption", java.lang.String.class,"styleId"));
                            __tag27.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
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
                                        _bw.write(_wl_block120Bytes, _wl_block120);

				for(LabelValueVO option : form.getCaExportDisplay().getDeclarationOptions()) { 
                                        _bw.write(_wl_block112Bytes, _wl_block112);
                                         org.apache.struts.taglib.html.OptionTag __tag28 = null ;
                                        int __result__tag28 = 0 ;

                                        if (__tag28 == null ){
                                            __tag28 = new  org.apache.struts.taglib.html.OptionTag ();
                                            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag28);
                                        }
                                        __tag28.setPageContext(pageContext);
                                        __tag28.setParent(__tag27);
                                        __tag28.setValue( option.getValue() 
);
                                        _activeTag=__tag28;
                                        __result__tag28 = __tag28.doStartTag();

                                        if (__result__tag28!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                            try {
                                                if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.pushBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                    __tag28.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                                                    __tag28.doInitBody();
                                                }
                                                do {
                                                     org.apache.struts.taglib.bean.MessageTag __tag29 = null ;
                                                    int __result__tag29 = 0 ;

                                                    if (__tag29 == null ){
                                                        __tag29 = new  org.apache.struts.taglib.bean.MessageTag ();
                                                        weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag29);
                                                    }
                                                    __tag29.setPageContext(pageContext);
                                                    __tag29.setParent(__tag28);
                                                    __tag29.setKey( option.getLabel() 
);
                                                    _activeTag=__tag29;
                                                    __result__tag29 = __tag29.doStartTag();

                                                    if (__result__tag29!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
                                                        if (__result__tag29== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                             throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
                                                } while (__tag28.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                                            } finally {
                                                if (__result__tag28== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                                                    out = pageContext.popBody();
                                                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                                                }
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
                                        _bw.write(_wl_block112Bytes, _wl_block112);
 }
			
                                        _bw.write(_wl_block120Bytes, _wl_block120);
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
                            _bw.write(_wl_block121Bytes, _wl_block121);
                            _bw.write(_wl_block102Bytes, _wl_block102);
                            _bw.write(_wl_block102Bytes, _wl_block102);
 if(isReturnShipment) { 
                            _bw.write(_wl_block122Bytes, _wl_block122);

                            if (_jsp__tag30(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block125Bytes, _wl_block125);
 } 
                            _bw.write(_wl_block126Bytes, _wl_block126);
                            _bw.write(_wl_block127Bytes, _wl_block127);

                            if (_jsp__tag32(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block128Bytes, _wl_block128);

                            if (_jsp__tag33(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block129Bytes, _wl_block129);

                            if (_jsp__tag34(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block130Bytes, _wl_block130);
                            _bw.write(_wl_block131Bytes, _wl_block131);

                            if (_jsp__tag35(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block108Bytes, _wl_block108);
                            _bw.write(_wl_block132Bytes, _wl_block132);

                            if (_jsp__tag36(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block133Bytes, _wl_block133);

                            if (_jsp__tag37(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block129Bytes, _wl_block129);

                            if (_jsp__tag38(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block129Bytes, _wl_block129);

                            if (_jsp__tag39(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block130Bytes, _wl_block130);
                            _bw.write(_wl_block134Bytes, _wl_block134);

                            if (_jsp__tag40(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block135Bytes, _wl_block135);

                            if (_jsp__tag41(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block129Bytes, _wl_block129);

                            if (_jsp__tag42(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block125Bytes, _wl_block125);
                            _bw.write(_wl_block102Bytes, _wl_block102);
                            _bw.write(_wl_block136Bytes, _wl_block136);

                            if (_jsp__tag43(request, response, pageContext, _activeTag, __tag15))
                             return;
                            _bw.write(_wl_block137Bytes, _wl_block137);
 } 
                            _bw.write(_wl_block103Bytes, _wl_block103);
                        } while (__tag15.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
                    }
                    if (__tag15.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
                        _activeTag = null;
                        _releaseTags(pageContext, __tag15);
                        return;
                    }
                    _activeTag=__tag15.getParent();
                    weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag15);
                    __tag15.release();
                    _bw.write(_wl_block1Bytes, _wl_block1);
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
            _bw.write(_wl_block138Bytes, _wl_block138);
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
         org.apache.struts.taglib.bean.MessageTag __tag1 = null ;
        int __result__tag1 = 0 ;

        if (__tag1 == null ){
            __tag1 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag1);
        }
        __tag1.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag1, parent);
        __tag1.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.select", java.lang.String.class,"key"));
        _activeTag=__tag1;
        __result__tag1 = __tag1.doStartTag();

        if (__result__tag1!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag1== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag2 = null ;
        int __result__tag2 = 0 ;

        if (__tag2 == null ){
            __tag2 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag2);
        }
        __tag2.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag2, parent);
        __tag2.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.address.results", java.lang.String.class,"key"));
        _activeTag=__tag2;
        __result__tag2 = __tag2.doStartTag();

        if (__result__tag2!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag2== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag3 = null ;
        int __result__tag3 = 0 ;

        if (__tag3 == null ){
            __tag3 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag3);
        }
        __tag3.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag3, parent);
        __tag3.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.UseAddressAsEntered", java.lang.String.class,"key"));
        _activeTag=__tag3;
        __result__tag3 = __tag3.doStartTag();

        if (__result__tag3!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag3== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag4 = null ;
        int __result__tag4 = 0 ;

        if (__tag4 == null ){
            __tag4 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag4);
        }
        __tag4.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag4, parent);
        __tag4.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.Commercial", java.lang.String.class,"key"));
        _activeTag=__tag4;
        __result__tag4 = __tag4.doStartTag();

        if (__result__tag4!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag4== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag5 = null ;
        int __result__tag5 = 0 ;

        if (__tag5 == null ){
            __tag5 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag5);
        }
        __tag5.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag5, parent);
        __tag5.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.Residential", java.lang.String.class,"key"));
        _activeTag=__tag5;
        __result__tag5 = __tag5.doStartTag();

        if (__result__tag5!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag5== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag6 = null ;
        int __result__tag6 = 0 ;

        if (__tag6 == null ){
            __tag6 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag6);
        }
        __tag6.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag6, parent);
        __tag6.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("addressChecker.text.UseOfIncorrectAddress", java.lang.String.class,"key"));
        _activeTag=__tag6;
        __result__tag6 = __tag6.doStartTag();

        if (__result__tag6!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag6== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag7 = null ;
        int __result__tag7 = 0 ;

        if (__tag7 == null ){
            __tag7 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag7);
        }
        __tag7.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag7, parent);
        __tag7.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.groundSpecificServices", java.lang.String.class,"key"));
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
        __tag8.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.groundSpecificServicesHelpRollOver", java.lang.String.class,"key"));
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
        __tag9.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.homeDeliverySpecificServices", java.lang.String.class,"key"));
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
        __tag10.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.ss.homeDeliverySpecificServicesHelpRollOver", java.lang.String.class,"key"));
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

    private boolean _jsp__tag14(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         com.fedex.framework.taglib.ModuleCollapsedTag __tag14 = null ;
        int __result__tag14 = 0 ;

        if (__tag14 == null ){
            __tag14 = new  com.fedex.framework.taglib.ModuleCollapsedTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag14);
        }
        __tag14.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag14, parent);
        _activeTag=__tag14;
        __result__tag14 = __tag14.doStartTag();

        if (__result__tag14!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag14== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class com.fedex.framework.taglib.ModuleCollapsedTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
            do {
                _bw.write(_wl_block102Bytes, _wl_block102);
                _bw.write(_wl_block1Bytes, _wl_block1);
                _bw.write(_wl_block1Bytes, _wl_block1);
                _bw.write(_wl_block1Bytes, _wl_block1);
                _bw.write(_wl_block103Bytes, _wl_block103);
            } while (__tag14.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
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

    private boolean _jsp__tag16(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag16 = null ;
        int __result__tag16 = 0 ;

        if (__tag16 == null ){
            __tag16 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag16);
        }
        __tag16.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag16, parent);
        __tag16.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.exportPermitNumber", java.lang.String.class,"key"));
        _activeTag=__tag16;
        __result__tag16 = __tag16.doStartTag();

        if (__result__tag16!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag16== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.html.TextTag __tag17 = null ;
        int __result__tag17 = 0 ;

        if (__tag17 == null ){
            __tag17 = new  org.apache.struts.taglib.html.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag17);
        }
        __tag17.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag17, parent);
        __tag17.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.exportPermitNumber", java.lang.String.class,"property"));
        __tag17.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.exportPermitNumber", java.lang.String.class,"styleId"));
        __tag17.setSize(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("16", java.lang.String.class,"size"));
        __tag17.setMaxlength(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("10", java.lang.String.class,"maxlength"));
        __tag17.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
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
         org.apache.struts.taglib.bean.MessageTag __tag18 = null ;
        int __result__tag18 = 0 ;

        if (__tag18 == null ){
            __tag18 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag18);
        }
        __tag18.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag18, parent);
        __tag18.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.exportPermitNumberNote", java.lang.String.class,"key"));
        _activeTag=__tag18;
        __result__tag18 = __tag18.doStartTag();

        if (__result__tag18!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag18== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag19 = null ;
        int __result__tag19 = 0 ;

        if (__tag19 == null ){
            __tag19 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag19);
        }
        __tag19.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag19, parent);
        __tag19.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.alertWithColon", java.lang.String.class,"key"));
        _activeTag=__tag19;
        __result__tag19 = __tag19.doStartTag();

        if (__result__tag19!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag19== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag20 = null ;
        int __result__tag20 = 0 ;

        if (__tag20 == null ){
            __tag20 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag20);
        }
        __tag20.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag20, parent);
        __tag20.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AGroupAlert", java.lang.String.class,"key"));
        _activeTag=__tag20;
        __result__tag20 = __tag20.doStartTag();

        if (__result__tag20!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag20== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag21 = null ;
        int __result__tag21 = 0 ;

        if (__tag21 == null ){
            __tag21 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag21);
        }
        __tag21.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag21, parent);
        __tag21.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13ANonGroupAlert", java.lang.String.class,"key"));
        _activeTag=__tag21;
        __result__tag21 = __tag21.doStartTag();

        if (__result__tag21!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag21== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jsp__tag22(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag22 = null ;
        int __result__tag22 = 0 ;

        if (__tag22 == null ){
            __tag22 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag22);
        }
        __tag22.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag22, parent);
        __tag22.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.alertWithColon", java.lang.String.class,"key"));
        _activeTag=__tag22;
        __result__tag22 = __tag22.doStartTag();

        if (__result__tag22!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag22== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag22.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag22);
            return true;
        }
        _activeTag=__tag22.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag22);
        __tag22.release();
        return false;
    }

    private boolean _jsp__tag23(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag23 = null ;
        int __result__tag23 = 0 ;

        if (__tag23 == null ){
            __tag23 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag23);
        }
        __tag23.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag23, parent);
        __tag23.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AOptionAlert", java.lang.String.class,"key"));
        _activeTag=__tag23;
        __result__tag23 = __tag23.doStartTag();

        if (__result__tag23!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag23== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag23.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag23);
            return true;
        }
        _activeTag=__tag23.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag23);
        __tag23.release();
        return false;
    }

    private boolean _jsp__tag24(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag24 = null ;
        int __result__tag24 = 0 ;

        if (__tag24 == null ){
            __tag24 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag24);
        }
        __tag24.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag24, parent);
        __tag24.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AMoreInformation", java.lang.String.class,"key"));
        __tag24.setArg0(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("<A href=\"javascript:;\" id=\"caExport.b13AMoreInfo\">", java.lang.String.class,"arg0"));
        __tag24.setArg1(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("</A>", java.lang.String.class,"arg1"));
        _activeTag=__tag24;
        __result__tag24 = __tag24.doStartTag();

        if (__result__tag24!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag24== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag24.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag24);
            return true;
        }
        _activeTag=__tag24.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag24);
        __tag24.release();
        return false;
    }

    private boolean _jsp__tag25(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag25 = null ;
        int __result__tag25 = 0 ;

        if (__tag25 == null ){
            __tag25 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag25);
        }
        __tag25.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag25, parent);
        __tag25.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AOptionSelect", java.lang.String.class,"key"));
        _activeTag=__tag25;
        __result__tag25 = __tag25.doStartTag();

        if (__result__tag25!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag25== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
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

    private boolean _jsp__tag26(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag26 = null ;
        int __result__tag26 = 0 ;

        if (__tag26 == null ){
            __tag26 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag26);
        }
        __tag26.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag26, parent);
        __tag26.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AOption", java.lang.String.class,"key"));
        _activeTag=__tag26;
        __result__tag26 = __tag26.doStartTag();

        if (__result__tag26!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag26== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
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

    private boolean _jsp__tag30(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.CheckboxTag __tag30 = null ;
        int __result__tag30 = 0 ;

        if (__tag30 == null ){
            __tag30 = new  org.apache.struts.taglib.html.CheckboxTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag30);
        }
        __tag30.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag30, parent);
        __tag30.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.saveB13AOption", java.lang.String.class,"property"));
        __tag30.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExport.saveB13A.checkbox", java.lang.String.class,"styleId"));
        __tag30.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
        __tag30.setStyleClass(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("contentsmall", java.lang.String.class,"styleClass"));
        _activeTag=__tag30;
        __result__tag30 = __tag30.doStartTag();

        if (__result__tag30!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            try {
                if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.pushBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                    __tag30.setBodyContent(( javax.servlet.jsp.tagext.BodyContent)out);
                    __tag30.doInitBody();
                }
                do {
                    _bw.write(_wl_block123Bytes, _wl_block123);

                    if (_jsp__tag31(request, response, pageContext, _activeTag, __tag30))
                     return true;
                    _bw.write(_wl_block124Bytes, _wl_block124);
                } while (__tag30.doAfterBody()== javax.servlet.jsp.tagext.IterationTag.EVAL_BODY_AGAIN);
            } finally {
                if (__result__tag30== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                    out = pageContext.popBody();
                    _bw = (weblogic.servlet.jsp.ByteWriter)out;
                }
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
         org.apache.struts.taglib.bean.MessageTag __tag31 = null ;
        int __result__tag31 = 0 ;

        if (__tag31 == null ){
            __tag31 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag31);
        }
        __tag31.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag31, parent);
        __tag31.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.saveB13Aforfutureshipments", java.lang.String.class,"key"));
        _activeTag=__tag31;
        __result__tag31 = __tag31.doStartTag();

        if (__result__tag31!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag31== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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

    private boolean _jsp__tag32(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag32 = null ;
        int __result__tag32 = 0 ;

        if (__tag32 == null ){
            __tag32 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag32);
        }
        __tag32.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag32, parent);
        __tag32.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AExemptionNumber", java.lang.String.class,"key"));
        _activeTag=__tag32;
        __result__tag32 = __tag32.doStartTag();

        if (__result__tag32!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag32== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag32.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag32);
            return true;
        }
        _activeTag=__tag32.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag32);
        __tag32.release();
        return false;
    }

    private boolean _jsp__tag33(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.html.TextTag __tag33 = null ;
        int __result__tag33 = 0 ;

        if (__tag33 == null ){
            __tag33 = new  org.apache.struts.taglib.html.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag33);
        }
        __tag33.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag33, parent);
        __tag33.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AExemptionNumber", java.lang.String.class,"property"));
        __tag33.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AExemptionNumber", java.lang.String.class,"styleId"));
        __tag33.setSize(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("4", java.lang.String.class,"size"));
        __tag33.setMaxlength(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("2", java.lang.String.class,"maxlength"));
        __tag33.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
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

    private boolean _jsp__tag34(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag34 = null ;
        int __result__tag34 = 0 ;

        if (__tag34 == null ){
            __tag34 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag34);
        }
        __tag34.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag34, parent);
        __tag34.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.note13A1", java.lang.String.class,"key"));
        _activeTag=__tag34;
        __result__tag34 = __tag34.doStartTag();

        if (__result__tag34!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag34== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
            }
        }
        if (__tag34.doEndTag()== javax.servlet.jsp.tagext.Tag.SKIP_PAGE){
            _activeTag = null;
            _releaseTags(pageContext, __tag34);
            return true;
        }
        _activeTag=__tag34.getParent();
        weblogic.servlet.jsp.DependencyInjectionHelper.preDestroy(pageContext, __tag34);
        __tag34.release();
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
        __tag35.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.note13A2", java.lang.String.class,"key"));
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
        __tag36.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13AAuthorizationCodeNumber", java.lang.String.class,"key"));
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
         org.apache.struts.taglib.html.TextTag __tag37 = null ;
        int __result__tag37 = 0 ;

        if (__tag37 == null ){
            __tag37 = new  org.apache.struts.taglib.html.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag37);
        }
        __tag37.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag37, parent);
        __tag37.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AAuthorizationCodeNumber", java.lang.String.class,"property"));
        __tag37.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13AAuthorizationCodeNumber", java.lang.String.class,"styleId"));
        __tag37.setSize(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("26", java.lang.String.class,"size"));
        __tag37.setMaxlength(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("23", java.lang.String.class,"maxlength"));
        __tag37.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
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
         org.apache.struts.taglib.bean.MessageTag __tag38 = null ;
        int __result__tag38 = 0 ;

        if (__tag38 == null ){
            __tag38 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag38);
        }
        __tag38.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag38, parent);
        __tag38.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.obtainB13AAuthorizationCode", java.lang.String.class,"key"));
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

    private boolean _jsp__tag39(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag activeTag, javax.servlet.jsp.tagext.JspTag parent) throws java.lang.Throwable
    {
        javax.servlet.jsp.tagext.JspTag _activeTag = activeTag;
        javax.servlet.jsp.JspWriter out = pageContext.getOut();
        weblogic.servlet.jsp.ByteWriter _bw = (weblogic.servlet.jsp.ByteWriter) out;
         org.apache.struts.taglib.bean.MessageTag __tag39 = null ;
        int __result__tag39 = 0 ;

        if (__tag39 == null ){
            __tag39 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag39);
        }
        __tag39.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag39, parent);
        __tag39.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.note13A3", java.lang.String.class,"key"));
        _activeTag=__tag39;
        __result__tag39 = __tag39.doStartTag();

        if (__result__tag39!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag39== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag40 = null ;
        int __result__tag40 = 0 ;

        if (__tag40 == null ){
            __tag40 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag40);
        }
        __tag40.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag40, parent);
        __tag40.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.B13ASummaryIDNumber", java.lang.String.class,"key"));
        _activeTag=__tag40;
        __result__tag40 = __tag40.doStartTag();

        if (__result__tag40!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag40== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.html.TextTag __tag41 = null ;
        int __result__tag41 = 0 ;

        if (__tag41 == null ){
            __tag41 = new  org.apache.struts.taglib.html.TextTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag41);
        }
        __tag41.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag41, parent);
        __tag41.setProperty(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13ASummaryIDNumber", java.lang.String.class,"property"));
        __tag41.setStyleId(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("caExportData.b13ASummaryIDNumber", java.lang.String.class,"styleId"));
        __tag41.setSize(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("10", java.lang.String.class,"size"));
        __tag41.setMaxlength(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("7", java.lang.String.class,"maxlength"));
        __tag41.setName(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("shipActionForm", java.lang.String.class,"name"));
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
         org.apache.struts.taglib.bean.MessageTag __tag42 = null ;
        int __result__tag42 = 0 ;

        if (__tag42 == null ){
            __tag42 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag42);
        }
        __tag42.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag42, parent);
        __tag42.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.note13A4", java.lang.String.class,"key"));
        _activeTag=__tag42;
        __result__tag42 = __tag42.doStartTag();

        if (__result__tag42!= javax.servlet.jsp.tagext.Tag.SKIP_BODY){
            if (__result__tag42== javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_BUFFERED) {
                 throw  new  javax.servlet.jsp.JspTagException("Since tag class org.apache.struts.taglib.bean.MessageTag does not implement BodyTag, it cannot return BodyTag.EVAL_BODY_BUFFERED");
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
         org.apache.struts.taglib.bean.MessageTag __tag43 = null ;
        int __result__tag43 = 0 ;

        if (__tag43 == null ){
            __tag43 = new  org.apache.struts.taglib.bean.MessageTag ();
            weblogic.servlet.jsp.DependencyInjectionHelper.inject(pageContext, __tag43);
        }
        __tag43.setPageContext(pageContext);
        weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.setParentForClassicTag(__tag43, parent);
        __tag43.setKey(( java.lang.String) weblogic.jsp.internal.jsp.utils.JspRuntimeUtils.convertType("text.note13A5", java.lang.String.class,"key"));
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
}
