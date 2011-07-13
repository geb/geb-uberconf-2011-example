import pages.*
import spock.lang.*
import geb.spock.*

import org.apache.pdfbox.util.PDFTextStripper
import org.apache.pdfbox.pdfparser.PDFParser
import org.apache.pdfbox.pdmodel.PDDocument

class ScrapePdfSpec extends GebReportingSpec {

    def "Check Geb is in the sessions pdf"() {
        given:
        to FrontPage

        expect:
        at FrontPage

        when:
        // downloadBytes() method makes a direct connection (via HttpUrlConnection), but assumes any cookies the 
        // real browser has, meaning that it will use the same application session that the browser being driven is.
        def pdfBytes = downloadBytes($("div.pdf a").@href)
        def pdfText = extractPdfText(pdfBytes)

        then:
        pdfText.contains "Session #126 @ Standley II : Functional Web Testing with Geb and Spock by Peter Niederwieser"
    }

    // Apache PDFBox code

    def extractPdfText(byte[] bytes) {
        def pdf = createPdf(bytes)
        def text = extractPdfText(pdf)
        pdf.close()
        text
    }

    def extractPdfText(PDDocument pdf) {
        new PDFTextStripper().getText(pdf)
    }

    PDDocument createPdf(byte[] bytes) {
        createPdf(new ByteArrayInputStream(bytes))
    }

    PDDocument createPdf(InputStream inputStream) {
        def parser = new PDFParser(inputStream)
        parser.parse()
        parser.getPDDocument()
    }

}