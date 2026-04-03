package moveandcopy.move.packagenexttoother;

public record RecordToMove() {
    // Very small example instance method
    public String info() {
        return "I am a RecordToMove";
    }

    // Static factory/example usage
    public static RecordToMove example() {
        return new RecordToMove();
    }

}
