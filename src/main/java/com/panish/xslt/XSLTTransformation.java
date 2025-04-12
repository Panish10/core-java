package com.panish.xslt;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class XSLTTransformation {

    final String path = "src\\main\\resources\\xslt\\";

    public static void main(String[] args) {
        XSLTTransformation transformation = new XSLTTransformation();
        transformation.xmlToXml();
    }

    private void xmlToXml() {

        try {

            // Source XML file
            File inputFile = new File(path + "xml_input.xml");

            // XSLT stylesheet
            File xsltFile = new File(path + "xml2xml_transform.xslt");

            // Create a Source object for the XML file
            Source xmlSource = new StreamSource(inputFile);

            // Create a Source object for the XSLT stylesheet
            Source xsltSource = new StreamSource(xsltFile);

            // Create a Result object to hold the output
            Result result = new StreamResult(new File(path + "xml_output.xml"));

            // Create a TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            // Create a Transformer for the transformation
            Transformer transformer = transformerFactory.newTransformer(xsltSource);

            // Perform the transformation
            transformer.transform(xmlSource, result);

            System.out.println("Transformation complete. Output written to output.html");

            String output = new String(Files.readAllBytes(Paths.get(path + "xml_output.xml")), Charset.defaultCharset());
            System.out.println(output);
        } catch (TransformerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void xmlToHtml() {

        try {

            // Source XML file
            File inputFile = new File(path + "html_input.xml");

            // XSLT stylesheet
            File xsltFile = new File(path + "xml2html_transform.xslt");

            // Create a Source object for the XML file
            Source xmlSource = new StreamSource(inputFile);

            // Create a Source object for the XSLT stylesheet
            Source xsltSource = new StreamSource(xsltFile);

            // Create a Result object to hold the output
            Result result = new StreamResult(new File(path + "html_output.html"));

            // Create a TransformerFactory
            TransformerFactory transformerFactory = TransformerFactory.newInstance();

            // Create a Transformer for the transformation
            Transformer transformer = transformerFactory.newTransformer(xsltSource);

            // Perform the transformation
            transformer.transform(xmlSource, result);

            System.out.println("Transformation complete. Output written to output.html");

        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }
}
