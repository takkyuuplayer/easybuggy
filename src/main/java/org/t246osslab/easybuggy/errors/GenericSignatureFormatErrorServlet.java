package org.t246osslab.easybuggy.errors;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/gsfe" })
public class GenericSignatureFormatErrorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        final TestClass<String> testClass1 = new TestClass<String>();
        TestClass<?> testClass2 = testClass1;
        testClass2.new TestInnerClass() {
        }.getClass().getGenericSuperclass();
    }

    class TestClass<T> {
        public class TestInnerClass {
        }
    }
}
