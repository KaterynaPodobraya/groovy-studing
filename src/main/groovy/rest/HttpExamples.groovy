package rest

// https://www.codota.com/code/java/classes/java.net.HttpURLConnection
def postmanGet = new URL('https://postman-echo.com/get')
def getConnection = postmanGet.openConnection() as HttpURLConnection
getConnection.requestMethod = 'GET'
getConnection.setDoInput(true)

assert getConnection.responseCode == 200
println getConnection.getResponseMessage()
println getConnection.getContentType()

InputStream inputStream = getConnection.getInputStream()
println inputStream.getText()
inputStream.close();
println 'Postman end'

// GET
def get = new URL("https://httpbin.org/get")
        .openConnection() as HttpURLConnection
def getRC = get.getResponseCode();
println(getRC);
if(getRC == 200) {
    println(get.getInputStream().getText());
}
println 'Httpbin end'

// POST
def post = (HttpURLConnection) new URL("https://httpbin.org/post")
        .openConnection() as HttpURLConnection
def message = '{"message":"this is a message"}'
post.setRequestMethod("POST")
post.setDoOutput(true)
post.setRequestProperty("Content-Type", "application/json")
post.getOutputStream()
        .write(message.getBytes("UTF-8"));
def postRC = post.getResponseCode();
println(postRC);
if(postRC == 200) {
    println(post.getInputStream().getText());
}





