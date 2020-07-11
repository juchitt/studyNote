HTTP(Hyper Text Transfer Protocol)<br>
======
HTTP는 Client가 Request를 하면 Server가 Response하는 단순한 구조를 가진 프로토콜이다.<br>
------
####Protocol: '통신규약'으로, 원거리 통신 장비사이에서 주고받는 양식과 규칙의 체계이다.<br> 
Http Request는 Client -> Server로 특정행동을 요청하는 행위이다.<br>

Http Request는 Request Line과, Request Header, Message Body로 구성된다.<br>
Request Line은 Http Method, Target, Protocol version으로 구성된다.<br>
ex) GET https://naver.com HTTP/1.1<br>
ex) POST https://naver.com HTTP/1.1<br>
GET방식의 경우 URL의 길이제한은 없지만 브라우저의 따라 범위가 다름. 수신한 서버는 길이가 길다고 판단할 경우 Error Code 414를 보낼 수 있다.<br>

1.Http Method.<br>
|제목|내용|설명|
|------|---|---|
|테스트1|테스트2|테스트3|
|테스트1|테스트2|테스트3|
|테스트1|테스트2|테스트3|
