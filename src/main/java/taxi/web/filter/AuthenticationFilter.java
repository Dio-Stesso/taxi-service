package taxi.web.filter;

import java.io.IOException;
import java.util.Set;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(urlPatterns = "/*")
public class AuthenticationFilter implements Filter {
    private static final Set<String> ALLOWED_URLS =
            Set.of("/login", "/register", "/", "/drivers/add");

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        HttpSession session = req.getSession();

        Long userId = (Long) session.getAttribute("driver_id");
        if (userId == null && ALLOWED_URLS.contains(req.getServletPath())) {
            chain.doFilter(req, resp);
            return;
        }
        if (userId == null) {
            resp.sendRedirect(req.getContextPath() + "/");
            return;
        }
        chain.doFilter(req, resp);
    }
}
