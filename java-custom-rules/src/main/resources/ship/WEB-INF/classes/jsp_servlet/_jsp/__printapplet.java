package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.fedex.fsm.ship.common.constants.AppConstants;
import java.util.*;
import java.util.Locale;
import org.apache.struts.Globals;
import org.apache.struts.util.*;
import com.fedex.fsm.ship.common.vo.user.UserProfileVO;
import com.fedex.fsm.ship.web.outbound.ShipActionForm;
import com.fedex.fsm.ship.web.label.LabelData;
import com.fedex.fsm.ship.web.util.WebConstants;
import com.fedex.fsm.ship.common.vo.PrinterType;
import com.fedex.fsm.ship.web.displayRules.DisplayRules;
import com.fedex.fsm.ship.web.component.country.Country;
import com.fedex.fsm.ship.web.util.ApplicationPropertyLoader;
import java.net.URLEncoder;
import com.fedex.fsm.ship.web.constants.AppIntegrationConstants;
import com.fedex.fsm.ship.web.util.LoggerFactory;

public final class __printapplet extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/PrintApplet.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 ="\r\n\r\n";
    private final static byte[]  _wl_block1Bytes = _getBytes( _wl_block1 );

    private static java.lang.String  _wl_block2 ="   \r\n\r\n\r\n<APPLET ARCHIVE=\"thermalapplet.jar\" CODE=\"com.fedex.oll.applet.MobileApplet\" WIDTH=10 HEIGHT=10 CODEBASE=\"";
    private final static byte[]  _wl_block2Bytes = _getBytes( _wl_block2 );

    private static java.lang.String  _wl_block3 ="\">\r\n\t<param name = \"printer_type\" value=\"";
    private final static byte[]  _wl_block3Bytes = _getBytes( _wl_block3 );

    private static java.lang.String  _wl_block4 ="\"/>\r\n\t";
    private final static byte[]  _wl_block4Bytes = _getBytes( _wl_block4 );

    private static java.lang.String  _wl_block5 ="\r\n\t \t\t<param name = \"item";
    private final static byte[]  _wl_block5Bytes = _getBytes( _wl_block5 );

    private static java.lang.String  _wl_block6 ="\" value=\"";
    private final static byte[]  _wl_block6Bytes = _getBytes( _wl_block6 );

    private static java.lang.String  _wl_block7 =";label";
    private final static byte[]  _wl_block7Bytes = _getBytes( _wl_block7 );

    private static java.lang.String  _wl_block8 =";";
    private final static byte[]  _wl_block8Bytes = _getBytes( _wl_block8 );

    private static java.lang.String  _wl_block9 ="\r\n\t</APPLET>\r\n";
    private final static byte[]  _wl_block9Bytes = _getBytes( _wl_block9 );

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
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block0Bytes, _wl_block0);

String hostName = ApplicationPropertyLoader.getInstance().getProperty("ShipHost");
String codeBase = AppIntegrationConstants.HTTP + hostName + ApplicationPropertyLoader.getInstance().getProperty("THERMAL_PRINTER_CODEBASE_PATH");;
if(request.isSecure()){
	codeBase = AppIntegrationConstants.HTTPS + hostName + ApplicationPropertyLoader.getInstance().getProperty("THERMAL_PRINTER_CODEBASE_PATH");
}
LoggerFactory.getLogger().info("codeBase ---> " + codeBase); 
List labelDataFromCache = null;
String printerType = "ZP";
ShipActionForm shipForm=((ShipActionForm)request.getAttribute("shipActionForm"));
String printRequestFrom = request.getParameter("printRequestFrom");
if(printRequestFrom != null && printRequestFrom.equals("thermalPrinterSetUp")){
	String testPrintMessage = request.getParameter("testPrintMessage");
	if(request.getParameter("printerType") != null && request.getParameter("printerType").equalsIgnoreCase(PrinterType.ZEBRA_THERMAL_LP2844.getCode())){
		printerType = "LP";
	}	
	if(testPrintMessage != null && !testPrintMessage.isEmpty()){
		labelDataFromCache = new ArrayList();
		labelDataFromCache.add(URLEncoder.encode(testPrintMessage, "UTF-8"));
	}
}else if(shipForm != null && shipForm.getLabelDisplay() != null){
	labelDataFromCache = shipForm.getLabelDisplay().getLabelDataFromCache();
	if(shipForm.getLabelDisplay().getPrinterTypeCode().equalsIgnoreCase(PrinterType.ZEBRA_THERMAL_LP2844.getCode())){
		printerType = "LP";
	}
}	
if (labelDataFromCache != null && !labelDataFromCache.isEmpty()){ 

            _bw.write(_wl_block2Bytes, _wl_block2);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf((codeBase)), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block3Bytes, _wl_block3);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(printerType ), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block4Bytes, _wl_block4);

		int counter = 1;
		String encodedLabel = null;
		java.util.Iterator iterator3 = labelDataFromCache.iterator(); 
		while(iterator3.hasNext()){ 
			encodedLabel = (String)iterator3.next();
			LoggerFactory.getLogger().info("encodedLabel ---> " + encodedLabel);
	
            _bw.write(_wl_block5Bytes, _wl_block5);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(counter), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block6Bytes, _wl_block6);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(counter), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block7Bytes, _wl_block7);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(counter), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block8Bytes, _wl_block8);
            out.print(_jsp_expressionInterceptor.intercept( String.valueOf(encodedLabel), pageContext, weblogic.servlet.jsp.ExpressionInterceptor.Type.Scripting));
            _bw.write(_wl_block4Bytes, _wl_block4);

			counter++;
		} 
	
            _bw.write(_wl_block9Bytes, _wl_block9);

	}

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
