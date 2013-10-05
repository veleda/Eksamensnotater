public boolean remove (int key) {
	Node focusNode = root;
	Node parent = root;

	boolean isItALeft = true;

	while (focusNode.key != key) {
		parent = focusNode;

		if (key < focusNode.key) {
			isItALeft = true;
			focusNode = focusNode.left;
		} else {
			isItALeft = false;
			focusNode = focusNode.right;
		}

		if (focusNode == null)
			return false;
	}

	if (focusNode.left == null && focusNode.right == null) {
		if (focusNode == root)
			root = null;
		else if (isItALeft)
			parent.left = null;
		else
			parent.right = null;
		
	} else if (focusNode.left == null) {
		if (focusNode == root)
			root = focusNode.right;
		else if (isItALeft)
			parent.left = focusNode.right;
		else
			parent.right = focusNode.left;
	} else {
		Node replacement = replace(focusNode);

		if (focusNode == root)
			root = replacement;
		else if (isItALeft)
			parent.left = replacement;
		else 
			parent.right = replacement;

		replacement.left = focusNode.left;
	}
	return true;
}

public Node replace (Node replaceNode) {
	Node replaceParent = replaceNode;
	Node replacement = replaceNode;
	Node focusNode = replaceNode.right;

	while (focus != null) {
		replaceParent = replacement;
		replacement = focusnode;
		focusNode = focusNode.left;
	}

	if (replacement != replaceNode.right) {
		replaceParent.left = replaceNode.right;
		replaceNode.right = replacement.right;
	}
	return replaceNode;
}
