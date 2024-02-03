package task3;

public  class Register {
    int documentProps = 0;
    private final Document[] documents = new Document[10];

    public void getDocumentProps(Document doc) {
        documents[documentProps] = doc;
        documentProps++;
    }

    public void saveDocument(int documentNum) {
        for (Document doc : documents) {
            if (doc != null && doc.getDocumentProps() == documentNum) {
                System.out.println(documentNum);
                break;
            }
        }
    }

    public void displayAllDocuments() {
        System.out.println("Список документов в регистре:");
        for (int i = 0; i < documentProps; i++) {
            documents[i].getDisplayInfo();
            System.out.println("-------------");
        }
    }
}

