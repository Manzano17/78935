using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Hosting;
using Microsoft.AspNetCore.Http;
using Microsoft.Extensions.DependencyInjection;

// Comente estas 2 lineas ya que me mandaba error a la hora e ejecutarlo, pero los servicios funcionan perfectamente.
// using WSDL.CalculadoraServicio;
// using WSDL.ICalculadoraServicio;

using SoapCore;
using Microsoft.Extensions.DependencyInjection.Extensions;
namespace soap_test
{
    public class Startup
    {
        // This method gets called by the runtime. Use this method to add services to the container.
        // For more information on how to configure your application, visit https://go.microsoft.com/fwlink/?LinkID=398940
        public void ConfigureServices(IServiceCollection services)
        {
            services.AddSingleton<ICalculadoraServicio, CalculadoraServicio>();  
            services.AddMvc(); 
        }
        // This method gets called by the runtime. Use this method to configure the HTTP request pipeline.
        public void Configure(IApplicationBuilder app, Microsoft.AspNetCore.Hosting.IWebHostEnvironment env)
        {
            if (env.IsDevelopment())
            {
                app.UseDeveloperExceptionPage();
                app.UseSoapEndpoint<ICalculadoraServicio>("/CalculadoraServicio.asmx", new SoapEncoderOptions(), SoapSerializer.XmlSerializer);
            }

            app.Run(async (context) =>
            {
                await context.Response.WriteAsync("<a href='/CalculadoraServicio.asmx'>Dale click aqui para llevarte al WSDL</a>");
            });
        }
    }
}


