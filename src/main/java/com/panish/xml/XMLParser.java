package com.panish.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.*;
import java.io.IOException;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XMLParser {

    final String path = "src\\main\\resources\\textfiles\\";
    public static void main(String[] args) {
        try {
            XMLParser obj = new XMLParser();
            obj.example3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void example1() throws ParserConfigurationException, IOException, SAXException, URISyntaxException {

        String xmlString = readFile("example1.xm");

        // Get tht root element
        Element root = getDocument(xmlString).getDocumentElement();
        System.out.println("Root element: " + root.getNodeName());

        // Get all child nodes
        NodeList nodeList = root.getChildNodes();

        // Loop through the nodes and print the content
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                System.out.println("Node name:" + element.getNodeName() + ", Content: "+ element.getTextContent());

            }
        }
    }

    // using xpath
    private void example2() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        String xmlString = readFile("example2.xml");
        String expression = "/PostRqType/MsgItem/MsgId";

        XPath xPath = XPathFactory.newInstance().newXPath();
        XPathExpression pathExpression = xPath.compile(expression);
        String msg = pathExpression.evaluate(getDocument(xmlString), XPathConstants.STRING).toString();

        System.out.println("msg: " + msg);
    }

    // using xpath with xml having : in tag
    private void example3() throws ParserConfigurationException, IOException, SAXException, XPathExpressionException {

        String xmlString = readFile("example3.xml");
        String expression = "/PostRqType/*[local-name()='MsgItem']/*[local-name()='MsgId']";
        //String expression = "//*[local-name()='MsgId']";

        XPath xPath = XPathFactory.newInstance().newXPath();
        XPathExpression pathExpression = xPath.compile(expression);
        Node node = (Node) pathExpression.evaluate(getDocument(xmlString), XPathConstants.NODE);

        if (node != null) {
            System.out.println("MsgId: " + node.getTextContent());
        } else {
            System.out.println("MsgId not found");
        }
    }

    private Document getDocument(String xmlString) throws ParserConfigurationException, IOException, SAXException {

        // Create a DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Use the factory t create a DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Parse the XML string and get the cocument
        Document document = builder.parse(new InputSource(new StringReader(xmlString)));

        // Normalize the XML structure
        document.getDocumentElement().normalize();
        return document;
    }

    private String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path + fileName)), Charset.defaultCharset());
    }
}
