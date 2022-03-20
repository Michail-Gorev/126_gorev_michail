public interface ListNode<T> {
    ListNode<T> getNext();
    ListNode<T> getPrev();
    void setNext(ListNode<T> next);
    void setPrev(ListNode<T> prev);
    void setData(ListNode<T> data);
    void setPrev(ListNode<T> prev);
}
