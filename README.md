# HuntAnimal
- 2021 년 spring semester
- 객체지향프로그래밍

1.	목적 및 시나리오
-	이 프로그램의 목적은 개발자가 어느 정도 객체지향프로그래밍 수업을 잘 활용하는지를 확인하기 위함이다. TTS와 Window Builder를 포함해 기본적인 상속, 객체 생성 및 함수 활용을 제대로 수행할 수 있는지 확인할 수 있는 적절한 프로그래밍이다.

-	시나리오
1)	시작: 배틀 게임을 시작하기 전 시작 여부를 확인한다. Start를 누르면 시작 윈도우는 사라진다. (setVisible 함수를 이용)
2)	배틀 형식: 깜고(검은고양이)와 흰냥(하얀고양이)의 1 대 1 싸움 상황이다. 공격하기 버튼을 누르면 (액션리스너) 상대에게 데미지(50)를 입히게 된다. 공격할 때 음성으로 고양이 울음 소리가 나며 각 고양이마다 울음소리는 상이하다. 가장 먼저 hp가 0이 된 쪽이 패배하며, 한 쪽이 패배한 때에 공격하기 버튼은 더 이상 눌리지 않고, 엔딩 화면이 나타난다.
3)	엔딩: 그림판으로 그린 이미지를 띄운다.

2.	Player 와 Weapon 클래스 다이어그램
  ![image](https://user-images.githubusercontent.com/96706954/156947285-33731762-6444-4aac-b234-63198f6dffac.png)

3.	실행화면
 
 ![image](https://user-images.githubusercontent.com/96706954/156947295-248ec1d7-bf85-493d-8dfa-7cf67cfca4a3.png)

(시작화면)
 ![image](https://user-images.githubusercontent.com/96706954/156947304-169366bd-9c37-4ff5-9977-278ce6ae4ff1.png)

(플레이화면-1)
 ![image](https://user-images.githubusercontent.com/96706954/156947309-fcaaec3a-fd55-4b89-b707-856580150d5f.png)

(플레이화면-2)
 ![image](https://user-images.githubusercontent.com/96706954/156947315-019b0970-0f72-4d8b-92a0-93e637af69a5.png)

(플레이 시 콘솔 화면)
 ![image](https://user-images.githubusercontent.com/96706954/156947317-8b952715-d15c-428d-9700-e522128867f5.png)

(엔딩화면)
![image](https://user-images.githubusercontent.com/96706954/156947322-2a8cd62f-9a6d-4334-988b-3720837a5ac8.png)

(save 버튼으로 파일 저장)
 
(hp가 0이 되면 공격 버튼이 눌리지 않게 된다.)
