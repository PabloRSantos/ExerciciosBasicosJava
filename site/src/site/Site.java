
package site;


public class Site {

    
    public static void main(String[] args) {
      // <li><a href="#img1"><img src="imagens/1.png" class="min"></a></li>
    //}
    int a = 6;
    int b = 7;
    int c = 8;
    int d = 9;
    int e = 10;
   

    for (int i = 0; i < 83; i++){
        System.out.println("<ul class=\"imagens\">\n" +
"\n" +
"<li><a href=\"#img"+a+"\"><img src=\"imagens/"+a+".png\" class=\"min\"></a></li>\n" +
"<li><a href=\"#img"+b+"\"><img src=\"imagens/"+b+".png\" class=\"min\"></a></li>\n" +
"<li><a href=\"#img"+c+"\"><img src=\"imagens/"+c+".png\" class=\"min\"></a></li>\n" +
"<li><a href=\"#img"+d+"\"><img src=\"imagens/"+d+".png\" class=\"min\"></a></li>\n" +
"<li><a href=\"#img"+e+"\"><img src=\"imagens/"+e+".png\" class=\"min\"></a></li>\n" +
"\n</ul>");
        a+= 5;
        b+= 5;
        c+= 5;
        d+= 5;
        e+= 5;
       
   
                   }
}
}
