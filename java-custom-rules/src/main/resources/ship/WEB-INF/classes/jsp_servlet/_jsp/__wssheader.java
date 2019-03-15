package jsp_servlet._jsp;

import java.lang.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class __wssheader extends  weblogic.servlet.jsp.JspBase  implements weblogic.servlet.jsp.StaleIndicator {

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
        if (sci.isResourceStale("/jsp/WSSHeader.jsp", 1550053022000L ,"12.1.3.0.0","GMT0")) return true;
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

    private static java.lang.String  _wl_block1 ="\r\n<script language=\"JavaScript\" type=\"text/javascript\">\r\nvar _hbEC=0,_hbE=new Array;function _hbEvent(a,b){b=_hbE[_hbEC++]=new Object();b._N=a;b._C=0;return b;}\r\nvar hbx=_hbEvent(\"pv\");hbx.vpc=\"HBX0100u\";hbx.gn=\"ehg.fedex.com\";\r\nvar wsscbid = getCookie(\"fdx_cbid\");\r\nvar wsslogin = getCookie(\"fdx_login\");\r\nif (wsscbid == \"undefined\"){\twsscbid=\"\";}\r\nif (wsslogin == \"undefined\"){ wsslogin=\"\";}\r\nvar wssloc = new String(window.location);\r\nvar wsshost = wssloc.replace(/http(s)?:\\/\\/((.*\\.)?fedex\\.com)\\/.*/, \"$2\");\r\nif ((wsshost == \'fedex.com\') || (wsshost == \'www.fedex.com\')){hbx.acct=\"DM53091636DS;DM540225I9WM;DM5402255PDW \";}\r\nelse if (wssloc.match(/kinkos\\.com/i)){hbx.acct=\"DM53091636DS;DM540225I9WM;DM540225DEEA\";}\r\nelse {hbx.acct=\"DM530909CMEW;DM54022548EE;DM540225AJMD \";}\r\nhbx.pn=\"PUT+PAGE+NAME+HERE\";\r\nhbx.mlc=\"CONTENT+CATEGORY\";\r\nhbx.pndef=\"title\";\r\nhbx.ctdef=\"full\";\r\nhbx.fv=\"\";\r\nhbx.lt=\"auto\";\r\nhbx.dlf=\"n\";\r\nhbx.dft=\"n\";\r\nhbx.elf=\"n\";\r\nhbx.seg=\"\";\r\nhbx.fnl=\"\";\r\nhbx.cmp=\"\";\r\nhbx.cmpn=\"\";\r\nhbx.dcmp=\"\";\r\nhbx.dcmpn=\"\";\r\nhbx.dcmpe=\"\";\r\nhbx.dcmpre=\"\";\r\nhbx.hra=\"\";\r\nhbx.hqsr=\"\";\r\nhbx.hqsp=\"\";\r\nhbx.hlt=\"\";\r\nhbx.hla=\"\";\r\nhbx.gp=\"\";\r\nhbx.gpn=\"\";\r\nhbx.hcn=\"\";\r\nhbx.hcv=\"\";\r\nhbx.cp=\"null\";\r\nhbx.cpd=\"\";\r\nhbx.ci=wsscbid+\"-\"+wsslogin;\r\nhbx.hc1=\"\";\r\nhbx.hc2=\"\";\r\nhbx.hc3=\"\";\r\nhbx.hc4=\"\";\r\nhbx.hrf=\"\";\r\nhbx.pec=\"\";\r\nfunction getCookie(Name) {\r\nvar search = Name + \"=\"\r\nif (document.cookie.length > 0){offset = document.cookie.indexOf(search)\r\nif (offset != -1) {offset += search.length\r\nend = document.cookie.indexOf(\";\", offset)\r\nif (end == -1)end = document.cookie.length\r\nreturn unescape(document.cookie.substring(offset, end))}}}\r\n</script>\r\n";
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

String wssEnableHeader = (String) getServletConfig().getServletContext().getAttribute("WSSEnable");
wssEnableHeader = "Y";
if ("Y".equals(wssEnableHeader))
{

            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block0Bytes, _wl_block0);
            _bw.write(_wl_block1Bytes, _wl_block1);
            _bw.write(_wl_block0Bytes, _wl_block0);

}

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
