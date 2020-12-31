package hometasks.gdk.templates

import groovy.text.SimpleTemplateEngine
import groovy.text.Template

/*
    Template Placeholders

    $variable         Inserts the value of the variable into the text
    ${groovycode}     Evaluates single line groovy code and inserts the result into the text
    <%=groovycode%>   Evaluate the groovy code and insert the result into the text
    <%groovycode%>    Evaluate the groovy code

 */

SimpleTemplateEngine engine = new SimpleTemplateEngine(true)
Template template = engine.createTemplate( new File('dynamic-email.txt') )

// show error if properties are missing
Map bindings = [
        firstName: "Kate",
        lastName: "Tester",
        commits: 100,
        repositories: [
                [name:'Scc Consumer',url:'https://github.com/KaterynaPodobraya/scc-consumer'],
                [name:'Rest Assured Examples',url:'https://github.com/KaterynaPodobraya/RestAssuredExamples']
        ]
]

println template.make(bindings)

