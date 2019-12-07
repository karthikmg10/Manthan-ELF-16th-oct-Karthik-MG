var selectedColor = 1;
var colors = ["Azure", "BurlyWood", "BlueViolet","Cyan", "DarkTurquoise", "AntiqueWhite"];

    // Function to change webpage background color
    function changeBodyBg(){
    	if(selectedColor ==  colors.length)
    	{
    		selectedColor = 0;
    	}
        document.body.style.background = colors[selectedColor];
        selectedColor = selectedColor+1;
    }