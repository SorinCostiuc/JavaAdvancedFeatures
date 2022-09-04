package colectii.lista_inlantuita_manuala;

///////////CUM FUNCTIONEAZA LINKED LIST/////////////////
public class LinkedListManual {
    private Node firstNode;
    private Node lastNode;

    public LinkedListManual add(Node node) {
        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.setNext(node);
            lastNode = lastNode.getNext();
        }
        return this;
    }


    public void printList() {
        Node node = firstNode;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }

    }

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(final Node firstNode) {
        this.firstNode = firstNode;
    }
}
