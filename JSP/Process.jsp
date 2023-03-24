<%
    int p = Integer.parseInt(request.getParameter("principal"));
    int t = Integer.parseInt(request.getParameter("time"));
    int r = Integer.parseInt(request.getParameter("rate"));

    out.println(p*t*r/100);
%>