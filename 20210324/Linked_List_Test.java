package linkedList;

public class Linked_List_Test {

	public static void main(String[] args) {
		LinkedList L = new LinkedList();
		System.out.println("(1) 공백 리스트에 노드 3개 삽입");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();
		System.out.println("(2) 수 노드 뒤 금 노드 삽입");
		ListNode pre = L.searchNode("수");
		if(pre == null)
			System.out.println("검색실패>>찾는 데이터 없음");
		else {
				L.insertMiddleNode(pre, "금");
				L.printList();
		}
		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();
		System.out.println("(4) 리스트 마지막 노드 삭제");
		L.deleteLastNode();
		L.printList();
		
		// TODO Auto-generated method stub

	}

}
