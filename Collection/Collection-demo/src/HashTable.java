public class HashTable {
    private String[] table;
    private int size;

    public HashTable(int capacity){
        table= new String[capacity];
    }

    public boolean hasOccupied(int key){
        return table[key] != null;
    }

    public int hash(String data){
        return data.length() % table.length;
    }

    public void resize(){
        String[] oldTable = table;
        table = new String[oldTable.length *2];
        size = 0;
        for(String data:oldTable){
            if(data != null){
                add(data);
            }
        }
    }

    public int nextIndex(int index){
        return (index + 1) % table.length;
    }
    public void add(String data){
        if(size == table.length) resize();
        int key = hash(data);
        while(hasOccupied(key)){
            key = nextIndex(key);
        }
        table[key] = data;
        size++;
    }

    //fails fast
    public void remove(String data){
        int index = search(data);
        if(index == -1) return;

        table[index] = null;
        for(index = nextIndex(index); hasOccupied(index);index = nextIndex(index)){
            String temp = table[index];
            table[index] = null;
            size--;
            add(temp);
        }
    }

    public int search(String data){
        int index = hash(data);
        int start = index;
        while (hasOccupied(index)){
            if(table[index].equals(data)) return index;
            index = nextIndex(index);
            if(index == start) break;
        }
        return -1;
    }

    public void display(){
        for(int i = 0; i < table.length; i++){
            System.out.println("%d --- %s".formatted(i,table[i]==null?"Null":table[i]));
        }
    }
}
