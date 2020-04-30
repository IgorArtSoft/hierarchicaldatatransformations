The original purpose of this project was to address an issue called -
PDF3: Ensuring the correct tab and reading order in PDF documents for Web Content Accessibility Guidelines (WCAG).
For details look into those articles:
https://www.w3.org/TR/WCAG20-TECHS/pdf#PDF3
1.3.2 Meaningful Sequence: When the sequence in which content is presented affects its meaning, a correct reading sequence can be programmatically determined. (Level A)
https://www.w3.org/TR/UNDERSTANDING-WCAG20/content-structure-separation-sequence.html
Some internet articles use an “informal name” called “Logical Reading Order” instead of the official name.


Why the project is called hierarchicaldatatransformations?

From an implementation standpoint, this project includes source code files for very complicated custom sorting of XML files.
Once I started PDF accessibility compliance project I’ve realized that this project could be extended:
1. To include other hierarchical data format transformations, such as JSON, HTML, or COBOL data.
2. It applies to many other tasks and not only to accessibility.
3. Other developers are encouraged to contribute to the project. This way we will have a common reusable code in one place. And you can quickly prototype it in other situations.

Background details of the “Reading Order in PDF documents” issue.

Some organizations only concern with the HTML portion of AODA compliance, but it's not enough.
People, who can't read online reports, need to convey a meaning of PDF online report by hearing it’s content instead.
So for them it's critically important that the information from PDF file must be in Custom Logical Reading Order.
PDF file could be a bank statement, or a bill from an online retailer order or any government-issued document. 
And what if a self-isolated person with poor vision gets this document? He can’t read it visually. 
A speech reader program on his/her computer could read PDF file out loud. 
Really it’s a part of essential software services.
 
Let’s look realistically into the near future. Coronavirus will not disappear soon.
So to prevent the virus spread, many people will rely more and more on online government, banking, retail, insurance, and financial sector activities. 
Plus the ability to hear the content of a file, while doing something else, is a very convenient time saver for everyone.
So the solution proposed in this project will have huge business value for all of us.

For more details read complimentary file located at documentation\ProjectDetailedExplanation.docx

The project uses Java 8. It’s a standalone application.
Dependencies: Java JDK 8+, git must-have. Eclipse is recommended.
Project URL:
https://github.com/IgorArtSoft/hierarchicaldatatransformations 

Version 1.
Repository owner and author of this idea: admin, Igor Artimenko.

