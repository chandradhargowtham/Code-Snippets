var http= require('http');
var d=new Date();

http.createServer(function(request,response){
response.write("Today's Date is "+d.toString());
response.end('abc');
}).listen(8080);