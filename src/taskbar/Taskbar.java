package taskbar;

public class Taskbar {

	public static final int TBPF_NOPROGRESS = 0x00000000;
	public static final int TBPF_INDETERMINATE = 0x00000001;
	public static final int TBPF_NORMAL = 0x00000002;
	public static final int TBPF_ERROR = 0x00000004;
	public static final int TBPF_PAUSED = 0x00000008;

	public static native void setProgressState(int hwnd, int tbpFlags);

}
