// 시작은 2*5배열에서
만약에 꽉 차면 4*5배열로 늘리고
6*5배열로 늘리기

isFull -> boolean -> 전부 다 차있으면 true / 안차있으면 false

isEmpty() -> 비어있으면 비어있는 index return / 안비어 있으면 -1 return -> int

increment -> 만약에 isfull일때 -> 배열 크기 증가시키기 -> void

srarch -> 특정 값이 들어오면 -> 특정값의 index 반환

modify -> 수정하기 -> 어떤 값을 어떻게 수정할껀지 -> 2개의 매개변수 들어오면 -> 수정 -> void -> (근데 같은 값이 2개 있을수도 있음 우선)

delete -> 특정값을 넣으면 -> 해당하는 값의 인덱스를 찾아서 -> 삭제 (예외) delete 하는 값이 두개가 될수도 있음

add (매개변수가 1개일때) -> int[] arr = new int[2][5]; 일때 => [i][j] 이면 i고정하고 j부터 넣어주기

add (매개변수가 2개 일때 오버로딩)->

main (main함수에서 객체 만들어 주고, 그 객체에서 입력받고, while 문 돌기)
