package hometasks.gdk

// list all the directories in a given path
String dir = '/home/kateryna/test_file'
List hidden = []
new File(dir).eachFile { file ->

    if( file.isDirectory() ){
        println file.name
    }

    if( file.isHidden() ) {
        hidden << file.name
    }
}
println "Hidden dirs ${hidden}"


String test_file = '/home/kateryna/test_file'
new File(test_file).eachDir { subfolder ->
    println "Subfolder - ${subfolder} !!!"
}

def groovyCourseDir = new File('/home/kateryna/test_file')
println "Directory size ${groovyCourseDir.directorySize()} !!!"


// create a new directory
new File('/home/kateryna/test_file/dummy').mkdir()
new File('/home/kateryna/test_file/dummy').deleteDir()
// create a bunch of directories
new File('/home/kateryna/test_file/one/two/three').mkdirs()


// create a new file
def file = new File('/home/kateryna/test_file/dummy1.txt')
file.write("This is some new text \n")
// append
file.append("I am appending text...\n")
// or
new File('/home/kateryna/test_file/dummy2.txt').text = 'this is a one liner'

// readLines
println("Printing file lines: ")
List lines = file.readLines()
println lines
lines.each { line ->
     println line
}

// create a new file with a bunch of text and read it
 println new File('/home/kateryna/test_file/dummy1.txt').text

// list all the files in a directory
String dirGroovyStudying = '/home/kateryna/GIT/groovy-studying'
new File(dirGroovyStudying).eachFile { file1 ->
    // show all first
    if( file1.isFile() ){
        println file.name
    }
}

// eachFileRecurse
String groovyCourse = '/home/kateryna/GIT/groovy-studying'
new File(groovyCourse).eachFileRecurse { file2 ->
    // show all first
    if( file2.isFile() && file2.name != '.git' ){
        println file2.name
    }
}

// list only certain files from this directory
println('Printing groovy files !!!')
new File('.').eachFile { file3 ->
    if( file3.name.endsWith('.groovy') ) {
        println file3.name
    }
}
