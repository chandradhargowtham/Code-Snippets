var http = require('http');

http.createServer(function(request,response){   
response.end('Hello World Node First Server');
}).listen(8080);
