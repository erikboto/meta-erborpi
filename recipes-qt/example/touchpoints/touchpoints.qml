/**
 * This small qml is based on the documentation for MultiPointTouchArea
 */

import QtQuick 2.0

Rectangle {
    width: 800; height: 480
    MultiPointTouchArea {
        anchors.fill: parent
        touchPoints: [
            TouchPoint { id: point1 },
            TouchPoint { id: point2 },
            TouchPoint { id: point3 },
            TouchPoint { id: point4 }
        ]
    }

    Rectangle {
        width: 30; height: 30
        color: "green"
        x: point1.x
        y: point1.y
    }

    Rectangle {
        width: 30; height: 30
        color: "yellow"
        x: point2.x
        y: point2.y
    }

    Rectangle {
        width: 30; height: 30
        color: "blue"
        x: point3.x
        y: point3.y
    }

    Rectangle {
        width: 30; height: 30
        color: "red"
        x: point4.x
        y: point4.y
    }
}
