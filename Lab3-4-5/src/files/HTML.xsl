<?xml version="1.0" encoding="UTF-8"?>
    <html>
        <template match="/">
        </template>
        <body style="font-family: Arial; font-size: 12pt; background-color: green">
            <for-each select="Shturmovik">
                <div style="background-color: yellow color: white; padding: 4px">
                    <span style="font-weight: bold">
                        <value-of select="Name"/>
                    </span>
                    <value-of select="salary"/>
                </div>
                <div style="margin-left: 20px; margin-bottom: 1em; font-size: 10pt">
                    <p>
                        <value-of select="level"/>
                        <span style="font-style: italic">
                            <value-of select="oil"/>
                        </span>
                    </p>
                </div>
            </for-each>
        </body>
    </html>
