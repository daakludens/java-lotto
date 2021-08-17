## 공통 프로그래밍 요구사항
* indent(들여쓰기) depth를 2단계에서 1단계로 줄여라.
* depth의 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
* 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
* method가 한 가지 일만 하도록 최대한 작게 만들어라.
* else를 사용하지 마라.

# 1단계 문자열 계산기 
## 기능 요구사항
* 빈 문자열 또는 null 값을 입력할 경우 0을 반환해야 한다.(예 : “” => 0, null => 0)
* 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다.(예 : “1”)
* 숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)
* 구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)
* “//”와 “\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\n1;2;3” => 6)
* 음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)

# 2단계 로또(자동)
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 프로그래밍 요구사항
* 규칙 3: 모든 원시값과 문자열을 포장한다.
* 규칙 5: 줄여쓰지 않는다(축약 금지).
* 예외 처리를 통해 에러가 발생하지 않도록 한다.

## 힌트
* 로또 자동 생성은 Collections.shuffle() 메소드 활용한다.
* Collections.sort() 메소드를 활용해 정렬 가능하다.
* ArrayList의 contains() 메소드를 활용하면 어떤 값이 존재하는지 유무를 판단할 수 있다.
* 규칙 3: 모든 원시값과 문자열을 포장한다.
    * 로또 숫자 하나는 int 타입이다. 이 숫자 하나를 추상화한 LottoNo 객체를 추가해 구현한다.
* 예외 처리를 통해 에러가 발생하지 않도록 한다.
    * 사용자가 잘못된 값을 입력했을 때 java exception으로 에러 처리를 한다.
    * java8에 추가된 Optional을 적용해 NullPointerException이 발생하지 않도록 한다.
    
## To Do List
* 로또 구입금액을 입력받는다.
* 구입금액 유효성 검사를 한다.
* 구입금액으로 구매 가능한 갯수를 리턴한다.
* 수동으로 구매할 로또 수를 입력한다.
* 수동으로 구매할 로또 수가 1이상일때 구매할 번호를 입력한다.
* 구입 갯수만큼 로또를 생성한다.
* 구매한 로또 정보를 출력한다.
* 당첨 번호를 입력받아 당첨 로또를 생성한다.
* 보너스 번호를 입력받는다.(당첨 로또에 추가한다.)
* 당첨 결과를 판별한다
* 당첨 결과에 따라 수익금을 더한다.
* 당첨 통계를 출력한다.
* 수익률을 출력한다.
