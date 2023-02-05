# :pushpin: 맘스터치 키오스크
>맘스터치 키오스크의 ui, 기능구현  

</br>

## 1. 제작 기간 & 참여 인원
- 2022년 12월 06일 ~ 2023년 01월 6일
- 팀 프로젝트(5명)

</br>

## 2. 사용 기술
#### `Stack`
  - Java 17
  - Oracle SQL 
</br>

## 3. ERD 설계
![image](https://user-images.githubusercontent.com/118063903/216823136-c9d98891-aff9-4b40-8923-1d74d5f5fe7b.png)


## 4. 기능
전제적인 ui는 JavaSwing으로 구현하였다 
<details>
<summary><b>기능 설명 펼치기</b></summary>
<div markdown="1">

### 4.1. 첫페이지
<img src="https://user-images.githubusercontent.com/118063903/216823650-7726080c-dfad-48a0-95e3-63fe29381ae2.png" width="300" height="500"/><br>
사용자는 포장 또는 매장이용 버튼을 선택할수있다

### 4.2. 메뉴 선택
<img src="https://user-images.githubusercontent.com/118063903/216823985-ebc21d11-a76d-401c-a52d-34c3ead7b6ac.png" width="400" height="600"/>
<img src="https://user-images.githubusercontent.com/118063903/216824120-899b6bdf-3397-4095-974d-ccbe34120cbe.png" width="400" height="600"/><br>
메뉴 카테고리와 각 카테고리별 메뉴들을 배치

### 4.3. 장바구니
<img src="https://user-images.githubusercontent.com/118063903/216824299-86867718-38fa-485f-b1da-89a1167d9b6f.png" width="400" height="600"/><br>
선택한 메뉴의 수량과 옵션을 선택하여 장바구니에 전달 , 세부옵션을 추가하여 장바구니에 추가<br>
<img src="https://user-images.githubusercontent.com/118063903/216824339-110e0391-8adc-40f0-bfbe-f6f2769d630c.png" width="400" height="600"/><br>
장바구니에 메뉴 추가 및 삭제 시 변동된 정보를 다시 출력<br>

### 4.4. 결제
<img src="https://user-images.githubusercontent.com/118063903/216824592-9ec4e4aa-dd4d-405a-8ff4-cca025512acb.png" width="1000" height="650"/><br>
결제 후 결제내역을 Database에 전송

 ### 4.5. 결제 후
<img src="https://user-images.githubusercontent.com/118063903/216824833-16ea8e53-535e-4104-bc47-7bc624d8fb35.png" width="1000" height="650"/><br>
결제 완료하면 대기번호 창이 뜨고 7초 후, 첫 화면으로 돌아감<br>

간단한 디자인 툴로 레퍼런스 이미지를 정하고 <br>
팀원들과 DB 정규화를 진행한후 Java Swing을 사용하여 <br>
JPanel,JFrame, JButton등의 위치를 잡고 각 버튼의 기능들과 
패널의 기능을 구현하였다


</div>
</details>

</br>

## 5. 프로젝트 진행과정
프로젝트 진행 과정

1주 차에는 팀원들과의 회의, 각자의 역할 분담을 진행했고

2주 차에는 DB 설계와 이미지화

3주 차에는 각자 담당했던 기능과 이미지의 코드들을 합쳤고

4주 차에는 코드 디버깅, 발표 준비를 진행


## 6. 회고 / 느낀점

첫 프로젝트라 미숙한 점이 많았습니다.

프로젝트가 처음이라 팀원 간에 역할 분담이 힘들었던 점<br>
DB 정규화를 하는 과정에서 기본 키 외래키를 어떻게 사용할지 계획했지만
프로젝트 중간중간 기본기와 외래키를 수정하여야 했던 점<br>
객체지향이라는 개념을 이해하고 사용하는 과정에서 어떻게 Class를 나눠야 할지에 대한 어려움<br>
생소한 Window Builder를 사용하기 위해 고민했던 점<br>

프로젝트를 거치면서 이러한 문제들을 마주쳤지만<br>
팀원들 간의 역할 분담은 주도적인 소통을 통하여 개선점을 찾고<br>
DB 정규화의 문제를 해결하면서 DB에 대한 심도 깊은 공부를 할 수 있었고<br>
버튼과 패널들의 Class를 나누면서 객체지향을 어떻게 나누고 사용해야 할지를 공부했습니다<br>

프로젝트를 하면서<br>

인생 처음으로 하나의 프로그램을 팀원들과 함께 완성할 수 있었습니다.<br>
내가 공부했던 개념들을 구현하는 과정에서 많은 오류와 몰랐었던 기능들이 있었고<br>
그냥 개념만 아는 것과 A부터 Z까지 직접 만들어보는 것은 정말 하늘과 땅의 차이라는 것을 깨달았습니다.<br>

팀원들과 함께 DB를 설계하고 프로그램을 개발할 때는 내가 생각해낸 코드와 구글링한 코드를 사용하기 때문에
훨씬 많은 문제와 마주해야 했습니다.<br>

그리고 그 문제들을 해결하는 과정에서 제대로 이해하지 못하고 있던 개념들을 발견할 수 있었고,<br>
밤낮없이 고민하고 헤매다가 문제를 해결했을 때는 개발의 참 재미를 느낄 수 있었습니다.<br>

프로젝트를 하기 전까지는 무작정 어떠한 일을 만드는 것이 개발이라고 생각했다면<br>
지금은 문제들을 해결하는 것이 개발의 참 의미라는 것이라고 정의하게 되었습니다.<br>








 



 
