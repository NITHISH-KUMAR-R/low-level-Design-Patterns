package com.designpattern.lld.strategy.strategy2;

public class Client {

    public static void main(String[] args) {


        String htmlData = "<html><body><p> hello</p></body></html>";
        HTMLResponse html = new HTMLResponse();
        StrategyFormat responseFormat = new StrategyFormat(html);
        responseFormat.execute(htmlData);
        System.out.println();

        String xmlInput = "<user><name>John Doe</name><age>30</age><email>john@example.com</email></user>";
        responseFormat = new StrategyFormat(new XMLResponse());
        responseFormat.execute(xmlInput);
        System.out.println();
        String jsonInput = "{ \"name\": \"John Doe\", \"age\": 30, \"email\": \"john@example.com\" }";
        responseFormat = new StrategyFormat(new JSONResponse());
        responseFormat.execute(jsonInput);

        String xmlInput2 = "<user><name>John Doe</name><age>30</age><email>john@example.com</email></user>";
        String yamlInput = "name: John Doe\nage: 30\nemail: john@example.com";



    }
}
