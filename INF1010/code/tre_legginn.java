class BinaryTree {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
	}

	Node root;

	public Node addNode (int key, String name) {
		Node newNode = new Node(key, name);

		if (root == null) {
			root = newNode;
		} else {
			Node focusNode = root;
			Node parent;

			while (true) {
				parent = focusNode;

				if (key < focusNode.key) {
					focusNode = focusNode.left;

					if (focusNode == null) {
						parent.left = newNode;
						return;
					}
				} else {
					focusNode = focusNode.right;

					if (focusNode == null) {
						parent.right = newNode;
						return;
					}
				}
			}
		}
	}
}
