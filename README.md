Spring Tutorial 21st

CEOS Back-end 21st Spring Tutorial Project

시작하기 앞서...

Spring도 Java도 처음 접하는 입장에서 시행착오를 겪으며 배운 내용을 정리했습니다.
별의별 걸 다 적었다고 느끼실 수도 있지만... 자라나는 새싹을 본다는 마음으로 봐주세용.

1. 서버(애플리케이션) 실행

./gradlew bootRun

bootRun 실행 시 SpringApplication.run()을 호출하여 @SpringBootApplication이 붙은 main 클래스를 실행합니다.


2. 서버 실행 확인

브라우저나 curl을 통해 확인 가능

3. 의존성 추가 및 확인

./gradlew dependencies

dependencies 수정했다면 꼭 ./gradlew build --refresh-dependencies 하기

이거 안 해서 Can't resolve 에러 많이 만났습니다...

4. 어노테이션이란?

어노테이션(Annotation)은 Java 코드에 추가적인 정보를 제공하는 특수한 기호입니다. @로 시작하며, 코드의 의미를 설명하고 특정 기능을 자동으로 수행할 수 있도록 도와줍니다.

예제:

@RestController // REST API를 처리하는 컨트롤러 선언
@GetMapping("/") // HTTP GET 요청을 특정 메서드에 매핑

5. 몰랐던 개념 정리

인터페이스 : 클래스가 구현해야 할 메서드의 틀을 정의하는 것 (규칙 정하기)

빈(Bean) : Spring이 관리하는 객체

Spring 컨테이너 : 빈들을 생성하고 의존성을 자동으로 주입하는 공간

static : 변수나 메서드가 클래스 자체에 속하며, 객체를 생성하지 않고도 사용 가능

//빈이랑 컨테이너에 대해 더 찾아봤는데 생성, 소멸... 등등 잘 와닿지 않는 내용이 많았습니다.
추가적으로 더 공부해보아야 할 것 같습니다.

6. 단위 테스트(Unit Test)

**단위 테스트(Unit Test)**는 코드의 가장 작은 단위(메서드, 클래스)를 독립적으로 테스트하는 것을 의미합니다.

7. 데이터베이스

Spring Boot 데이터 계층 구성

Domain : 모델 (Entity)

Repository : 데이터 저장소 (JPA, MyBatis 등) DB에서 데이터 가져옴

Service : 로직 처리 , 실제 로직 처리

Controller : REST API 제공 => 요청 받고 응답 반환

//Service와 Controller의 차이 => 데이터베이스 할 때 둘이 비슷하게 생겨서 뭔 차인지 싶어서 찾아보았습니다.
Service가 로직을 처리하는 핵심, Controller는 요청받고 그 요청을 Service에게 전달하고 응답을 보내는 역할이라고 하더군요.

TMI:

마지막에 테이블 생성이 안 돼서 고생함. 알고 보니 Test 엔티티와 관련된 클래스들이 Application과 같은 패키지에 있어야 했음. 

느낀 점: Java 같은 객체지향언어가 처음인데 진짜 다 클래스로 나타내더라고요.
신기했습니다. 아직 Java를 잘 몰라서 모든 코드를 완전 이해한 것은 아니지만 지금부터 차근차근 더 노력해보겠습니다.
