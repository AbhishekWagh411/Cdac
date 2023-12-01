namespace WebApplication2.Models
{
    public class CustomMiddlewareDemo : IMiddleware
    {
        public async Task InvokeAsync(HttpContext context, RequestDelegate next)
        {
            await next(context);
            await context.Response.WriteAsync("Hello from Customer Middleware");
            
        }
    }
}
