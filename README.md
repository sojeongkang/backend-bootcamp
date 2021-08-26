# sw-spring

## week 1


### 1. 산출물 관리

- **Github 계정 및 해당 Repository 생성**
    - Github 계정 생성 > 기존 Github 계정 재사용 (완료)
    - Repository 생성 (완료)

### 2. 개발환경 셋팅

- **JDK, Eclipse, Tomcat 환경 설정**
    - JDK 1.8 설치 및 환경설정 (완료)
    - Eclipse (2019-06) 설치 및 환경설정 (완료)
    - Tomcat 9.0 설치 및 환경설정 (완료)
- **MariaDB 설치**
    - 로컬 하드드라이브에 MariaDB 설치 (완료)
        - 포트 3360으로 설정 (MySQL 포트 3306 사용 중)
    - Database IDE 설치 > MariaDB호환 가능한 MySQL Workbench 8.0 설치 (완료)
- **샘플 데이터 생성**
    - theater 스키마(Default Schema) 생성 (완료)
    - movie 테이블 생성 및 샘플 데이터 생성 (완료)
- **스프링과 스프링 부트 환경 설정 및 검토**
    - 스프링 5.2.8 환경설정
        - STS 플러그인 설치 > Spring Tools 3 (3.9.11 RELEASE) 설치 (완료)
        - Maven 의존 라이브러리 버전 관리 > 최신 버전 5.2.8로 업그레이드 (완료)
        - 디팬던시 추가 > MariaDB, MyBatis, log4j 디팬던시 추가 (완료)
        - DB 연결정보 설정 (완료)
        - 스프링 MVC  디자인 패턴 구현
            - Service, DAO, VO 객체 구현 (완료)
            - Controller 객체 구현 (완료)
            - JSP 파일 생성 (완료)
        - 클라이언트 화면에 movie 테이블 출력 (완료)
        - [이슈] root-context.xml 에서 `<context:component-scan>` 태그 오류
            - <bean> 루트 엘리먼트에 xml 스키마 정보 추가 (해결)
    - 스프링 부트 환경설정 (예정)

<br>

## week 2


### 1. 기반 지식 이해

- HTTP 프로토콜
    - HTTP의 정의 및 특성
    - HTTP 요청/응답 메시지 구조 
- REST 아키텍쳐
    - REST 아키텍쳐의 6가지 특성 
    - REST의 3가지 구성 요소 
    - REST 사용 이유 및 장/단점 

### 2. 방문자 통계 API 가이드 문서 작성

- **문서 정보 및 서비스 개요 작성**
    - 문서 정보 작성 (완료)
    - 서비스 개요 작성 (완료)
- **API 상세 및 결과 코드표 작성**
    - 일자 별 접속자 수 API (완료)
    - 하루 평균 로그인 수 API (완료)
    - 휴일을 제외한 로그인 수 API (완료)
    - 부서 별 로그인 수 API (완료)
    - 결과 코드표 작성 (완료)
- **URI 설계 검토**
    - URI가 소문자로 작성됨 (확인)
    - URI 마지막 문자에 슬래시(/) 포함하지 않음 (확인)
    - URI에 언더바(_) 포함하지 않음 (확인)
    - Resource가 명사로 표현됨 (확인)

<br>

## week 3

### 테스트 통계 API 구현

- **샘플 데이터 생성**
    - `statistc` 스키마 생성 (완료)
    - 요청 정보, 요청 코드 및 사용자 테이블 생성 (완료)
    - 샘플 데이터 생성 (완료)
    → 추후 랜덤 데이터 추가 생성 예정
- **스프링 부트 환경설정**
    - [Spring.io](http://spring.io) 활용하여 라이브러리 의존성 설정 (완료)
    ⇒ Tomcat, MariaDB Driver, JSTL 라이브러리 의존성 수동 추가
    - 환경 설정 파일 작성 (완료)
        - DB 환경 설정
        - View Resolver 설정
        - Server 설정
- **RestController를 활용하여 년도별 총 로그인 수 API 구현**
    - Service, Mapper, VO 생성 (완료)
        - DAO 대신 Mapper 인터페이스 활용
    - Mapper.xml 작성 (완료)
        - MyBatis 동적 쿼리 사용
        - SUBSTR() 함수 활용하여 년도별 데이터 추출
    - Controller 구현 (완료)
        - RestController를 활용하여 응답 바디 JSON 형태로 리턴

