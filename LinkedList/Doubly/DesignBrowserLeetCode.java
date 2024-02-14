package LinkedList.Doubly;

public class DesignBrowserLeetCode {
    class Node {
        String url;
        Node next;
        Node prev;
        Node(){

        }
        Node (String url) {
            this.url = url;
        }
    }
    Node head;
    Node tail;
    Node currentPage;

    public DesignBrowserLeetCode(String homepage) {
        head = new Node(homepage);
        tail = head;
        currentPage = head;
    }

    public void visit(String url) {
        Node page = new Node(url);
        currentPage.next = page;
        page.prev = currentPage;
        currentPage = page;
        tail = page;
    }

    public String back(int steps) {
        while(steps > 0){
            if(currentPage == head){
                return currentPage.url;
            }
            currentPage = currentPage.prev;
            steps--;
        }
        return currentPage.url;
    }

    public String forward(int steps) {
        while(steps > 0){
            if(currentPage == tail){
                return currentPage.url;
            }
            currentPage = currentPage.next;
            steps--;
        }
        return currentPage.url;
    }
}
